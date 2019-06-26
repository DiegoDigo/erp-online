package br.com.control.controllers.sincronismo;

import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.mensageria.consumidor.erp.ERPConsumer;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.*;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;
import br.com.control.vendas.cadastro.modelo.cliente.ClienteEndereco;
import br.com.control.vendas.cadastro.modelo.produto.Produto;
import br.com.control.vendas.cadastro.modelo.vendedor.Vendedor;
import br.com.control.vendas.cadastro.modelo.vendedor.VendedorCliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("synctest")
public class SincronismoTestes extends ERPConsumer {
    private static Logger log = LoggerFactory.getLogger(SincronismoTestes.class);

    @Autowired
    SincronismoCadastroService sincronismoCadastroService;

    @GetMapping("produto")
    public ResponseEntity<String> testProdutoTO() {
        Produto produto = new Produto();

        produto.setDescricao("Produto de teste");
        produto.setCodigoErp("9999991");
        produto.setAtivo(true);
        produto.setBonificaUnidade(true);
        produto.setClassFiscal(1);
        produto.setCodigoEanFab("919191");
        produto.setIpiPauta(false);
        produto.setLinha("911111");
        produto.setLitragem("911111");
        produto.setPermiteBonificacao(false);
        produto.setPeso(9.1f);
        produto.setPesoEmb(9.1f);
        produto.setQuantidadeCx(91);
        produto.setTipoBanda("91");
        produto.setTipoProduto("911");
        produto.setVendaMultiMinAv(91);
        produto.setVendaMultiMinCx(91);
        produto.setVendeAvulso(false);
        produto.setVisibilidadePortal(0);
        produto.setCodigoErpCategoria("99");
        produto.setCodigoErpFamilia("902");
        produto.setCodigoErpGrupo("99");
        produto.setCodigoErpMarca("99");

        ProdutoTO produtoTO = new ProdutoTO(produto);
        sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.PRODUTO), produtoTO, "Produto");
        log.info("--> Produto de TESTE com codigo: " + produto.getCodigoErp() + " e descrição: "
                + produto.getDescricao() + " enviado para o Portal!");

        produtoTO.setDescricao("Descrição atualizada");


        sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.PRODUTO), produtoTO, "Produto");
        log.info("--> Produto de TESTE com codigo: " + produto.getCodigoErp() + " e descrição: "
                + produto.getDescricao() + " enviado para o Portal!");

        return new ResponseEntity<>("Sincronismo Enviado", HttpStatus.OK);
    }


    @GetMapping("cliente")
    public ResponseEntity<String> testClienteTO() {

        Cliente cliente = new Cliente();
        cliente.setCodigoErp("teste-911");
        cliente.setAtivo(false);
        cliente.setCpfCnpj("91191191191");
        cliente.setContato("1");
        cliente.setClasse("11");
        cliente.setCodigoTabpreco("12017011");
        cliente.setAbateIcms(false);
        cliente.setBonusDisponivel(0.0f);
        cliente.setDesprezaTaxaFinanceira(false);
        cliente.setDiaSemana("10");
        cliente.setDiasEntrega(10);
        cliente.setEmail("teste@sincronismo.com.br");
        cliente.setIgnoraBandaPreco(true);
        cliente.setLimiteCredito(911f);
        cliente.setMotivoBloqClasse20("");
        cliente.setMotivoBloqueioJuridico("");
        cliente.setNumeroCliente("");
        cliente.setPasta(1);
        cliente.setRazaoSocial("Teste de Sincronismo");
        cliente.setRegiaoCliente("30");
        cliente.setRegistroAlterado(0);
        cliente.setRestricaoComercial(false);
        cliente.setInconformidadeCadastro("");
        cliente.setSigla("TST");
        cliente.setSubCanal("1");
        cliente.setTelefoneDdd("99");
        cliente.setTelefoneTronco("999999999");
        cliente.setUsoVerbaRestritoProduto(0);
        cliente.setCodigoErpCanal("30");
        cliente.setCodigoErpCondicaoPagamento("1");
        cliente.setCodigoErpTipoCobranca("1");
        cliente.setCelular("9999999999");

        ClienteEndereco clienteEndereco = new ClienteEndereco();
        clienteEndereco.setBairro("teste");
        clienteEndereco.setCepEndereco("61880000");
        clienteEndereco.setCodigoClienteERP("teste-911");
        clienteEndereco.setCodigoTipoEnderecoERP("1A");
        clienteEndereco.setComplemento("");
        clienteEndereco.setEndereco("Teste");
        clienteEndereco.setMunicipio("localhost");
        clienteEndereco.setNumero(123);
        clienteEndereco.setPontoReferencia("");
        clienteEndereco.setOrigemLogradouroERP("1");
        clienteEndereco.setUfEndereco("LH");

        List<ClienteEnderecoTO> clienteEnderecos = new ArrayList<>();
        ClienteEnderecoTO enderecoTO = new ClienteEnderecoTO(clienteEndereco);
        enderecoTO.setTipoEndereco("1");
        clienteEnderecos.add(enderecoTO);
        enderecoTO.setTipoEndereco("2");
        clienteEndereco.setCodigoTipoEnderecoERP("1A");
        clienteEnderecos.add(enderecoTO);
        enderecoTO.setTipoEndereco("3");
        clienteEndereco.setCodigoTipoEnderecoERP("1A");
        clienteEnderecos.add(enderecoTO);

        ClienteTO clienteTO = new ClienteTO(cliente);
        // ENDERECO FATURAMENTO
        clienteTO.setTipoLogradouroFaturamento("1");
        clienteTO.setEnderecoFaturamento("Local");
        clienteTO.setNumeroFaturamento("123");
        clienteTO.setPontoReferenciaFaturamento("1");
        clienteTO.setBairroFaturamento("Centro");
        clienteTO.setMunicipioFaturamento("SP");
        clienteTO.setCepEnderecoFaturamento(61111111);

        // ENDERECO COBRANCA
        clienteTO.setTipoLogradouroCobranca("2");
        clienteTO.setEnderecoCobranca("Local");
        clienteTO.setNumeroCobranca("123");
        clienteTO.setPontoReferenciaCobranca("1");
        clienteTO.setBairroCobranca("Centro");
        clienteTO.setMunicipioCobranca("SP");
        clienteTO.setCepEnderecoCobranca(61111111);

        // ENDERECO ENTREGA
        clienteTO.setTipoLogradouroEntrega("3");
        clienteTO.setEnderecoEntrega("Local");
        clienteTO.setNumeroEntrega("123");
        clienteTO.setPontoReferenciaEntrega("1");
        clienteTO.setBairroEntrega("Centro");
        clienteTO.setMunicipioEntrega("SP");
        clienteTO.setCepEnderecoEntrega(61111111);

        VendedorCliente vendedorCliente = new VendedorCliente();
        vendedorCliente.setAtivo(true);
        vendedorCliente.setCodigoClienteERP("teste-911");
        vendedorCliente.setCodigoVendedorERP("191");

        clienteTO.setVendedoresClienteTO(Arrays.asList(new VendedorClienteTO(vendedorCliente)));

        clienteTO.setEnderecosClienteTO(clienteEnderecos);
        sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.CLIENTE), clienteTO, "Cliente");
        log.info("--> Cliente de TESTE com codigo: " + clienteTO.getCodigoErp() + " enviado para o Portal!");

        clienteTO.setContato("Atualizacao");

        sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.CLIENTE), clienteTO, "Cliente");
        log.info("--> Cliente de TESTE com codigo: " + clienteTO.getCodigoErp() + " enviado para o Portal!");

        return new ResponseEntity<>("Sincronismo Enviado", HttpStatus.OK);
    }


}
