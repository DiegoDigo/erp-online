import com.iscobol.rts.IscobolCall;
import com.iscobol.types.NumericVar;

import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.rest.client.SincronismoAcompanhamentoPedido;
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
import br.com.control.rest.client.SincronismoCadastroTipoCobranca;
import br.com.control.rest.client.SincronismoCadastroVendedor;
import br.com.control.rest.client.SincronismoCadastroVendedorCliente;
import br.com.control.rest.client.SincronismoComodato;
import br.com.control.rest.client.SincronismoHistoricoPedidoCapa;
import br.com.control.rest.client.SincronismoHistoricoPedidoItem;
import br.com.control.rest.client.SincronismoTipoCobrancaCliente;
import br.com.control.rest.client.SincronismoTipoEndereco;

public class SINALIZADOR implements IscobolCall {

	public static void main(String[] args) {

		SINALIZADOR sinalizador = new SINALIZADOR();
		String[] param = { "CADASTRO|" + CadastrosEnum.HISTORICO_PEDIDO_ITEM + "|201702160006" };
		sinalizador.call(param);
	}

	@Override
	public Object call(Object[] argv) {

		try {
			System.out.println("### ENTROU NO SINALIZADOR ###");

			String parametroRecebido = argv[0].toString();
			System.out.println("--> Parametro Recebido: " + parametroRecebido);

			String[] valoresQuebrados = parametroRecebido.split("\\|");
			String acao = valoresQuebrados[0];
			System.out.println("--> Ação: ATUALIZAÇÃO DE " + acao);

			if (acao.equals("PEDIDO")) {
				SincronismoAcompanhamentoPedido clienteREST = new SincronismoAcompanhamentoPedido();
				clienteREST.sinalizaPortalAtualizacao(parametroRecebido, null);
			} else if (acao.equals("CADASTRO")) {
				String nomeCadastro = valoresQuebrados[1];
				CadastrosEnum cadastro = CadastrosEnum.recuperaCadastro(nomeCadastro);

				if (CadastrosEnum.GRUPO_PRODUTO == cadastro) {
					SincronismoCadastroGrupoProduto rest = new SincronismoCadastroGrupoProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.GRUPO_PRODUTO);
				}
				if (CadastrosEnum.FAMILIA_PRODUTO == cadastro) {
					SincronismoCadastroFamiliaProduto rest = new SincronismoCadastroFamiliaProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.FAMILIA_PRODUTO);
				}
				if (CadastrosEnum.MARCA_PRODUTO == cadastro) {
					SincronismoCadastroMarcaProduto rest = new SincronismoCadastroMarcaProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.MARCA_PRODUTO);
				}
				if (CadastrosEnum.CATEGORIA_PRODUTO == cadastro) {
					SincronismoCadastroCategoriaProduto rest = new SincronismoCadastroCategoriaProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.CATEGORIA_PRODUTO);
				}
				if (CadastrosEnum.PRODUTO == cadastro) {
					SincronismoCadastroProduto rest = new SincronismoCadastroProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.PRODUTO);
				}
				if (CadastrosEnum.CANAL == cadastro) {
					SincronismoCadastroCanalProduto rest = new SincronismoCadastroCanalProduto();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.CANAL);
				}
				if (CadastrosEnum.TIPO_COBRANCA == cadastro) {
					SincronismoCadastroTipoCobranca rest = new SincronismoCadastroTipoCobranca();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.TIPO_COBRANCA);
				}
				if (CadastrosEnum.OCORRENCIA == cadastro) {
					SincronismoCadastroOcorrencia rest = new SincronismoCadastroOcorrencia();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.OCORRENCIA);
				}
				if (CadastrosEnum.CONDICAO_PAGAMENTO == cadastro) {
					SincronismoCadastroCondicaoPagamento rest = new SincronismoCadastroCondicaoPagamento();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.CONDICAO_PAGAMENTO);
				}
				if (CadastrosEnum.PRODUTO_COMBO == cadastro) {
					SincronismoCadastroDetalheProdutoCombo rest = new SincronismoCadastroDetalheProdutoCombo();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.PRODUTO_COMBO);
				}
				if (CadastrosEnum.CLIENTE_ENDERECO == cadastro) {
					SincronismoCadastroEnderecoCliente rest = new SincronismoCadastroEnderecoCliente();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.CLIENTE_ENDERECO);
				}
				if (CadastrosEnum.VENDEDOR == cadastro) {
					SincronismoCadastroVendedor rest = new SincronismoCadastroVendedor();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.VENDEDOR);
				}
				if (CadastrosEnum.VENDEDOR_CLIENTE == cadastro) {
					SincronismoCadastroVendedorCliente rest = new SincronismoCadastroVendedorCliente();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.VENDEDOR_CLIENTE);
				}
				if (CadastrosEnum.CLIENTE == cadastro) {
					SincronismoCadastroCliente rest = new SincronismoCadastroCliente();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.CLIENTE);
				}
				if (CadastrosEnum.OCORRENCIA == cadastro) {
					SincronismoCadastroOcorrencia rest = new SincronismoCadastroOcorrencia();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.OCORRENCIA);
				}
				if (CadastrosEnum.TIPO_ENDERECO == cadastro) {
					SincronismoTipoEndereco rest = new SincronismoTipoEndereco();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.TIPO_ENDERECO);
				}
				if (CadastrosEnum.TIPO_COBRANCA_CLIENTE == cadastro) {
					SincronismoTipoCobrancaCliente rest = new SincronismoTipoCobrancaCliente();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.TIPO_COBRANCA_CLIENTE);
				}
				if (CadastrosEnum.MOVIMENTO_FINANCEIRO == cadastro) {
					SincronismoTipoCobrancaCliente rest = new SincronismoTipoCobrancaCliente();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.MOVIMENTO_FINANCEIRO);
				}
				if (CadastrosEnum.COMODATO == cadastro) {
					SincronismoComodato rest = new SincronismoComodato();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.COMODATO);
				}
				if (CadastrosEnum.HISTORICO_PEDIDO_CAPA == cadastro) {
					SincronismoHistoricoPedidoCapa rest = new SincronismoHistoricoPedidoCapa();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.HISTORICO_PEDIDO_CAPA);
				}
				if (CadastrosEnum.HISTORICO_PEDIDO_ITEM == cadastro) {
					SincronismoHistoricoPedidoItem rest = new SincronismoHistoricoPedidoItem();
					rest.sinalizaPortalAtualizacao(parametroRecebido, CadastrosEnum.HISTORICO_PEDIDO_ITEM);
				}

			}

			System.out.println("### SAIU DO SINALIZADOR SEM ERROS ###");
			return NumericVar.literal(0, false);
		} catch (Exception e) {
			e.printStackTrace();
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
