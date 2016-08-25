package br.com.control;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import br.com.control.json.Views;
import br.com.control.vendas.cadastro.modelo.cliente.Cliente;
import br.com.control.vendas.cadastro.modelo.cliente.Documento;
import br.com.control.vendas.cadastro.modelo.cliente.Estado;
import br.com.control.vendas.cadastro.modelo.cliente.TipoDocumento;


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
		
		System.out.println(mapper.writerWithView(Views.CadastroCliente.class).writeValueAsString(cliente));

	}

}
