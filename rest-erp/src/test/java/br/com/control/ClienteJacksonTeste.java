package br.com.control;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import br.com.control.json.Views;
import br.com.control.portal.integracao.Identificacao;
import br.com.control.portal.integracao.MensagemRecebida;
import br.com.control.portal.integracao.Sistema;
import br.com.control.portal.integracao.TipoOperacao;
import br.com.control.vendas.cadastro.modelo.clienteOld.Cliente;
import br.com.control.vendas.cadastro.modelo.clienteOld.Documento;
import br.com.control.vendas.cadastro.modelo.clienteOld.Endereco;
import br.com.control.vendas.cadastro.modelo.clienteOld.Estado;
import br.com.control.vendas.cadastro.modelo.clienteOld.TipoDocumento;
import br.com.control.vendas.cadastro.modelo.clienteOld.TipoEndereco;
import br.com.control.vendas.cadastro.modelo.clienteOld.TipoLogradouro;


public class ClienteJacksonTeste {

	private ObjectMapper mapper;

	@Before
	public void populaMapper() {
		mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
	}

	@Test
	public void testaBind() throws JsonProcessingException {

		Cliente cliente = new Cliente();
		Documento doc = new Documento();
		doc.setTipoDocumento(TipoDocumento.RG);
		doc.setValorDocumento("33666544-6");
		doc.setOrgaoEmissor(Estado.SAOPAULO);
		cliente.getDocumentos().add(doc);
		
		Endereco end = new Endereco();
		end.setTipoEndereco(TipoEndereco.FATURA);
		end.setTipoLogradouro(TipoLogradouro.RUA);
		end.setLogradouro("Xiririca");
		end.setNumero("1554");
		cliente.getEnderecos().add(end);
		
		
		Identificacao i = new Identificacao();
		i.setOrigem(Sistema.PORTAL_VENDAS);
		i.setDestino(Sistema.ERP);
		i.setTipoOperacao(TipoOperacao.POST);
		i.setUsuarioOrigemServico("Admin Revenda do Portal");
		
		MensagemRecebida<Cliente> mr = new MensagemRecebida<>(cliente, i);
		
		System.out.println(mapper.writerWithView(Views.CadastroCliente.class).writeValueAsString(mr));

	}

}
