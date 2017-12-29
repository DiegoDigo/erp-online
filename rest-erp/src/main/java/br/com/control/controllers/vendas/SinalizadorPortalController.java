package br.com.control.controllers.vendas;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
import br.com.control.cadastro.MovimentoFinanceiroService;
import br.com.control.cadastro.OcorrenciaService;
import br.com.control.cadastro.ParocoService;
import br.com.control.cadastro.PedidoItemCortadoService;
import br.com.control.cadastro.PedidoPendenteLiberacaoService;
import br.com.control.cadastro.PedidoSugestaoService;
import br.com.control.cadastro.PrecoService;
import br.com.control.cadastro.ProdutoService;
import br.com.control.cadastro.RestricaoFinanceiraItemService;
import br.com.control.cadastro.RestricaoFinanceiraService;
import br.com.control.cadastro.SinalizadorPortalService;
import br.com.control.cadastro.TipoCobrancaClienteService;
import br.com.control.cadastro.TipoEnderecoService;
import br.com.control.cadastro.VendedorClienteService;
import br.com.control.cadastro.VendedorService;
import br.com.control.cadastro.VisitaService;
import br.com.control.cadastro.sincronismo.SincronismoAcompanhamentoPedidoService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.cadastro.tipoCobranca.TipoCobrancaService;
import br.com.control.controllers.AbstractController;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.portal.mensageria.to.BandaPrecoItemTO;
import br.com.control.portal.mensageria.to.BandaPrecoTO;
import br.com.control.portal.mensageria.to.CanalTO;
import br.com.control.portal.mensageria.to.CategoriaTO;
import br.com.control.portal.mensageria.to.ClienteEnderecoTO;
import br.com.control.portal.mensageria.to.ClienteTO;
import br.com.control.portal.mensageria.to.ComodatoTO;
import br.com.control.portal.mensageria.to.CondicaoPagamentoTO;
import br.com.control.portal.mensageria.to.DetalheComboProdutoTO;
import br.com.control.portal.mensageria.to.FamiliaTO;
import br.com.control.portal.mensageria.to.GrupoTO;
import br.com.control.portal.mensageria.to.HistoricoPedidoCapaTO;
import br.com.control.portal.mensageria.to.HistoricoPedidoItemTO;
import br.com.control.portal.mensageria.to.MarcaTO;
import br.com.control.portal.mensageria.to.MovimentoFinanceiroTO;
import br.com.control.portal.mensageria.to.OcorrenciaTO;
import br.com.control.portal.mensageria.to.ParocoTO;
import br.com.control.portal.mensageria.to.PedidoItemCortadoTO;
import br.com.control.portal.mensageria.to.PedidoPendenteLiberacaoTO;
import br.com.control.portal.mensageria.to.PedidoSugestaoTO;
import br.com.control.portal.mensageria.to.PrecoTO;
import br.com.control.portal.mensageria.to.ProdutoTO;
import br.com.control.portal.mensageria.to.RestricaoFinanceiraItemTO;
import br.com.control.portal.mensageria.to.RestricaoFinanceiraTO;
import br.com.control.portal.mensageria.to.TipoCobrancaClienteTO;
import br.com.control.portal.mensageria.to.TipoCobrancaTO;
import br.com.control.portal.mensageria.to.TipoEnderecoTO;
import br.com.control.portal.mensageria.to.VendedorClienteTO;
import br.com.control.portal.mensageria.to.VendedorTO;
import br.com.control.portal.mensageria.to.VisitaTO;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.Comodato;
import br.com.control.vendas.cadastro.modelo.MovimentoFinanceiro;
import br.com.control.vendas.cadastro.modelo.RestricaoFinanceira;
import br.com.control.vendas.cadastro.modelo.RestricaoFinanceiraItem;
import br.com.control.vendas.cadastro.modelo.canal.Canal;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;
import br.com.control.vendas.cadastro.modelo.cliente.ClienteEndereco;
import br.com.control.vendas.cadastro.modelo.cliente.TipoCobrancaCliente;
import br.com.control.vendas.cadastro.modelo.cliente.TipoEndereco;
import br.com.control.vendas.cadastro.modelo.cliente.Visita;
import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;
import br.com.control.vendas.cadastro.modelo.ocorrencia.Ocorrencia;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoCapa;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoItem;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoItemCortado;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoPendenteLiberacao;
import br.com.control.vendas.cadastro.modelo.pedido.PedidoSugestao;
import br.com.control.vendas.cadastro.modelo.preco.BandaPreco;
import br.com.control.vendas.cadastro.modelo.preco.BandaPrecoItem;
import br.com.control.vendas.cadastro.modelo.preco.Preco;
import br.com.control.vendas.cadastro.modelo.produto.Categoria;
import br.com.control.vendas.cadastro.modelo.produto.DetalheComboProduto;
import br.com.control.vendas.cadastro.modelo.produto.Familia;
import br.com.control.vendas.cadastro.modelo.produto.Grupo;
import br.com.control.vendas.cadastro.modelo.produto.Marca;
import br.com.control.vendas.cadastro.modelo.produto.Paroco;
import br.com.control.vendas.cadastro.modelo.produto.Produto;
import br.com.control.vendas.cadastro.modelo.tipoCobranca.TipoCobranca;
import br.com.control.vendas.cadastro.modelo.vendedor.Vendedor;
import br.com.control.vendas.cadastro.modelo.vendedor.VendedorCliente;

@RestController
@RequestMapping(RotasRest.RAIZ + RotasRest.SINALIZA)
public class SinalizadorPortalController extends AbstractController {

	private static final Logger logger = LoggerFactory.getLogger(SinalizadorPortalController.class);

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

	@Autowired
	private ClienteEnderecoService clienteEnderecoServico;

	@Autowired
	private VendedorClienteService vendedorClienteService;

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private VendedorService vendedorService;

	@Autowired
	private TipoEnderecoService tipoEnderecoService;

	@Autowired
	private TipoCobrancaClienteService tipoCobrancaClienteService;

	@Autowired
	private SinalizadorPortalService sinalizadorPortalService;

	@Autowired
	private MovimentoFinanceiroService movimentoFinanceiroService;

	@Autowired
	private ComodatoService comodatoService;

	@Autowired
	private HistoricoPedidoCapaService historicoPedidoCapaService;

	@Autowired
	private HistoricoPedidoItemService historicoPedidoItemService;

	@Autowired
	private BandaPrecoService bandaPrecoService;

	@Autowired
	private BandaPrecoItemService bandaPrecoItemService;

	@Autowired
	private PedidoSugestaoService pedidoSugestaoService;

	@Autowired
	private PedidoPendenteLiberacaoService pedidoPendenteLiberacaoService;

	@Autowired
	private ParocoService parocoService;

	@Autowired
	private PedidoItemCortadoService pedidoItemCortadoService;

	@Autowired
	private PrecoService precoService;

	@Autowired
	private VisitaService visitaService;

	@Autowired
	private RestricaoFinanceiraService restricaoFinanceiraService;

	@Autowired
	private RestricaoFinanceiraItemService restricaoFinanceiraItemService;

	@RequestMapping(value = RotasRest.RAIZ_ACOMPANHAMENTO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortal(@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		logger.info("### SINALIZADOR -> ACOMPANHAMENTO DE PEDIDO ###");
		String codigoErp = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoErp);
		logger.info("------------------------------------------------------");
		acompanhamentoCapaPedidoService.enviaParaOPortal(codigoErp);
		return null;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_GRUPO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroGrupo(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> GRUPO PRODUTO ###");

		String codigoGrupo = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoGrupo);
		logger.info("------------------------------------------------------");
		Grupo grupo = grupoService.recuperaGrupo(codigoGrupo);

		if (grupo == null) {
			String msg = "Grupo com codigo: " + codigoGrupo + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		GrupoTO grupoTO = new GrupoTO(grupo);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, grupoTO, "Grupo");

	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_FAMILIA, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroFamilia(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> FAMILIA PRODUTO ###");

		String codigoFamilia = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoFamilia);
		logger.info("------------------------------------------------------");
		Familia familia = familiaService.recuperaFamilia(codigoFamilia);

		if (familia == null) {
			String msg = "Familia com codigo: " + codigoFamilia + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		FamiliaTO familiaTO = new FamiliaTO(familia);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, familiaTO, "Familia");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_MARCA, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroMarca(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> MARCA PRODUTO ###");
		String codigoMarca = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoMarca);
		logger.info("------------------------------------------------------");

		Marca marca = marcaService.recuperaMarca(codigoMarca);

		if (marca == null) {
			String msg = "Marca com codigo: " + codigoMarca + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		MarcaTO marcaTO = new MarcaTO(marca);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, marcaTO, "Marca");

	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_CATEGORIA, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroCategoria(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> CATEGORIA PRODUTO ###");

		String codigoCategoria = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoCategoria);
		logger.info("------------------------------------------------------");
		Categoria categoria = categoriaService.recuperaCategoria(codigoCategoria);

		if (categoria == null) {
			String msg = "Categoria com codigo: " + codigoCategoria + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		CategoriaTO categoriaTO = new CategoriaTO(categoria);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, categoriaTO, "Categoria");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_CANAL, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroCanal(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> CANAL ###");

		String codigoCanal = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoCanal);
		logger.info("------------------------------------------------------");
		Canal canal = canalService.recuperaCanal(codigoCanal);

		if (canal == null) {
			String msg = "Canal com codigo: " + codigoCanal + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		CanalTO canalTO = new CanalTO(canal);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, canalTO, "Canal");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_PRODUTO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroProduto(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> PRODUTO ###");

		String codigoProduto = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoProduto);
		logger.info("------------------------------------------------------");

		Produto produto = produtoService.recuperaProduto(codigoProduto);

		if (produto == null) {
			String msg = "Produto com codigo: " + codigoProduto + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		ProdutoTO produtoTO = new ProdutoTO(produto);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, produtoTO, "Produto");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_TIPO
			+ RotasRest.RAIZ_COBRANCA, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroTipoCobranca(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> TIPO COBRANCA ###");

		String codigoTipoCobranca = sinalizadorPortalService.retornaCodigoERP(mensagem);

		logger.info("--> codigo passado pelo sinalizador: " + codigoTipoCobranca);
		logger.info("------------------------------------------------------");
		TipoCobranca tipoCobranca = tipoCobrancaService.recuperarTipoCobranca(codigoTipoCobranca);

		if (tipoCobranca == null) {
			String msg = "Tipo Cobranca com codigo: " + codigoTipoCobranca + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		TipoCobrancaTO tipoCobrancaTO = new TipoCobrancaTO(tipoCobranca);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, tipoCobrancaTO, "Tipo Cobrança");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_CONDICAO_PAGAMENTO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroCondicaoPagamento(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> CONDICAO PAGAMENTO ###");

		String codigoCondicaoPagamento = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoCondicaoPagamento);
		logger.info("------------------------------------------------------");
		CondicaoPagamento condicaoPagamento = condicaoPagamentoService
				.recuperarCondicaoPagamento(codigoCondicaoPagamento);

		if (condicaoPagamento == null) {
			String msg = "Condicao Pagamento com codigo: " + codigoCondicaoPagamento + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		CondicaoPagamentoTO condicaoPagamentoTO = new CondicaoPagamentoTO(condicaoPagamento);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, condicaoPagamentoTO, "Condições de Pagemanto");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_PEDIDO
			+ RotasRest.RAIZ_SUGESTAO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroPedidoSugestao(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> PEDIDOS SUGESTAO ###");
		List<PedidoSugestao> sugestoes = pedidoSugestaoService.listar();
		List<PedidoSugestaoTO> pedidosSugestaoTO = new ArrayList<>();
		for (PedidoSugestao pedidoSugestao : sugestoes) {
			pedidosSugestaoTO.add(new PedidoSugestaoTO(pedidoSugestao));
		}

		return sincronismoCadastoService.enviaParaOPortal(mensagem, pedidosSugestaoTO, "Pedidos Sugestao");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_OCORRENCIA, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroOcorrencia(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> OCORRENCIA");

		String codigoOcorrencia = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoOcorrencia);
		logger.info("------------------------------------------------------");
		Ocorrencia ocorrencia = ocorrenciaService.recuperarOcorrencia(codigoOcorrencia);

		if (ocorrencia == null) {
			String msg = "Ocorrencia com codigo: " + codigoOcorrencia + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		OcorrenciaTO ocorrenciaTO = new OcorrenciaTO(ocorrencia);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, ocorrenciaTO, "Ocorrência");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_PEDIDO
			+ RotasRest.RAIZ_BLOQUEADO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroPedidoBloqueado(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> PEDIDO BLOQUEADO ###");

		String codigoPedido = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoPedido);
		logger.info("------------------------------------------------------");
		PedidoPendenteLiberacao pedidoPendenteLiberacao = pedidoPendenteLiberacaoService
				.recuperarPedidoPendenteLiberacao(codigoPedido);

		if (pedidoPendenteLiberacao == null) {
			String msg = "Pedido com codigo: " + codigoPedido + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		PedidoPendenteLiberacaoTO pedidoPendenteLiberacaoTO = new PedidoPendenteLiberacaoTO(pedidoPendenteLiberacao);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, pedidoPendenteLiberacaoTO,
				"Pedido Pendente Liberação");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_DETALHE_COMBO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroDetalheProdutoCombo(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> COMBO ###");

		List<DetalheComboProdutoTO> combosProdutoTO = new ArrayList<>();

		String codigoCombo = sinalizadorPortalService.retornaCodigoERP(mensagem);

		logger.info("--> codigo passado pelo sinalizador: " + codigoCombo);
		List<DetalheComboProduto> comboProduto = detalheProdutoComboService.recuperarComboProduto(codigoCombo);
		logger.info("--> combos encontrados: " + comboProduto.size());
		logger.info("------------------------------------------------------");

		if (comboProduto == null || comboProduto.isEmpty()) {
			String msg = "Combo Produto com codigo: " + codigoCombo + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		for (DetalheComboProduto detalheComboProduto : comboProduto) {
			combosProdutoTO.add(new DetalheComboProdutoTO(detalheComboProduto));
		}

		return sincronismoCadastoService.enviaParaOPortal(mensagem, combosProdutoTO, "Detalhe combo produto");

	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_CLIENTE
			+ RotasRest.RAIZ_ENDERECO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroOrigemLogradouro(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> CLIENTE ENDERECO ###");

		List<ClienteEnderecoTO> clienteEnderecoTOs = new ArrayList<>();

		String codigoClienteEndereco = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoClienteEndereco);
		logger.info("------------------------------------------------------");
		List<ClienteEndereco> clienteEnderecos = clienteEnderecoServico
				.recuperarTipoEnderecoCodigoERP(codigoClienteEndereco);

		if (clienteEnderecos == null || clienteEnderecos.isEmpty()) {
			String msg = "Cliente Endereco com codigo: " + codigoClienteEndereco + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		for (ClienteEndereco clienteEndereco : clienteEnderecos) {
			clienteEnderecoTOs.add(new ClienteEnderecoTO(clienteEndereco));
		}

		return sincronismoCadastoService.enviaParaOPortal(mensagem, clienteEnderecoTOs, "Cliente Endereco");

	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_VENDEDOR, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroVendedor(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> VENDEDOR");

		String codigoVendedor = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoVendedor);
		logger.info("------------------------------------------------------");
		Vendedor vendedor = vendedorService.recuperarVendedor(codigoVendedor);

		if (vendedor == null) {
			String msg = "Vendedor com codigo: " + codigoVendedor + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		VendedorTO vendedorTO = new VendedorTO(vendedor);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, vendedorTO, "Vendedor");

	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_PRECO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroTabelaPreco(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> TABELA PRECO ###");
		String codigoTabelaPrecoProdutoErp = sinalizadorPortalService.retornaCodigoERP(mensagem);

		logger.info("--> codigo passado pelo sinalizador: " + codigoTabelaPrecoProdutoErp);
		logger.info("------------------------------------------------------");
		Preco preco = precoService.recuperarTabelaPreco(codigoTabelaPrecoProdutoErp);

		if (preco == null) {
			String msg = "Preco Produto com codigo: " + codigoTabelaPrecoProdutoErp + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		PrecoTO precoTO = new PrecoTO(preco);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, precoTO, "Preco");

	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_CLIENTE
			+ RotasRest.RAIZ_VENDEDOR, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroClienteVendedor(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> CLIENTE VENDEDOR ###");

		String codigoVendedorCliente = sinalizadorPortalService.retornaCodigoERP(mensagem);

		logger.info("--> codigo passado pelo sinalizador: " + codigoVendedorCliente);
		logger.info("------------------------------------------------------");
		List<VendedorCliente> vendedorClientes = vendedorClienteService
				.recuperarClientesVendedor(codigoVendedorCliente);

		if (vendedorClientes == null || vendedorClientes.isEmpty()) {
			String msg = "Vendedor Cliente com codigo: " + codigoVendedorCliente + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		List<VendedorClienteTO> vendedorClientesTO = new ArrayList<VendedorClienteTO>();

		for (VendedorCliente vendedorCliente : vendedorClientes) {
			vendedorClientesTO.add(new VendedorClienteTO(vendedorCliente));
		}

		return sincronismoCadastoService.enviaParaOPortal(mensagem, vendedorClientesTO, "Vendedor do Cliente");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_CLIENTE, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroCliente(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> CLIENTE ###");

		String codigoCliente = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoCliente);
		logger.info("------------------------------------------------------");
		Cliente cliente = clienteService.recuperarCliente(Integer.valueOf(codigoCliente));

		if (cliente == null) {
			String msg = "Cliente com codigo: " + codigoCliente + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		ClienteTO clienteTO = new ClienteTO(cliente);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, clienteTO, "Cliente");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_TIPO
			+ RotasRest.RAIZ_ENDERECO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroTipoEndereco(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> TIPO ENDERECO ###");

		String codigoTipoEndereco = sinalizadorPortalService.retornaCodigoERP(mensagem);

		logger.info("--> codigo passado pelo sinalizador: " + codigoTipoEndereco);
		logger.info("------------------------------------------------------");
		TipoEndereco tipoEndereco = tipoEnderecoService.recuperarTipoEndereco(codigoTipoEndereco);

		if (tipoEndereco == null) {
			String msg = "Tipo Endereço com codigo: " + codigoTipoEndereco + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		TipoEnderecoTO tipoEnderecoTO = new TipoEnderecoTO(tipoEndereco);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, tipoEnderecoTO, "Tipo de Endereço");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_TIPO + RotasRest.RAIZ_COBRANCA
			+ RotasRest.RAIZ_CLIENTE, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroTipoCobrancaCliente(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> TIPO COBRANCA CLIENTE ###");

		String codigoTipoCobrancaCliente = sinalizadorPortalService.retornaCodigoERP(mensagem);

		logger.info("--> codigo passado pelo sinalizador: " + codigoTipoCobrancaCliente);
		logger.info("------------------------------------------------------");
		TipoCobrancaCliente tipoCobrancaCliente = tipoCobrancaClienteService
				.recuperarTipoCobrancaCliente(codigoTipoCobrancaCliente);

		if (tipoCobrancaCliente == null) {
			String msg = "Tipo Cobranca Cliente com codigo: " + codigoTipoCobrancaCliente
					+ " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		TipoCobrancaClienteTO tipoCobrancaClienteTO = new TipoCobrancaClienteTO(tipoCobrancaCliente);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, tipoCobrancaClienteTO, "Tipo de Cobrança Cliente");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_MOTIVO
			+ RotasRest.RAIZ_FINANCEIRO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroMovimentoFinanceiro(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> MOVIMENTO FINANCEIRO ###");

		String codigoMovimentoFinanceiro = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoMovimentoFinanceiro);
		logger.info("------------------------------------------------------");
		MovimentoFinanceiro movimentoFinanceiroBase = movimentoFinanceiroService
				.buscarMovimentoFinanceiro(Integer.valueOf(codigoMovimentoFinanceiro));

		if (movimentoFinanceiroBase == null) {
			String msg = "Movimento Financeiro com codigo: " + codigoMovimentoFinanceiro
					+ " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		MovimentoFinanceiroTO movimentoFinanceiroTO = new MovimentoFinanceiroTO(movimentoFinanceiroBase);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, movimentoFinanceiroTO, "Movimento Financeiro");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_COMODATO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoComodato(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> COMODATO ###");

		String codigoComodato = sinalizadorPortalService.retornaCodigoERP(mensagem);

		logger.info("--> codigo passado pelo sinalizador: " + codigoComodato);
		logger.info("------------------------------------------------------");
		Comodato comodatoBase = comodatoService.listarComodato(codigoComodato);

		if (comodatoBase == null) {
			String msg = "Comodato com codigo: " + codigoComodato + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		ComodatoTO comodatoTO = new ComodatoTO(comodatoBase);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, comodatoTO, "Comodato");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_HISTORICO + RotasRest.RAIZ_PEDIDO
			+ RotasRest.RAIZ_CAPA, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoHistoricoPedidoCapa(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> HISTORICO PEDIDO CAPA ###");

		String codigoHistoricoPedidoCapa = sinalizadorPortalService.retornaCodigoERP(mensagem);

		logger.info("--> codigo passado pelo sinalizador: " + codigoHistoricoPedidoCapa);
		logger.info("------------------------------------------------------");
		HistoricoPedidoCapa historioPedidoCapa = historicoPedidoCapaService
				.buscarHistoricoCapa(codigoHistoricoPedidoCapa);

		if (historioPedidoCapa == null) {
			String msg = "Historico Pedido Capa com codigo: " + codigoHistoricoPedidoCapa
					+ " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		HistoricoPedidoCapaTO historicoPedidoCapaTO = new HistoricoPedidoCapaTO(historioPedidoCapa);
		// sincronismoCadastoService.enviaParaOPortal(mensagem,
		// historicoPedidoCapaTO, "Historico Pedido Capa");

		String codigoHistoricoPedidoItem = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoHistoricoPedidoItem);
		logger.info("------------------------------------------------------");
		List<HistoricoPedidoItem> historicoPedidoItens = historicoPedidoItemService
				.buscarItemPedido(codigoHistoricoPedidoItem);

		if (codigoHistoricoPedidoItem == null || codigoHistoricoPedidoItem.isEmpty()) {
			String msg = "Historico Pedido Item com codigo: " + codigoHistoricoPedidoItem
					+ " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		List<HistoricoPedidoItemTO> historicoPedidoItensTO = new ArrayList<>();

		for (HistoricoPedidoItem historicoPedidoItem : historicoPedidoItens) {
			HistoricoPedidoItemTO historicoPedidoItemTO = new HistoricoPedidoItemTO(historicoPedidoItem);

			historicoPedidoItensTO.add(historicoPedidoItemTO);
		}

		historicoPedidoCapaTO.setHistoricoPedidoItens(historicoPedidoItensTO);

		MensagemRetorno enviaParaOPortal = sincronismoCadastoService.enviaParaOPortal(mensagem, historicoPedidoCapaTO,
				"Historico Pedido Capa");

		return enviaParaOPortal;

	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_BANDA + RotasRest.RAIZ_PRECO
			+ RotasRest.RAIZ_CAPA, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoBandaPrecoCapa(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		List<BandaPrecoItemTO> bandaPrecoItensTO = new ArrayList<>();

		logger.info("### SINALIZADOR -> BANDA PRECO CAPA ###");

		String codigoBandaPreco = sinalizadorPortalService.retornaCodigoERP(mensagem);

		logger.info("--> codigo passado pelo sinalizador: " + codigoBandaPreco);
		logger.info("------------------------------------------------------");
		BandaPreco bandaPreco = bandaPrecoService.buscarBanda(codigoBandaPreco);

		if (bandaPreco == null) {
			String msg = "Banda Preco com codigo: " + codigoBandaPreco + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		BandaPrecoTO bandaPrecoTo = new BandaPrecoTO(bandaPreco);

		String codigoBandaPrecoItem = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("--> codigo passado pelo sinalizador: " + codigoBandaPrecoItem);
		logger.info("------------------------------------------------------");
		List<BandaPrecoItem> bandaPrecoItens = bandaPrecoItemService
				.buscaBandaPrecoItem(Integer.parseInt(codigoBandaPrecoItem));

		if (codigoBandaPrecoItem == null || codigoBandaPrecoItem.isEmpty()) {
			String msg = "Banda Preco Item com codigo: " + codigoBandaPrecoItem + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		for (BandaPrecoItem bandaPrecoItem : bandaPrecoItens) {
			BandaPrecoItemTO bandaPrecoItemTO = new BandaPrecoItemTO(bandaPrecoItem);
			bandaPrecoItensTO.add(bandaPrecoItemTO);
		}

		bandaPrecoTo.setBandaItens(bandaPrecoItensTO);

		MensagemRetorno enviaParaOPortal = sincronismoCadastoService.enviaParaOPortal(mensagem, bandaPrecoTo,
				"Banda Preço");

		return enviaParaOPortal;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_PAROCO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoParoco(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> CADASTRO PAROCO ###");

		String codigoParocoErp = sinalizadorPortalService.retornaCodigoERP(mensagem);

		logger.info("--> codigo passado pelo sinalizador: " + codigoParocoErp);
		logger.info("------------------------------------------------------");

		Paroco paroco = parocoService.recuperaParoco(codigoParocoErp);

		if (paroco == null) {
			String msg = "Paroco com codigo: " + codigoParocoErp + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		ParocoTO parocoTo = new ParocoTO(paroco);

		MensagemRetorno enviaParaOPortal = sincronismoCadastoService.enviaParaOPortal(mensagem, parocoTo, "Paroco");

		return enviaParaOPortal;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_PEDIDO + RotasRest.RAIZ_ITEM
			+ RotasRest.RAIZ_CORTADO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoPedidoItemCortado(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> ITENS CORTADOS ###");

		String numeroPrepedido = sinalizadorPortalService.retornaCodigoERP(mensagem);

		logger.info("--> Pré-Pedido: " + numeroPrepedido);
		logger.info("------------------------------------------------------");

		List<PedidoItemCortado> itensCortados = pedidoItemCortadoService.recuperarItensCordados(numeroPrepedido);

		if (itensCortados == null) {
			String msg = "Paroco com codigo: " + numeroPrepedido + " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		List<PedidoItemCortadoTO> itensCortadosTO = new ArrayList<>();
		for (PedidoItemCortado pedidoItemCortado : itensCortados) {
			PedidoItemCortadoTO itemCortadoTO = new PedidoItemCortadoTO(pedidoItemCortado);
			itensCortadosTO.add(itemCortadoTO);
		}

		MensagemRetorno enviaParaOPortal = sincronismoCadastoService.enviaParaOPortal(mensagem, itensCortadosTO,
				"Itens Cortados");

		return enviaParaOPortal;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_VISITAS, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroVisitas(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> VISITAS ###");

		String numeroPasta = sinalizadorPortalService.retornaCodigoERP(mensagem);

		logger.info("--> número pasta erp: " + numeroPasta);
		logger.info("------------------------------------------------------");
		List<Visita> diasVisitas = visitaService.recuperaPorPasta(Integer.parseInt(numeroPasta));

		if (diasVisitas.isEmpty()) {
			String msg = "Não forma encontrados dias de visita para a pasta com codigo: " + numeroPasta
					+ " no DBMaker!";
			logger.warn(msg);
			return null;
		}
		List<VisitaTO> visitas = new ArrayList<>();
		for (Visita visita : diasVisitas) {
			VisitaTO visitaTO = new VisitaTO(visita);
			visitas.add(visitaTO);
		}

		return sincronismoCadastoService.enviaParaOPortal(mensagem, visitas, "Tipo de Cobrança Cliente");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_RESTRICAO
			+ RotasRest.RAIZ_FINANCEIRA, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoRestricaoFinanceira(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		List<RestricaoFinanceiraItemTO> restricaoFinanceiraItensTO = new ArrayList<>();

		logger.info("### SINALIZADOR -> RESTRICAO FINANCEIRA ###");

		String codigoRestricaoFinanceiraErp = sinalizadorPortalService.retornaCodigoERP(mensagem);

		logger.info("--> codigo restricao erp: " + codigoRestricaoFinanceiraErp);
		logger.info("------------------------------------------------------");
		RestricaoFinanceira restricaoFinanceira = restricaoFinanceiraService
				.buscarPorCodigoErp(codigoRestricaoFinanceiraErp);

		if (restricaoFinanceira == null) {
			String msg = "Restricao Financeira com codigo: " + codigoRestricaoFinanceiraErp
					+ " nao encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		RestricaoFinanceiraTO restricaoFinanceiraTo = new RestricaoFinanceiraTO(restricaoFinanceira);

		logger.info("--> codigo erp: " + codigoRestricaoFinanceiraErp);
		logger.info("------------------------------------------------------");
		List<RestricaoFinanceiraItem> restricaoFinanceiraItens = restricaoFinanceiraItemService
				.buscarPorCodigoErp(codigoRestricaoFinanceiraErp);

		if (restricaoFinanceira == null || restricaoFinanceiraItens.isEmpty()) {
			String msg = "Não encontramos Itens de Restrição Financeira para: " + codigoRestricaoFinanceiraErp
					+ " no DBMaker!";
			logger.warn(msg);
			return null;
		}

		for (RestricaoFinanceiraItem restricaoItem : restricaoFinanceiraItens) {
			RestricaoFinanceiraItemTO restricaoFinanceiraItemTO = new RestricaoFinanceiraItemTO(restricaoItem);
			restricaoFinanceiraItensTO.add(restricaoFinanceiraItemTO);
		}

		restricaoFinanceiraTo.setRestricaoItens(restricaoFinanceiraItensTO);

		MensagemRetorno enviaParaOPortal = sincronismoCadastoService.enviaParaOPortal(mensagem, restricaoFinanceiraTo,
				"Restricao Financeira");

		return enviaParaOPortal;
	}

}