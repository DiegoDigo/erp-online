package br.com.control.controllers.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.control.cadastro.FamiliaService;
import br.com.control.cadastro.GrupoService;
import br.com.control.cadastro.sincronismo.SincronismoAcompanhamentoPedidoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.portal.mensageria.to.FamiliaTO;
import br.com.control.portal.mensageria.to.GrupoTO;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.produto.Familia;
import br.com.control.vendas.cadastro.modelo.produto.Grupo;

@RestController
@RequestMapping(RotasRest.SINALIZA)
public class SinalizadorPortalController extends AbstractController {
	
	@Autowired
	private SincronismoAcompanhamentoPedidoService acompanhamentoCapaPedidoService;
	
	@Autowired
	private SincronismoCadastroService sincronismoCadastoService;
	
	@Autowired
	private GrupoService grupoService;
	
	@Autowired
	private FamiliaService familiaService;
	
	@RequestMapping(value = RotasRest.RAIZ_ACOMPANHAMENTO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortal(@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		String codigoPrePedidoErp = mapper.convertValue(mensagem.getConteudo(), new TypeReference<String>() {});
		acompanhamentoCapaPedidoService.enviaParaOPortal(codigoPrePedidoErp);
		return null;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_GRUPO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroGrupo(@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		String codigoGrupoErp = mapper.convertValue(mensagem.getConteudo(), new TypeReference<String>() {});
		Grupo grupo = grupoService.recuperaGrupo(codigoGrupoErp);
		GrupoTO grupoTO = new GrupoTO(grupo);
		
		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Alteração cadastral Grupo", grupoTO, mensagem.getIdentificacao());
		sincronismoCadastoService.enviaParaOPortal(msg);
		return null;
	}
	
	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_FAMILIA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroFamilia(@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		String codigoFamiliaErp = mapper.convertValue(mensagem.getConteudo(), new TypeReference<String>() {});
		Familia familia = familiaService.recuperaFamilia(codigoFamiliaErp);
		FamiliaTO familiaTO = new FamiliaTO(familia);
		
		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Alteração cadastral Família", familiaTO, mensagem.getIdentificacao());
		sincronismoCadastoService.enviaParaOPortal(msg);
		return null;
	}
	
	
	

}
