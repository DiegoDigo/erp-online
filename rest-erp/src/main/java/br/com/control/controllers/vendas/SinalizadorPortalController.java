package br.com.control.controllers.vendas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

	@RequestMapping(value = RotasRest.RAIZ_ACOMPANHAMENTO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortal(@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		acompanhamentoCapaPedidoService.enviaParaOPortal(sinalizadorPortalService.retornaCodigoERP(mensagem));
		return null;
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_GRUPO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroGrupo(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		Grupo grupo = grupoService.recuperaGrupo(sinalizadorPortalService.retornaCodigoERP(mensagem));
		GrupoTO grupoTO = new GrupoTO(grupo);

		return sincronismoCadastoService.enviaParaOPortal(mensagem, grupoTO, "Grupo");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_FAMILIA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroFamilia(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		Familia familia = familiaService.recuperaFamilia(sinalizadorPortalService.retornaCodigoERP(mensagem));
		FamiliaTO familiaTO = new FamiliaTO(familia);

		return sincronismoCadastoService.enviaParaOPortal(mensagem, familiaTO, "Familia");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_MARCA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroMarca(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		Marca marca = marcaService.recuperaMarca(sinalizadorPortalService.retornaCodigoERP(mensagem));
		MarcaTO marcaTO = new MarcaTO(marca);
		return sincronismoCadastoService.enviaParaOPortal(mensagem, marcaTO, "Marca");

	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_CATEGORIA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroCategoria(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		Categoria categoria = categoriaService.recuperaCategoria(sinalizadorPortalService.retornaCodigoERP(mensagem));
		CategoriaTO categoriaTO = new CategoriaTO(categoria);

		return sincronismoCadastoService.enviaParaOPortal(mensagem, categoriaTO, "Categoria");

	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_CANAL, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroCanal(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		Canal canal = canalService.recuperaCanal(sinalizadorPortalService.retornaCodigoERP(mensagem));
		CanalTO canalTO = new CanalTO(canal);

		return sincronismoCadastoService.enviaParaOPortal(mensagem, canalTO, "Canal");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_PRODUTO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroProduto(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		Produto produto = produtoService.recuperarProduto(sinalizadorPortalService.retornaCodigoERP(mensagem));
		ProdutoTO produtoTO = new ProdutoTO(produto);

		return sincronismoCadastoService.enviaParaOPortal(mensagem, produtoTO, "Produto");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_TIPO
			+ RotasRest.RAIZ_COBRANCA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroTipoCobranca(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		TipoCobranca tipoCobranca = tipoCobrancaService
				.recuperarTipoCobranca(sinalizadorPortalService.retornaCodigoERP(mensagem));
		TipoCobrancaTO tipoCobrancaTO = new TipoCobrancaTO(tipoCobranca);

		return sincronismoCadastoService.enviaParaOPortal(mensagem, tipoCobrancaTO, "Tipo Cobrança");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_CONDICAO_PAGAMENTO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroCondicaoPagamento(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		CondicaoPagamento condicaoPagamento = condicaoPagamentoService
				.recuperarCondicaoPagamento(sinalizadorPortalService.retornaCodigoERP(mensagem));
		CondicaoPagamentoTO condicaoPagamentoTO = new CondicaoPagamentoTO(condicaoPagamento);

		return sincronismoCadastoService.enviaParaOPortal(mensagem, condicaoPagamentoTO, "Condições de Pagemanto");

	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_OCORRENCIA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroOcorrencia(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		Ocorrencia ocorrencia = ocorrenciaService
				.recuperarOcorrencia(sinalizadorPortalService.retornaCodigoERP(mensagem));
		OcorrenciaTO ocorrenciaTO = new OcorrenciaTO(ocorrencia);

		return sincronismoCadastoService.enviaParaOPortal(mensagem, ocorrenciaTO, "Ocorrência");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_DETALHE_COMBO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroDetalheProdutoCombo(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		List<DetalheComboProdutoTO> combosProdutoTO = new ArrayList<>();

		List<DetalheComboProduto> comboProduto = detalheProdutoComboService
				.recuperarComboProduto(sinalizadorPortalService.retornaCodigoERP(mensagem));

		for (DetalheComboProduto detalheComboProduto : comboProduto) {
			combosProdutoTO.add(new DetalheComboProdutoTO(detalheComboProduto));
		}

		return sincronismoCadastoService.enviaParaOPortal(mensagem, combosProdutoTO, "Detalhe combo produto");

	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_CLIENTE
			+ RotasRest.RAIZ_ENDERECO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroOrigemLogradouro(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		List<ClienteEnderecoTO> clienteEnderecoTOs = new ArrayList<>();

		List<ClienteEndereco> clienteEnderecos = clienteEnderecoServico
				.recuperarTipoEnderecoCodigoERP(sinalizadorPortalService.retornaCodigoERP(mensagem));
		for (ClienteEndereco clienteEndereco : clienteEnderecos) {
			clienteEnderecoTOs.add(new ClienteEnderecoTO(clienteEndereco));
		}

		return sincronismoCadastoService.enviaParaOPortal(mensagem, clienteEnderecoTOs, "Cliente Endereco");

	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_VENDEDOR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroVendedor(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		Vendedor vendedor = vendedorService.recuperarVendedor(sinalizadorPortalService.retornaCodigoERP(mensagem));
		VendedorTO vendedorTO = new VendedorTO(vendedor);

		return sincronismoCadastoService.enviaParaOPortal(mensagem, vendedorTO, "Vendedor");

	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_CLIENTE
			+ RotasRest.RAIZ_VENDEDOR, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroClienteVendedor(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		List<VendedorCliente> vendedorClientes = vendedorClienteService
				.recuperarClientesVendedor(sinalizadorPortalService.retornaCodigoERP(mensagem));
		List<VendedorClienteTO> vendedorClientesTO = new ArrayList<VendedorClienteTO>();

		for (VendedorCliente vendedorCliente : vendedorClientes) {
			vendedorClientesTO.add(new VendedorClienteTO(vendedorCliente));
		}

		return sincronismoCadastoService.enviaParaOPortal(mensagem, vendedorClientesTO, "Vendedor do Cliente");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO
			+ RotasRest.RAIZ_CLIENTE, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroCliente(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		Cliente cliente = clienteService
				.recuperarCliente(Integer.valueOf(sinalizadorPortalService.retornaCodigoERP(mensagem)));
		ClienteTO clienteTO = new ClienteTO(cliente);

		return sincronismoCadastoService.enviaParaOPortal(mensagem, clienteTO, "Cliente");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_TIPO
			+ RotasRest.RAIZ_ENDERECO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroTipoEndereco(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		TipoEndereco tipoEndereco = tipoEnderecoService
				.recuperarTipoEndereco(sinalizadorPortalService.retornaCodigoERP(mensagem));
		TipoEnderecoTO tipoEnderecoTO = new TipoEnderecoTO(tipoEndereco);

		return sincronismoCadastoService.enviaParaOPortal(mensagem, tipoEnderecoTO, "Tipo de Endereço");
	}

	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_TIPO + RotasRest.RAIZ_COBRANCA
			+ RotasRest.RAIZ_CLIENTE, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroTipoCobrancaCliente(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		TipoCobrancaCliente tipoCobrancaCliente = tipoCobrancaClienteService
				.recuperarTipoCobrancaCliente(sinalizadorPortalService.retornaCodigoERP(mensagem));
		TipoCobrancaClienteTO tipoCobrancaClienteTO = new TipoCobrancaClienteTO(tipoCobrancaCliente);

		return sincronismoCadastoService.enviaParaOPortal(mensagem, tipoCobrancaClienteTO, "Tipo de Cobrança Cliente");
	}	
	
	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_MOTIVO + RotasRest.RAIZ_FINANCEIRO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoCadastroMovimentoFinanceiro(
			@RequestParam("mensagem") MensagemRecebida<String> mensagem) {

		MovimentoFinanceiro movimentoFinanceiroBase = movimentoFinanceiroService.buscarMovimentoFinanceiro(Integer.valueOf(sinalizadorPortalService.retornaCodigoERP(mensagem)));
		MovimentoFinanceiroTO movimentoFinanceiroTO = new MovimentoFinanceiroTO(movimentoFinanceiroBase);
		

		return sincronismoCadastoService.enviaParaOPortal(mensagem, movimentoFinanceiroTO, "Movimento Financeiro");
	}
	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_COMODATO, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoComodato(@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		
		Comodato ComodatoBase = comodatoService.listarComodato(sinalizadorPortalService.retornaCodigoERP(mensagem));
		ComodatoTO comodatoTO = new ComodatoTO(ComodatoBase);		
		
		return sincronismoCadastoService.enviaParaOPortal(mensagem, comodatoTO, "Comodato");
	}
	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_HISTORICO + RotasRest.RAIZ_PEDIDO + RotasRest.RAIZ_CAPA, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoHistoricoPedidoCapa(@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		
		HistoricoPedidoCapa historioPedidoCapa = historicoPedidoCapaService.buscarHistoricoCapa(sinalizadorPortalService.retornaCodigoERP(mensagem));
		HistoricoPedidoCapaTO comodatoTO = new HistoricoPedidoCapaTO(historioPedidoCapa);		
		
		return sincronismoCadastoService.enviaParaOPortal(mensagem, comodatoTO, "Historico Pedido Capa");
	}
	@RequestMapping(value = RotasRest.RAIZ_CADASTRO + RotasRest.RAIZ_HISTORICO + RotasRest.RAIZ_PEDIDO + RotasRest.RAIZ_ITEM, method = RequestMethod.GET, headers = "Accept=application/json")
	public MensagemRetorno sinalizaPortalSincronismoHistoricoPedidoItem(@RequestParam("mensagem") MensagemRecebida<String> mensagem) {
		
		List<HistoricoPedidoItem> historioPedidoItem = historicoPedidoItemService.buscarItemPedido(sinalizadorPortalService.retornaCodigoERP(mensagem));
		List<HistoricoPedidoItemTO> historicoPedidoItensTO  = new ArrayList<>();
		for (HistoricoPedidoItem historicoPedidoItem : historioPedidoItem) {
			HistoricoPedidoItemTO historicoPedidoItemTO = new HistoricoPedidoItemTO(historicoPedidoItem);
			historicoPedidoItensTO.add(historicoPedidoItemTO);
		}						
		return sincronismoCadastoService.enviaParaOPortal(mensagem, historicoPedidoItensTO, "Historico Pedido Item");
	}
	
	
}