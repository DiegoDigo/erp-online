package br.com.control.configuracao;

import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import br.com.control.interceptors.TempoExecucaoFilter;
import br.com.control.interceptors.ValidadorIdentificacaoRestAop;

@Configuration
public class ConfiguracaoWeb extends WebMvcConfigurerAdapter {

	@Autowired
	private ValidadorIdentificacaoRestAop auditoriaInterceptor;

	@Bean
	public FilterRegistrationBean someFilterRegistration() {

		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(tempoExecucaoFilter());
		registration.addUrlPatterns("/servicos/*");
		return registration;
	}

	@Bean
	public TempoExecucaoFilter tempoExecucaoFilter() {
		return new TempoExecucaoFilter();
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		converter.setObjectMapper(mapper);
		converters.add(converter);
	}

	public ValidadorIdentificacaoRestAop getAuditoriaInterceptor() {
		return auditoriaInterceptor;
	}

	public void setAuditoriaInterceptor(ValidadorIdentificacaoRestAop auditoriaInterceptor) {
		this.auditoriaInterceptor = auditoriaInterceptor;
	}

}
