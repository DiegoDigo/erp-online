package br.com.control.configuracao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import br.com.control.interceptors.ValidacaoServicoInterceptor;


@Configuration
public class ConfiguracaoWeb extends WebMvcConfigurerAdapter {

//	@Autowired
//	private TempoExecucaoServicoInterceptor tempoExecucaoServicoInterceptor;
	
	@Autowired
	private ValidacaoServicoInterceptor validacaoServicoInterceptor;
	


	@Override
	  public void addInterceptors(InterceptorRegistry registry) {
//	    registry.addInterceptor(getTempoExecucaoServicoInterceptor());
	    registry.addInterceptor(getValidacaoServicoInterceptor());
	  }

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		converter.setObjectMapper(mapper);
		converters.add(converter);
	}
	
//	public TempoExecucaoServicoInterceptor getTempoExecucaoServicoInterceptor() {
//		return tempoExecucaoServicoInterceptor;
//	}
//
//	public void setTempoExecucaoServicoInterceptor(TempoExecucaoServicoInterceptor tempoExecucaoServicoInterceptor) {
//		this.tempoExecucaoServicoInterceptor = tempoExecucaoServicoInterceptor;
//	}

	public ValidacaoServicoInterceptor getValidacaoServicoInterceptor() {
		return validacaoServicoInterceptor;
	}

	public void setValidacaoServicoInterceptor(ValidacaoServicoInterceptor validacaoServicoInterceptor) {
		this.validacaoServicoInterceptor = validacaoServicoInterceptor;
	}
	
}
