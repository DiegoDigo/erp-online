import com.iscobol.rts.IscobolCall;
import com.iscobol.types.NumericVar;

import br.com.control.globobroker.rest.client.SincronismoPedidoBroker;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.rest.client.SincronismoAcompanhamentoPedido;
import br.com.control.rest.client.SincronismoBandaPrecoCapa;
import br.com.control.rest.client.SincronismoCadastroCanalProduto;
import br.com.control.rest.client.SincronismoCadastroCategoriaProduto;
import br.com.control.rest.client.SincronismoCadastroCliente;
import br.com.control.rest.client.SincronismoCadastroCondicaoPagamento;
import br.com.control.rest.client.SincronismoCadastroDetalheProdutoCombo;
import br.com.control.rest.client.SincronismoCadastroEnderecoCliente;
import br.com.control.rest.client.SincronismoCadastroFamiliaProduto;
import br.com.control.rest.client.SincronismoCadastroGrupoProduto;
import br.com.control.rest.client.SincronismoCadastroMarcaProduto;
import br.com.control.rest.client.SincronismoCadastroOcorrencia;
import br.com.control.rest.client.SincronismoCadastroProduto;
import br.com.control.rest.client.SincronismoCadastroProdutoCanal;
import br.com.control.rest.client.SincronismoCadastroTabelaPreco;
import br.com.control.rest.client.SincronismoCadastroTipoCobranca;
import br.com.control.rest.client.SincronismoCadastroVendedor;
import br.com.control.rest.client.SincronismoCadastroVendedorCliente;
import br.com.control.rest.client.SincronismoComodato;
import br.com.control.rest.client.SincronismoHistoricoPedidoCapa;
import br.com.control.rest.client.SincronismoMovimentoFinanceiro;
import br.com.control.rest.client.SincronismoParoco;
import br.com.control.rest.client.SincronismoPedidoBloqueado;
import br.com.control.rest.client.SincronismoPedidoItemCortado;
import br.com.control.rest.client.SincronismoPedidoSugestao;
import br.com.control.rest.client.SincronismoRestricaoFinanceira;
import br.com.control.rest.client.SincronismoTipoCobrancaCliente;
import br.com.control.rest.client.SincronismoTipoEndereco;
import br.com.control.rest.client.SincronismoVisitas;

public class SINALIZADOR implements IscobolCall {

	public static void main(String[] args) {
		SINALIZADOR sinalizador = new SINALIZADOR();
		String[] param = { "PEDIDO_BROKER" };
		sinalizador.call(param);
	}

	@Override
	public Object call(Object[] argv) {

		try {
			System.out.println("\n\n### ENTROU NO SINALIZADOR ###");

			String parametroRecebido = argv[0].toString();
			System.out.println("--> Parametro Recebido: " + parametroRecebido);

			String[] valoresQuebrados = parametroRecebido.split("\\|");
			String acao = valoresQuebrados[0];
//			System.out.println("--> ACAO: ATUALIZACAO DE " + acao);

			if (acao.equals("PEDIDO_BROKER")) {
				System.out.println("Entrou no Pedido Broker");
				SincronismoPedidoBroker clienteRest = new SincronismoPedidoBroker();
				clienteRest.sinalizaErpOnline(null, null);
			}

			if (acao.equals("PEDIDO")) {
				SincronismoAcompanhamentoPedido clienteREST = new SincronismoAcompanhamentoPedido();
				clienteREST.sinalizaErpOnline(parametroRecebido, null);
			} else if (acao.equals("CADASTRO")) {

				String nomeCadastro = valoresQuebrados[1];
//				System.out.println("--> NOME CADASTRO: " + nomeCadastro);

				CadastrosEnum cadastro = CadastrosEnum.recuperaCadastro(nomeCadastro);
//				System.out.println("--> CADASTRO: " + cadastro);

				if (CadastrosEnum.GRUPO_PRODUTO == cadastro) {
					SincronismoCadastroGrupoProduto rest = new SincronismoCadastroGrupoProduto();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.GRUPO_PRODUTO);
				} else if (CadastrosEnum.TABELA_PRECO == cadastro) {
					SincronismoCadastroTabelaPreco rest = new SincronismoCadastroTabelaPreco();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.TABELA_PRECO);
				} else if (CadastrosEnum.FAMILIA_PRODUTO == cadastro) {
					SincronismoCadastroFamiliaProduto rest = new SincronismoCadastroFamiliaProduto();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.FAMILIA_PRODUTO);
				} else if (CadastrosEnum.MARCA_PRODUTO == cadastro) {
					SincronismoCadastroMarcaProduto rest = new SincronismoCadastroMarcaProduto();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.MARCA_PRODUTO);
				} else if (CadastrosEnum.CATEGORIA_PRODUTO == cadastro) {
					SincronismoCadastroCategoriaProduto rest = new SincronismoCadastroCategoriaProduto();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.CATEGORIA_PRODUTO);
				} else if (CadastrosEnum.PRODUTO == cadastro) {
					SincronismoCadastroProduto rest = new SincronismoCadastroProduto();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.PRODUTO);
				} else if (CadastrosEnum.CANAL == cadastro) {
					SincronismoCadastroCanalProduto rest = new SincronismoCadastroCanalProduto();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.CANAL);
				} else if (CadastrosEnum.TIPO_COBRANCA == cadastro) {
					SincronismoCadastroTipoCobranca rest = new SincronismoCadastroTipoCobranca();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.TIPO_COBRANCA);
				} else if (CadastrosEnum.OCORRENCIA == cadastro) {
					SincronismoCadastroOcorrencia rest = new SincronismoCadastroOcorrencia();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.OCORRENCIA);
				} else if (CadastrosEnum.CONDICAO_PAGAMENTO == cadastro) {
					SincronismoCadastroCondicaoPagamento rest = new SincronismoCadastroCondicaoPagamento();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.CONDICAO_PAGAMENTO);
				} else if (CadastrosEnum.PRODUTO_COMBO == cadastro) {
					SincronismoCadastroDetalheProdutoCombo rest = new SincronismoCadastroDetalheProdutoCombo();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.PRODUTO_COMBO);
				} else if (CadastrosEnum.PRODUTO_CANAL == cadastro) {
					SincronismoCadastroProdutoCanal rest = new SincronismoCadastroProdutoCanal();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.PRODUTO_CANAL);
				} else if (CadastrosEnum.CLIENTE_ENDERECO == cadastro) {
					SincronismoCadastroEnderecoCliente rest = new SincronismoCadastroEnderecoCliente();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.CLIENTE_ENDERECO);
				} else if (CadastrosEnum.VENDEDOR == cadastro) {
					SincronismoCadastroVendedor rest = new SincronismoCadastroVendedor();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.VENDEDOR);
				} else if (CadastrosEnum.VENDEDOR_CLIENTE == cadastro) {
					SincronismoCadastroVendedorCliente rest = new SincronismoCadastroVendedorCliente();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.VENDEDOR_CLIENTE);
				} else if (CadastrosEnum.CLIENTE == cadastro) {
					SincronismoCadastroCliente rest = new SincronismoCadastroCliente();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.CLIENTE);
				} else if (CadastrosEnum.TIPO_ENDERECO == cadastro) {
					SincronismoTipoEndereco rest = new SincronismoTipoEndereco();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.TIPO_ENDERECO);
				} else if (CadastrosEnum.TIPO_COBRANCA_CLIENTE == cadastro) {
					SincronismoTipoCobrancaCliente rest = new SincronismoTipoCobrancaCliente();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.TIPO_COBRANCA_CLIENTE);
				} else if (CadastrosEnum.MOVIMENTO_FINANCEIRO == cadastro) {
					SincronismoMovimentoFinanceiro rest = new SincronismoMovimentoFinanceiro();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.MOVIMENTO_FINANCEIRO);
				} else if (CadastrosEnum.RESTRICAO_FINANCEIRA == cadastro) {
					SincronismoRestricaoFinanceira rest = new SincronismoRestricaoFinanceira();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.RESTRICAO_FINANCEIRA);
				} else if (CadastrosEnum.COMODATO == cadastro) {
					SincronismoComodato rest = new SincronismoComodato();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.COMODATO);
				} else if (CadastrosEnum.HISTORICO_PEDIDO_CAPA == cadastro) {
					SincronismoHistoricoPedidoCapa rest = new SincronismoHistoricoPedidoCapa();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.HISTORICO_PEDIDO_CAPA);
				} else if (CadastrosEnum.BANDA_PRECO == cadastro) {
					SincronismoBandaPrecoCapa rest = new SincronismoBandaPrecoCapa();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.BANDA_PRECO);
				} else if (CadastrosEnum.PEDIDO_PENDENTE_LIBERACAO == cadastro) {
					SincronismoPedidoBloqueado rest = new SincronismoPedidoBloqueado();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.PEDIDO_PENDENTE_LIBERACAO);
				} else if (CadastrosEnum.PEDIDO_SUGESTAO == cadastro) {
					SincronismoPedidoSugestao rest = new SincronismoPedidoSugestao();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.PEDIDO_SUGESTAO);
				} else if (CadastrosEnum.PAROCO == cadastro) {
					SincronismoParoco rest = new SincronismoParoco();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.PAROCO);
				} else if (CadastrosEnum.CORTE_ITEM_PREPEDIDO == cadastro) {
					SincronismoPedidoItemCortado rest = new SincronismoPedidoItemCortado();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.CORTE_ITEM_PREPEDIDO);
				} else if (CadastrosEnum.VISITAS == cadastro) {
					SincronismoVisitas rest = new SincronismoVisitas();
					rest.sinalizaErpOnline(parametroRecebido, CadastrosEnum.VISITAS);
				}
			}

			System.out.println("### SAIU DO SINALIZADOR SEM ERROS ###");
			return NumericVar.literal(0, false);
		} catch (

		Exception e) {
			e.printStackTrace();
			System.out.println("Mensagem: " + e.getMessage());
			System.out.println("Causa: " + e.getCause());
			System.out.println("StackTrace: " + e.getStackTrace());
			System.out.println("Localized Message: " + e.getLocalizedMessage());
			System.out.println("### SAIU DO SINALIZADOR COM ERROS ###");
			return NumericVar.literal(1, false);
		}
	}

	@Override
	public void finalize() {
	}

	@Override
	public void perform(int begin, int end) {
	}

}
