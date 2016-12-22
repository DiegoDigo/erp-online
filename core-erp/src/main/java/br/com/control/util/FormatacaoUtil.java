package br.com.control.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;


@Component
public class FormatacaoUtil {
	public String formataData(Timestamp timestamp, String formato) {
		return new SimpleDateFormat(formato).format(timestamp);
	}
}
