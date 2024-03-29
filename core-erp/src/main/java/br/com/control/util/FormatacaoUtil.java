package br.com.control.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;


@Component
public class FormatacaoUtil {
	public String formataData(Timestamp timestamp, String formato) {
		return new SimpleDateFormat(formato).format(timestamp);
	}
	
	public static Boolean converteZeroUmParaBoolean(String sn){
		Boolean resultado = false;
		if (sn != null) {
			if (sn.equalsIgnoreCase("0")) {
				resultado = false;
			}else if(sn.equalsIgnoreCase("1")){
				resultado = true;
			}
		}
		return resultado;
	}
	
	public static Boolean converteSNParaBoolean(String sn){
		Boolean resultado = false;
		if (sn != null) {
			if (sn.equalsIgnoreCase("N")) {
				resultado = false;
			}else if(sn.equalsIgnoreCase("S")){
				resultado = true;
			}
		}
		return resultado;
	}
	
	public static Timestamp converterStringTimeStamp(String date) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		java.util.Date parsedDate = dateFormat.parse(date);
		java.sql.Timestamp dataTimeStamp = new java.sql.Timestamp(parsedDate.getTime());
		return  dataTimeStamp ;
	}
}
