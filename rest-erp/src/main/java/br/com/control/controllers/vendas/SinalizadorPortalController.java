package br.com.control.controllers.vendas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.control.cadastro.CanalService;
import br.com.control.cadastro.CategoriaService;
import br.com.control.cadastro.CondicaoPagamentoService;
import br.com.control.cadastro.DetalheComboProdutoService;
import br.com.control.cadastro.FamiliaService;
import br.com.control.cadastro.GrupoService;
import br.com.control.cadastro.MarcaService;
import br.com.control.cadastro.OcorrenciaService;
import br.com.control.cadastro.ProdutoService;
import br.com.control.cadastro.sincronismo.SincronismoAcompanhamentoPedidoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.cadastro.tipoCobranca.TipoCobrancaService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.portal.mensageria.to.CanalTO;
import br.com.control.portal.mensageria.to.CategoriaTO;
import br.com.control.portal.mensageria.to.CondicaoPagamentoTO;
import br.com.control.portal.mensageria.to.DetalheComboProdutoTO;
import br.com.control.portal.mensageria.to.FamiliaTO;
import br.com.control.portal.mensageria.to.GrupoTO;
import br.com.control.portal.mensageria.to.MarcaTO;
import br.com.control.portal.mensageria.to.OcorrenciaTO;
import br.com.control.portal.mensageria.to.ProdutoTO;
import br.com.control.portal.mensageria.to.TipoCobrancaTO;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.canal.Canal;
import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;
import br.com.control.vendas.cadastro.modelo.ocorrencia.Ocorrencia;
import br.com.control.vendas.cadastro.modelo.produto.Categoria;
import br.com.control.vendas.cadastro.modelo.produto.DetalheComboProduto;
import br.com.control.vendas.cadastro.modelo.produto.Familia;
import br.com.control.vendas.cadastro.modelo.produto.Grupo;
import br.com.control.vendas.cadastro.modelo.produto.Marca;
import br.com.control.vendas.cadastro.modelo.produto.Produto;
import br.com.control.vendas.cadastro.modelo.tipoCobranca.TipoCobranca;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.SINALIZA)
public class SinalizadorPortalController extends AbstractController {

	@Autowired
	private SincronismoAcompanhamentoPedidoService acompanhamentoCapaPedidoService;

	@Autowired
	private SincronismoCadastroService sincronismoCadastoService;

	@Autowired
	private GrupoService grupoService;

	@Autowired
	private FamiliaService familiaService;

	@Autowired
	private MarcaService marcaService;

	@Autowired
	private CategoriaService categoriaService;

	@Autowired
	private ProdutoService produtoService;

	@Autowired
	private CanalService canalService;

	@Autowired
	private TipoCobrancaService tipoCobrancaService;
	
	@Autowired
	private DetalheComboProdutoService detalheProdutoComboService;

	@Autowired
	private CondicaoPagamentoService condicaoPagamentoService;

	@Autowired
	private OcorrenciaService ocorrenciaService;

	@RequestMapping(value = RotasRest.RAIZ_ACOMPANHAMENTO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortal(@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		String codigoPrePedidoErp = mapper.convertValue(mensagem.getConteudo(), new TypeReference<String>() {
		});
		acompanhamentoCapaPedidoService.enviaParaOPortal(codigoPrePedidoErp);
		return null;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_GRUPO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroGrupo(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		String codigoGrupoErp = mapper.convertValue(mensagem.getConteudo(), new TypeReference<String>() {
		});
		Grupo grupo = grupoService.recuperaGrupo(codigoGrupoErp);
		GrupoTO grupoTO = new GrupoTO(grupo);

		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Alteração cadastral Grupo", grupoTO,
				mensagem.getIdentificacao());
		sincronismoCadastoService.enviaParaOPortal(msg);
		return null;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_FAMILIA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroFamilia(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		String codigoFamiliaErp = mapper.convertValue(mensagem.getConteudo(), new TypeReference<String>() {
		});
		Familia familia = familiaService.recuperaFamilia(codigoFamiliaErp);
		FamiliaTO familiaTO = new FamiliaTO(familia);

		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Alteração cadastral Família", familiaTO,
				mensagem.getIdentificacao());
		sincronismoCadastoService.enviaParaOPortal(msg);
		return null;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_MARCA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroMarca(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		String codigoMarcaErp = mapper.convertValue(mensagem.getConteudo(), new TypeReference<String>() {
		});
		Marca marca = marcaService.recuperaMarca(codigoMarcaErp);
		MarcaTO marcaTO = new MarcaTO(marca);

		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Alteração cadastral Marca", marcaTO,
				mensagem.getIdentificacao());
		sincronismoCadastoService.enviaParaOPortal(msg);
		return null;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_CATEGORIA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroCategoria(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		String codigoCategoriaErp = mapper.convertValue(mensagem.getConteudo(), new TypeReference<String>() {
		});
		Categoria categoria = categoriaService.recuperaCategoria(codigoCategoriaErp);
		CategoriaTO categoriaTO = new CategoriaTO(categoria);

		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Alteração cadastral Categoria", categoriaTO,
				mensagem.getIdentificacao());
		sincronismoCadastoService.enviaParaOPortal(msg);
		return null;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_CANAL, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroCanal(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		String codigoCanalErp = mapper.convertValue(mensagem.getConteudo(), new TypeReference<String>() {
		});

		Canal canal = canalService.recuperaCanal(codigoCanalErp);
		CanalTO canalTO = new CanalTO(canal);

		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Alteração cadastral Canal", canalTO,
				mensagem.getIdentificacao());
		sincronismoCadastoService.enviaParaOPortal(msg);
		return null;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_PRODUTO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroProduto(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		String codigoProdutoErp = mapper.convertValue(mensagem.getConteudo(), new TypeReference<String>() {
		});

		Produto produto = produtoService.recuperarProduto(codigoProdutoErp);
		ProdutoTO produtoTO = new ProdutoTO(produto);

		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Alteração cadastral Produto", produtoTO,
				mensagem.getIdentificacao());
		sincronismoCadastoService.enviaParaOPortal(msg);
		return null;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_TIPO
			+ RotasRest.RAIZ_COBRANCA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroTipoCobranca(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		String codigoTipoCobrancaErp = mapper.convertValue(mensagem.getConteudo(), new TypeReference<String>() {
		});

		TipoCobranca tipoCobranca = tipoCobrancaService.recuperarTipoCobranca(codigoTipoCobrancaErp);
		TipoCobrancaTO tipoCobrancaTO = new TipoCobrancaTO(tipoCobranca);

		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Alteração cadastral Tipo de Cobrança", tipoCobrancaTO,
				mensagem.getIdentificacao());
		sincronismoCadastoService.enviaParaOPortal(msg);
		return null;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_CONDICAO_PAGAMENTO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroCondicaoPagamento(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		String codigoCondicaoPagamentoErp = mapper.convertValue(mensagem.getConteudo(), new TypeReference<String>() {
		});

		CondicaoPagamento condicaoPagamento = condicaoPagamentoService
				.recuperarCondicaoPagamento(codigoCondicaoPagamentoErp);
		CondicaoPagamentoTO condicaoPagamentoTO = new CondicaoPagamentoTO(condicaoPagamento);

		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Alteração cadastral Condição de Pagamento",
				condicaoPagamentoTO, mensagem.getIdentificacao());
		sincronismoCadastoService.enviaParaOPortal(msg);
		return null;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_OCORRENCIA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroOcorrencia(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		String codigoOcorrenciaErp = mapper.convertValue(mensagem.getConteudo(), new TypeReference<String>() {
		});

		Ocorrencia ocorrencia = ocorrenciaService.recuperarOcorrencia(codigoOcorrenciaErp);
		OcorrenciaTO ocorrenciaTO = new OcorrenciaTO(ocorrencia);

		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Alteração cadastral Ocorrência", ocorrenciaTO,
				mensagem.getIdentificacao());
		sincronismoCadastoService.enviaParaOPortal(msg);
		return null;
	}
	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_DETALHE_COMBO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroDetalheProdutoCombo(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		String codigoProdutoComboErp = mapper.convertValue(mensagem.getConteudo(), new TypeReference<String>() {
		});
		
		List<DetalheComboProdutoTO> combosProdutoTO= new ArrayList<>();
		
		List<DetalheComboProduto> comboProduto = detalheProdutoComboService.recuperarComboProduto(codigoProdutoComboErp);
		
		for (DetalheComboProduto detalheComboProduto : comboProduto) {
			combosProdutoTO.add(new DetalheComboProdutoTO(detalheComboProduto));
		}
		
		
		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Alteração cadastral Detalhe combo produto", combosProdutoTO,
				mensagem.getIdentificacao());
		sincronismoCadastoService.enviaParaOPortal(msg);
		return null;
	}

}
