package br.com.control.controllers;

import java.beans.PropertyEditorSupport;
import java.io.IOException;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import br.com.control.portal.integracao.MensagemRecebida;

public abstract class AbstractController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false);
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		
		dataBinder.registerCustomEditor(MensagemRecebida.class, new PropertyEditorSupport() {
			Object value;

			@Override
			public Object getValue() {
				return value;
			}

			@Override
			public void setAsText(String text) throws IllegalArgumentException {
				try {
					value = mapper.readValue(text, MensagemRecebida.class);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
