import com.iscobol.rts.IscobolCall;
import com.iscobol.types.NumericVar;

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
import br.com.control.rest.client.SincronismoTipoCobrancaCliente;
import br.com.control.rest.client.SincronismoTipoEndereco;

public class SINALIZADOR implements IscobolCall {

	// public static void main(String[] args) {
	// SINALIZADOR sinalizador = new SINALIZADOR();
	// String[] param = { "CADASTRO|" + CadastrosEnum.CORTE_ITEM_PREPEDIDO +
	// "|10|" };
	// sinalizador.call(param);
	// }

	@Override
	public Object call(Object[] argv) {

		try {
			System.out.println("### ENTROU NO SINALIZADOR ###");

			String parametroRecebido = argv[0].toString();
			System.out.println("--> Parametro Recebido: " + parametroRecebido);

			String[] valoresQuebrados = parametroRecebido.split("\\|");
			String acao = valoresQuebrados[0];
			System.out.println("--> ACAO: ATUALIZACAO DE " + acao);

			if (acao.equals("PEDIDO")) {
				System.out.println("---> PARAMETRO RECEBIDO DO GESTÃO: " + parametroRecebido);
				SincronismoAcompanhamentoPedido clienteREST = new SincronismoAcompanhamentoPedido();
				clienteREST.sinalizaPortalAtualizacao(parametroRecebido, null);
			} else if (acao.equals("CADASTRO")) {

				String nomeCadastro = valoresQuebrados[1];
				System.out.println("--> NOME CADASTRO: " + nomeCadastro);

				CadastrosEnum cadastro = CadastrosEnum.recuperaCadastro(nomeCadastro);
				System.out.println("--> CADASTRO: " + cadastro);

				if (CadastrosEnum.GRUPO_PRODUTO == cadastro) {
					SincronismoCadastroGrupoProduto rest = new SincronismoCadastroGrupoProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.GRUPO_PRODUTO);
				}else if (CadastrosEnum.TABELA_PRECO == cadastro) {
					SincronismoCadastroTabelaPreco rest = new SincronismoCadastroTabelaPreco();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.TABELA_PRECO);
				} else if (CadastrosEnum.FAMILIA_PRODUTO == cadastro) {
					SincronismoCadastroFamiliaProduto rest = new SincronismoCadastroFamiliaProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.FAMILIA_PRODUTO);
				} else if (CadastrosEnum.MARCA_PRODUTO == cadastro) {
					SincronismoCadastroMarcaProduto rest = new SincronismoCadastroMarcaProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.MARCA_PRODUTO);
				} else if (CadastrosEnum.CATEGORIA_PRODUTO == cadastro) {
					SincronismoCadastroCategoriaProduto rest = new SincronismoCadastroCategoriaProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.CATEGORIA_PRODUTO);
				} else if (CadastrosEnum.PRODUTO == cadastro) {
					SincronismoCadastroProduto rest = new SincronismoCadastroProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.PRODUTO);
				} else if (CadastrosEnum.CANAL == cadastro) {
					SincronismoCadastroCanalProduto rest = new SincronismoCadastroCanalProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.CANAL);
				} else if (CadastrosEnum.TIPO_COBRANCA == cadastro) {
					SincronismoCadastroTipoCobranca rest = new SincronismoCadastroTipoCobranca();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.TIPO_COBRANCA);
				} else if (CadastrosEnum.OCORRENCIA == cadastro) {
					SincronismoCadastroOcorrencia rest = new SincronismoCadastroOcorrencia();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.OCORRENCIA);
				} else if (CadastrosEnum.CONDICAO_PAGAMENTO == cadastro) {
					SincronismoCadastroCondicaoPagamento rest = new SincronismoCadastroCondicaoPagamento();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.CONDICAO_PAGAMENTO);
				} else if (CadastrosEnum.PRODUTO_COMBO == cadastro) {
					SincronismoCadastroDetalheProdutoCombo rest = new SincronismoCadastroDetalheProdutoCombo();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.PRODUTO_COMBO);
				} else if (CadastrosEnum.PRODUTO_CANAL == cadastro) {
					SincronismoCadastroProdutoCanal rest = new SincronismoCadastroProdutoCanal();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.PRODUTO_CANAL);
				} else if (CadastrosEnum.CLIENTE_ENDERECO == cadastro) {
					SincronismoCadastroEnderecoCliente rest = new SincronismoCadastroEnderecoCliente();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.CLIENTE_ENDERECO);
				} else if (CadastrosEnum.VENDEDOR == cadastro) {
					SincronismoCadastroVendedor rest = new SincronismoCadastroVendedor();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.VENDEDOR);
				} else if (CadastrosEnum.VENDEDOR_CLIENTE == cadastro) {
					SincronismoCadastroVendedorCliente rest = new SincronismoCadastroVendedorCliente();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.VENDEDOR_CLIENTE);
				} else if (CadastrosEnum.CLIENTE == cadastro) {
					SincronismoCadastroCliente rest = new SincronismoCadastroCliente();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.CLIENTE);
				} else if (CadastrosEnum.TIPO_ENDERECO == cadastro) {
					SincronismoTipoEndereco rest = new SincronismoTipoEndereco();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.TIPO_ENDERECO);
				} else if (CadastrosEnum.TIPO_COBRANCA_CLIENTE == cadastro) {
					SincronismoTipoCobrancaCliente rest = new SincronismoTipoCobrancaCliente();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.TIPO_COBRANCA_CLIENTE);
				} else if (CadastrosEnum.MOVIMENTO_FINANCEIRO == cadastro) {
					SincronismoMovimentoFinanceiro rest = new SincronismoMovimentoFinanceiro();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.MOVIMENTO_FINANCEIRO);
				} else if (CadastrosEnum.COMODATO == cadastro) {
					SincronismoComodato rest = new SincronismoComodato();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.COMODATO);
				} else if (CadastrosEnum.HISTORICO_PEDIDO_CAPA == cadastro) {
					System.out.println("Vai processar o sincronismo de Historico Pedido Capa");
					SincronismoHistoricoPedidoCapa rest = new SincronismoHistoricoPedidoCapa();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.HISTORICO_PEDIDO_CAPA);
				} else if (CadastrosEnum.BANDA_PRECO == cadastro) {
					System.out.println("Vai processar o sincronismo de Banda Preco");
					SincronismoBandaPrecoCapa rest = new SincronismoBandaPrecoCapa();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.BANDA_PRECO);
				} else if (CadastrosEnum.STATUS_PEDIDO == cadastro) {
					SincronismoPedidoBloqueado rest = new SincronismoPedidoBloqueado();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.STATUS_PEDIDO);
				} else if (CadastrosEnum.PEDIDO_SUGESTAO == cadastro) {
					SincronismoPedidoSugestao rest = new SincronismoPedidoSugestao();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.PEDIDO_SUGESTAO);
				} else if (CadastrosEnum.PAROCO == cadastro) {
					SincronismoParoco rest = new SincronismoParoco();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.PAROCO);
				} else if (CadastrosEnum.CORTE_ITEM_PREPEDIDO == cadastro) {
					SincronismoPedidoItemCortado rest = new SincronismoPedidoItemCortado();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.CORTE_ITEM_PREPEDIDO);
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
