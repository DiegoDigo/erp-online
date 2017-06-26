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
import br.com.control.cadastro.PedidoPendenteLiberacaoService;
import br.com.control.cadastro.PedidoSugestaoService;
import br.com.control.cadastro.PrecoService;
import br.com.control.cadastro.ProdutoService;
import br.com.control.cadastro.SinalizadorPortalService;
import br.com.control.cadastro.TipoCobrancaClienteService;
import br.com.control.cadastro.TipoEnderecoService;
import br.com.control.cadastro.VendedorClienteService;
import br.com.control.cadastro.VendedorService;
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
import br.com.control.portal.mensageria.to.PedidoPendenteLiberacaoTO;
import br.com.control.portal.mensageria.to.PrecoTO;
import br.com.control.portal.mensageria.to.ProdutoTO;
import br.com.control.portal.mensageria.to.TipoCobrancaClienteTO;
import br.com.control.portal.mensageria.to.TipoCobrancaTO;
import br.com.control.portal.mensageria.to.TipoEnderecoTO;
import br.com.control.portal.mensageria.to.VendedorClienteTO;
import br.com.control.portal.mensageria.to.VendedorTO;
import br.com.control.rotas.RotasRest;
import br.com.control.vendas.cadastro.modelo.Comodato;
import br.com.control.vendas.cadastro.modelo.MovimentoFinanceiro;
import br.com.control.vendas.cadastro.modelo.canal.Canal;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;
import br.com.control.vendas.cadastro.modelo.cliente.ClienteEndereco;
import br.com.control.vendas.cadastro.modelo.cliente.TipoCobrancaCliente;
import br.com.control.vendas.cadastro.modelo.cliente.TipoEndereco;
import br.com.control.vendas.cadastro.modelo.condicaoPagamento.CondicaoPagamento;
import br.com.control.vendas.cadastro.modelo.ocorrencia.Ocorrencia;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoCapa;
import br.com.control.vendas.cadastro.modelo.pedido.HistoricoPedidoItem;
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
	private PrecoService precoService;

	@RequestMapping(value = RotasRest.RAIZ_ACOMPANHAMENTO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortal(@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		logger.info("### SINALIZADOR -> ACOMPANHAMENTO DE PEDIDO");
		acompanhamentoCapaPedidoService.enviaParaOPortal(sinalizadorPortalService.retornaCodigoERP(mensagem));
		return null;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_GRUPO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroGrupo(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> GRUPO PRODUTO");

		String codigoGrupo = sinalizadorPortalService.retornaCodigoERP(mensagem);
		Grupo grupo = grupoService.recuperaGrupo(codigoGrupo);

		if (grupo == null) {
			String msg = "Grupo com código: " + codigoGrupo + " não encontrado no DBMaker!";
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

		logger.info("### SINALIZADOR -> FAMILIA PRODUTO");

		String codigoFamilia = sinalizadorPortalService.retornaCodigoERP(mensagem);
		Familia familia = familiaService.recuperaFamilia(codigoFamilia);

		if (familia == null) {
			String msg = "Família com código: " + codigoFamilia + " não encontrado no DBMaker!";
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

		logger.info("### SINALIZADOR -> MARCA PRODUTO");

		String codigoMarca = sinalizadorPortalService.retornaCodigoERP(mensagem);
		Marca marca = marcaService.recuperaMarca(codigoMarca);

		if (marca == null) {
			String msg = "Marca com código: " + codigoMarca + " não encontrado no DBMaker!";
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

		logger.info("### SINALIZADOR -> CATEGORIA PRODUTO");

		String codigoCategoria = sinalizadorPortalService.retornaCodigoERP(mensagem);
		Categoria categoria = categoriaService.recuperaCategoria(codigoCategoria);

		if (categoria == null) {
			String msg = "Categoria com código: " + codigoCategoria + " não encontrado no DBMaker!";
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

		logger.info("### SINALIZADOR -> CANAL");

		String codigoCanal = sinalizadorPortalService.retornaCodigoERP(mensagem);
		Canal canal = canalService.recuperaCanal(codigoCanal);

		if (canal == null) {
			String msg = "Canal com código: " + codigoCanal + " não encontrado no DBMaker!";
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

		logger.info("### SINALIZADOR -> PRODUTO");

		String codigoProduto = sinalizadorPortalService.retornaCodigoERP(mensagem);
		Produto produto = produtoService.recuperarProduto(codigoProduto);

		if (produto == null) {
			String msg = "Produgo com código: " + codigoProduto + " não encontrado no DBMaker!";
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

		logger.info("### SINALIZADOR -> TIPO COBRANCA");

		String codigoTipoCobranca = sinalizadorPortalService.retornaCodigoERP(mensagem);
		TipoCobranca tipoCobranca = tipoCobrancaService.recuperarTipoCobranca(codigoTipoCobranca);

		if (tipoCobranca == null) {
			String msg = "Tipo Cobrança com código: " + codigoTipoCobranca + " não encontrado no DBMaker!";
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

		logger.info("### SINALIZADOR -> CONDICAO PAGAMENTO");

		String codigoCondicaoPagamento = sinalizadorPortalService.retornaCodigoERP(mensagem);
		CondicaoPagamento condicaoPagamento = condicaoPagamentoService
				.recuperarCondicaoPagamento(codigoCondicaoPagamento);

		if (condicaoPagamento == null) {
			String msg = "Condição Pagamento com código: " + codigoCondicaoPagamento + " não encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		CondicaoPagamentoTO condicaoPagamentoTO = new CondicaoPagamentoTO(condicaoPagamento);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, condicaoPagamentoTO, "Condições de Pagemanto");
	}
	
	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_PEDIDO + RotasRest.RAIZ_SUGESTAO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroPedidoSugestao(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		
		logger.info("### SINALIZADOR -> PEDIDO SUGESTAO");
		List<PedidoSugestao> sugestoes = pedidoSugestaoService.listar();
		return sincronismoCadastoService.enviaParaOPortal(mensagem, sugestoes, "Pedidos Sugestão");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_OCORRENCIA, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroOcorrencia(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> OCORRENCIA");

		String codigoOcorrencia = sinalizadorPortalService.retornaCodigoERP(mensagem);
		Ocorrencia ocorrencia = ocorrenciaService.recuperarOcorrencia(codigoOcorrencia);

		if (ocorrencia == null) {
			String msg = "Ocorrencia com código: " + codigoOcorrencia + " não encontrado no DBMaker!";
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


		String codigoPedido = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("### SINALIZADOR -> PEDIDO BLOQUEADO | "+codigoPedido);
		PedidoPendenteLiberacao pedidoPendenteLiberacao = pedidoPendenteLiberacaoService.recuperarPedidoPendenteLiberacao(codigoPedido);

		if (pedidoPendenteLiberacao == null) {
			String msg = "P com código: " + codigoPedido + " não encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		PedidoPendenteLiberacaoTO pedidoPendenteLiberacaoTO = new PedidoPendenteLiberacaoTO(pedidoPendenteLiberacao);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, pedidoPendenteLiberacaoTO, "Pedido Pendente Liberação");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_DETALHE_COMBO, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroDetalheProdutoCombo(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> COMBO");

		List<DetalheComboProdutoTO> combosProdutoTO = new ArrayList<>();

		String codigoCombo = sinalizadorPortalService.retornaCodigoERP(mensagem);
		List<DetalheComboProduto> comboProduto = detalheProdutoComboService.recuperarComboProduto(codigoCombo);

		if (comboProduto == null || comboProduto.isEmpty()) {
			String msg = "Combo Produto com código: " + codigoCombo + " não encontrado no DBMaker!";
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

		logger.info("### SINALIZADOR -> CLIENTE ENDERECO");

		List<ClienteEnderecoTO> clienteEnderecoTOs = new ArrayList<>();

		String codigoClienteEndereco = sinalizadorPortalService.retornaCodigoERP(mensagem);
		List<ClienteEndereco> clienteEnderecos = clienteEnderecoServico
				.recuperarTipoEnderecoCodigoERP(codigoClienteEndereco);

		if (clienteEnderecos == null || clienteEnderecos.isEmpty()) {
			String msg = "Cliente Endereço com código: " + codigoClienteEndereco + " não encontrado no DBMaker!";
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
		Vendedor vendedor = vendedorService.recuperarVendedor(codigoVendedor);

		if (vendedor == null) {
			String msg = "Vendedor com código: " + codigoVendedor + " não encontrado no DBMaker!";
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


		String codigoTabelaPrecoProdutoErp = sinalizadorPortalService.retornaCodigoERP(mensagem);
		logger.info("### SINALIZADOR -> TABELA PRECO | "+codigoTabelaPrecoProdutoErp);
		Preco preco = precoService.recuperarTabelaPreco(codigoTabelaPrecoProdutoErp);

		if (preco == null) {
			String msg = "Preco Produto com código: " + codigoTabelaPrecoProdutoErp + " não encontrado no DBMaker!";
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

		logger.info("### SINALIZADOR -> CLIENTE VENDEDOR");

		String codigoVendedorCliente = sinalizadorPortalService.retornaCodigoERP(mensagem);
		List<VendedorCliente> vendedorClientes = vendedorClienteService
				.recuperarClientesVendedor(codigoVendedorCliente);

		if (vendedorClientes == null || vendedorClientes.isEmpty()) {
			String msg = "Vendedor Cliente com código: " + codigoVendedorCliente + " não encontrado no DBMaker!";
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

		logger.info("### SINALIZADOR -> CLIENTE");

		String codigoCliente = sinalizadorPortalService.retornaCodigoERP(mensagem);
		Cliente cliente = clienteService.recuperarCliente(Integer.valueOf(codigoCliente));

		if (cliente == null) {
			String msg = "Cliente com código: " + codigoCliente + " não encontrado no DBMaker!";
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

		logger.info("### SINALIZADOR -> TIPO ENDERECO");

		String codigoTipoEndereco = sinalizadorPortalService.retornaCodigoERP(mensagem);
		TipoEndereco tipoEndereco = tipoEnderecoService.recuperarTipoEndereco(codigoTipoEndereco);

		if (tipoEndereco == null) {
			String msg = "Tipo Endereço com código: " + codigoTipoEndereco + " não encontrado no DBMaker!";
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

		logger.info("### SINALIZADOR -> TIPO COBRANCA CLIENTE");

		String codigoTipoCobrancaCliente = sinalizadorPortalService.retornaCodigoERP(mensagem);
		TipoCobrancaCliente tipoCobrancaCliente = tipoCobrancaClienteService
				.recuperarTipoCobrancaCliente(codigoTipoCobrancaCliente);

		if (tipoCobrancaCliente == null) {
			String msg = "Tipo Cobrança Cliente com código: " + codigoTipoCobrancaCliente
					+ " não encontrado no DBMaker!";
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

		logger.info("### SINALIZADOR -> MOVIMENTO FINANCEIRO");

		String codigoMovimentoFinanceiro = sinalizadorPortalService.retornaCodigoERP(mensagem);
		MovimentoFinanceiro movimentoFinanceiroBase = movimentoFinanceiroService
				.buscarMovimentoFinanceiro(Integer.valueOf(codigoMovimentoFinanceiro));

		if (movimentoFinanceiroBase == null) {
			String msg = "Movimento Financeiro com código: " + codigoMovimentoFinanceiro
					+ " não encontrado no DBMaker!";
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

		logger.info("### SINALIZADOR -> COMODATO");

		String codigoComodato = sinalizadorPortalService.retornaCodigoERP(mensagem);
		Comodato comodatoBase = comodatoService.listarComodato(codigoComodato);

		if (comodatoBase == null) {
			String msg = "Comodato com código: " + codigoComodato + " não encontrado no DBMaker!";
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

		logger.info("### SINALIZADOR -> HISTORICO PEDIDO CAPA");

		String codigoHistoricoPedidoCapa = sinalizadorPortalService.retornaCodigoERP(mensagem);
		HistoricoPedidoCapa historioPedidoCapa = historicoPedidoCapaService
				.buscarHistoricoCapa(codigoHistoricoPedidoCapa);

		if (historioPedidoCapa == null) {
			String msg = "Histórico Pedido Capa com código: " + codigoHistoricoPedidoCapa
					+ " não encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		HistoricoPedidoCapaTO historicoPedidoCapaTO = new HistoricoPedidoCapaTO(historioPedidoCapa);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, historicoPedidoCapaTO, "Historico Pedido Capa");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_HISTORICO + RotasRest.RAIZ_PEDIDO
			+ RotasRest.RAIZ_ITEM, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoHistoricoPedidoItem(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> HISTORICO PEDIDO ITEM");

		String codigoHistoricoPedidoItem = sinalizadorPortalService.retornaCodigoERP(mensagem);
		List<HistoricoPedidoItem> historioPedidoItem = historicoPedidoItemService
				.buscarItemPedido(codigoHistoricoPedidoItem);

		if (historioPedidoItem == null || historioPedidoItem.isEmpty()) {
			String msg = "Histórico Pedido Item com código: " + codigoHistoricoPedidoItem
					+ " não encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		List<HistoricoPedidoItemTO> historicoPedidoItensTO = new ArrayList<>();
		for (HistoricoPedidoItem historicoPedidoItem : historioPedidoItem) {
			HistoricoPedidoItemTO historicoPedidoItemTO = new HistoricoPedidoItemTO(historicoPedidoItem);
			historicoPedidoItensTO.add(historicoPedidoItemTO);
		}
		return sincronismoCadastoService.enviaParaOPortal(mensagem, historicoPedidoItensTO, "Historico Pedido Item");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_BANDA + RotasRest.RAIZ_PRECO
			+ RotasRest.RAIZ_CAPA, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoBandaPrecoCapa(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> BANDA PRECO CAPA");

		String codigoBandaPreco = sinalizadorPortalService.retornaCodigoERP(mensagem);
		BandaPreco bandaPreco = bandaPrecoService.buscarBanda(codigoBandaPreco);

		if (bandaPreco == null) {
			String msg = "Banda Preço com código: " + codigoBandaPreco + " não encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		BandaPrecoTO bandaPrecoTo = new BandaPrecoTO(bandaPreco);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, bandaPrecoTo, "Banda Preço");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_BANDA + RotasRest.RAIZ_PRECO
			+ RotasRest.RAIZ_ITEM, method = RequestMethod.POST, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoBandaPrecoItem(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		logger.info("### SINALIZADOR -> BANDA PRECO ITEM");

		List<BandaPrecoItemTO> bandaPrecoItensTO = new ArrayList<>();
		String codigoBandaPrecoItem = sinalizadorPortalService.retornaCodigoERP(mensagem);
		List<BandaPrecoItem> bandaPrecoItens = bandaPrecoItemService.buscaBandaPrecoItem(codigoBandaPrecoItem);

		if (codigoBandaPrecoItem == null || codigoBandaPrecoItem.isEmpty()) {
			String msg = "Banda Preço Item com código: " + codigoBandaPrecoItem + " não encontrado no DBMaker!";
			logger.warn(msg);
			return null;
		}

		for (BandaPrecoItem bandaPrecoItem : bandaPrecoItens) {
			BandaPrecoItemTO bandaPrecoItemTO = new BandaPrecoItemTO(bandaPrecoItem);
			bandaPrecoItensTO.add(bandaPrecoItemTO);
		}
		return sincronismoCadastoService.enviaParaOPortal(mensagem, bandaPrecoItensTO, "Banda Preço Item");
	}

}