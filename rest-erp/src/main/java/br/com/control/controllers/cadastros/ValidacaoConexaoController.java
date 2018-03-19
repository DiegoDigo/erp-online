package br.com.control.controllers.cadastros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.control.cadastro.BandaPrecoItemService;
import br.com.control.cadastro.BandaPrecoService;
import br.com.control.cadastro.CanalService;
import br.com.control.cadastro.CategoriaService;
import br.com.control.cadastro.ClienteEnderecoService;
import br.com.control.cadastro.ClienteService;
import br.com.control.cadastro.ComodatoService;
import br.com.control.cadastro.CondicaoPagamentoService;
import br.com.control.cadastro.DetalheComboProdutoService;
import br.com.control.cadastro.FamiliaService;
import br.com.control.cadastro.GrupoService;
import br.com.control.cadastro.HistoricoPedidoCapaService;
import br.com.control.cadastro.HistoricoPedidoItemService;
import br.com.control.cadastro.MarcaService;
import br.com.control.cadastro.MotivoGeralService;
import br.com.control.cadastro.MovimentoFinanceiroService;
import br.com.control.cadastro.NFEChaveService;
import br.com.control.cadastro.OcorrenciaService;
import br.com.control.cadastro.ParocoService;
import br.com.control.cadastro.PedidoItemCortadoService;
import br.com.control.cadastro.PedidoPendenteLiberacaoService;
import br.com.control.cadastro.PedidoSugestaoService;
import br.com.control.cadastro.PrecoService;
import br.com.control.cadastro.ProdutoCanalService;
import br.com.control.cadastro.ProdutoService;
import br.com.control.cadastro.RestricaoFinanceiraItemService;
import br.com.control.cadastro.RestricaoFinanceiraService;
import br.com.control.cadastro.TipoCobrancaClienteService;
import br.com.control.cadastro.TipoEnderecoService;
import br.com.control.cadastro.VendedorClienteService;
import br.com.control.cadastro.VendedorService;
import br.com.control.cadastro.VisitaService;
import br.com.control.cadastro.tipoCobranca.TipoCobrancaService;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.rotas.RotasRest;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.CONEXAO)
public class ValidacaoConexaoController {
	
	@Autowired
	private ParocoService parocoService;

	@Autowired
	private MarcaService marcaService;

	@Autowired
	private GrupoService grupoService;

	@Autowired
	private FamiliaService familiaService;

	@Autowired
	private CategoriaService categoriaService;

	@Autowired
	private ProdutoService produtoService;

	@Autowired
	private CanalService canalService;

	@Autowired
	private PrecoService precoService;

	@Autowired
	private CondicaoPagamentoService condicaoPagamentoService;

	@Autowired
	private TipoCobrancaService tipoCobrancaService;

	@Autowired
	private TipoCobrancaClienteService tipoCobrancaClienteService;

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private TipoEnderecoService tipoEnderecoService;

	@Autowired
	private ClienteEnderecoService clienteEnderecoService;

	@Autowired
	private OcorrenciaService ocorrenciaService;

	@Autowired
	private ComodatoService comodatoService;

	@Autowired
	private MotivoGeralService motivoGeralService;

	@Autowired
	private PedidoSugestaoService pedidoSugestaoService;

	@Autowired
	private HistoricoPedidoCapaService historicoPedidoCapaService;

	@Autowired
	private HistoricoPedidoItemService historicoPedidoItemService;

	@Autowired
	private NFEChaveService nfeChaveService;

	@Autowired
	private MovimentoFinanceiroService movimentoFinanceiroService;

	@Autowired
	private PedidoPendenteLiberacaoService pedidoPendenteLiberacaoService;

	@Autowired
	private BandaPrecoService bandaPrecoService;

	@Autowired
	private BandaPrecoItemService bandaPrecoItemService;

	@Autowired
	private ProdutoCanalService produtoCanalService;
	
	@Autowired
	private VendedorService vendedorService;

	@Autowired
	private VendedorClienteService vendedorClienteService;

	@Autowired
	private RestricaoFinanceiraService restricaoFinanceiraService;
	
	@Autowired
	private RestricaoFinanceiraItemService restricaoFinanceiraItemService;

	@Autowired
	private VisitaService visitaService;

	@Autowired
	private PedidoItemCortadoService itemCortadoService;
	
	@Autowired
	private DetalheComboProdutoService comboService;
	
	@RequestMapping(value = RotasRest.VALIDA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno validar() {
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", "Conexão efetuada com sucesso!", null);
	}

	@RequestMapping(value = RotasRest.DBMAKER, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno dbmaker() {
		Integer count = parocoService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_PAROCO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno paroco() {
		Integer count = parocoService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_MARCA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno marca() {
		Integer count = marcaService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_FAMILIA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno familia() {
		Integer count = familiaService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_GRUPO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno grupo() {
		Integer count = grupoService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_CATEGORIA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno categoria() {
		Integer count = categoriaService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_PRODUTO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno produto() {
		Integer count = produtoService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_CANAL, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno canal() {
		Integer count = canalService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_PRECO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno preco() {
		Integer count = precoService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_CONDICAO_PAGAMENTO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno condicaoPagamento() {
		Integer count = condicaoPagamentoService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_TIPO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno tipoCobranca() {
		Integer count = tipoCobrancaService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_TIPO_COBRANCA_CLIENTE, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno tipoCobrancaCliente() {
		Integer count = tipoCobrancaClienteService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_CLIENTE, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno cliente() {
		Integer count = clienteService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_TIPO_ENDERECO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno tipoEndereco() {
		Integer count = tipoEnderecoService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_ENDERECO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno endereco() {
		Integer count = clienteEnderecoService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_OCORRENCIA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno ocorrencia() {
		Integer count = ocorrenciaService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_COMODATO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno comodato() {
		Integer count = comodatoService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_MOTIVO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno motivo() {
		Integer count = motivoGeralService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_PEDIDO_SUGESTAO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno pedidoSugestao() {
		Integer count = pedidoSugestaoService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_HISTORICO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno historicoCapa() {
		Integer count = historicoPedidoCapaService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}
	
	@RequestMapping(value = RotasRest.RAIZ_HISTORICO_ITEM, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno historicoItem() {
		Integer count = historicoPedidoItemService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_CHAVE_NFE, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno chaveNfe() {
		Integer count = nfeChaveService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_MOVIMENTO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno movimento() {
		Integer count = movimentoFinanceiroService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_PEDIDO_BLOQUEADO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno pedidoBloqueado() {
		Integer count = pedidoPendenteLiberacaoService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_BANDA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno banda() {
		Integer count = bandaPrecoService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_BANDA_ITEM, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno bandaItem() {
		Integer count = bandaPrecoItemService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_PRODUTO_CANAL, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno produtoCanal() {
		Integer count = produtoCanalService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_VENDEDOR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno vendedor() {
		Integer count = vendedorService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_VENDEDOR_CLIENTE, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno vendedorCliente() {
		Integer count = vendedorClienteService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}
	
	@RequestMapping(value = RotasRest.RAIZ_RESTRICAO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno restricao() {
		Integer count = restricaoFinanceiraService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_RESTRICAO_ITEM, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno restricaoItem() {
		Integer count = restricaoFinanceiraItemService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}
	
	
	@RequestMapping(value = RotasRest.RAIZ_VISITAS, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno visitas() {
		visitaService.processarVisitas(90);
		Integer count = visitaService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}

	@RequestMapping(value = RotasRest.RAIZ_CORTADO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno itemCortado() {
		Integer count = itemCortadoService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}
	
	@RequestMapping(value = RotasRest.RAIZ_DETALHE_COMBO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno combo() {
		Integer count = comboService.count();
		return new MensagemRetorno(HttpStatus.OK, "Conexão efetuada com sucesso!", count, null);
	}
	
	
	
}
