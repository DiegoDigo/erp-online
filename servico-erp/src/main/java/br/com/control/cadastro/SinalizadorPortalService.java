package br.com.control.cadastro;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.control.portal.integracao.MensagemRecebida;

@Service
public class SinalizadorPortalService {
	
	public String retornaCodigoERP(MensagemRecebida<String> mensagem){
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		String codigoTipoCobrancaErp = mapper.convertValue(mensagem.getConteudo(), new TypeReference<String>() {
		});
		
		return codigoTipoCobrancaErp;
	}
	
}
