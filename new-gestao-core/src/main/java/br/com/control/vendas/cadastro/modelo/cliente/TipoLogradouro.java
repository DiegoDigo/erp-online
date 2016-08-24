package br.com.control.vendas.cadastro.modelo.cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TipoLogradouro {

	AC("AC", "Acesso", "Tipo de logradouro acesso"),   
	AER("AER", "Aeroporto", "Tipo de logradouro aeroporto"),
	AL("AL", "Alameda", "Tipo de logradouro alameda"),
	AREA("AREA", "Area", "Tipo de logradouro área"),
	ASS("ASS", "Assentamento", "Tipo de logradouro assentamento"),
	AV("AV", "Avenida", "Tipo de logradouro avenida"),
	BAL("BAL", "Balneario", "Tipo de logradouro balneário"),
	BC("BC", "Beco", "Tipo de logradouro beco"),
	CAIS("CAIS", "Cais", "Tipo de logradouro cais"),
	CAM("CAM", "Caminho", "Tipo de logradouro caminho"),
	CAMPO("CAMPO", "Campo", "Tipo de logradouro campo"),
	COL("COL", "Colonia", "Tipo de logradouro colónia"),
	COMUNID("", "Comunidade", "Tipo de logradouro comunidade"),
	COR("COR", "Corredor", "Tipo de logradouro corredor"),
	DV("DV", "Desvio", "Tipo de logradouro desvio"),
	ESC("ESC", "Escada", "Tipo de logradouro escada"),
	ESQ("ESQ", "Esquina", "Tipo de logradouro esquina"),
	EST("EST", "Estrada", "Tipo de logradouro estrada"),
	ETA("ETA", "Estacao", "Tipo de logradouro estação"),
	ETN("ETN", "Estancia", "Tipo de logradouro estância"),
	FAZ("FAZ", "Fazenda", "Tipo de logradouro fazenda"),
	GAL("GAL", "Galeria", "Tipo de logradouro galeria"),
	GRJ("GRJ", "Granja", "Tipo de logradouro granja"),
	HPD("HPD", "Hipodromo", "Tipo de logradouro hipódromo"),
	ILH("ILH", "Ilha", "Tipo de logradouro ilha"),
	JD("JD", "Jardim", "Tipo de logradouro jardim"),
	LG("LG", "Largo", "Tipo de logradouro largo"),                    
	LGA("LGA", "Lagoa", "Tipo de logradouro lagoa"),                    
	LI("LI", "Linha", "Tipo de logradouro linha"),                    
	LOC("LOC", "Localidade", "Tipo de logradouro localidade"),
	LOT("LOT", "Loteamento", "Tipo de logradouro loteamento"),
	MERC("MERC", "Mercado", "Tipo de logradouro mercado"),
	PACO("PACO", "Paco", "Tipo de logradouro paco"),
	PAS("PAS", "Passeio", "Tipo de logradouro passeio"),
	PC("PC", "Praca", "Tipo de logradouro praça"),
	PIC("PIC", "Picada", "Tipo de logradouro picada"),
	POR("POR", "Porto", "Tipo de logradouro porto"),
	PR("PR", "Praia", "Tipo de logradouro praia"),
	PRQ("PRQ", "Parque", "Tipo de logradouro parque"),
	QD("QD", "Quadra", "Tipo de logradouro quadra"),
	QTL("QTL", "Quartel", "Tipo de logradouro quartel"),
	RDV("PDV", "Rodoviaria", "Tipo de logradouro rodoviária"),
	ROD("ROD", "Rodovia", "Tipo de logradouro rodovia"),
	RUA("RUA", "Rua", "Tipo de logradouro rua"),
	SQD("SQD", "Super quadra", "Tipo de logradouro super quadra"),
	TRAV("TRAV", "Travessao", "Tipo de logradouro travessão"),
	TV("TV", "Travessa", "Tipo de logradouro travessa"),
	VD("VD", "Viaduto", "Tipo de logradouro viaduto"),
	VIA("VIA", "Via", "Tipo de logradouro via"),
	VIELA("VIELA", "Viela", "Tipo de logradouro viela"),
	VL("VL", "Vila", "Tipo de logradouro vila");                    

	private final String sigla;
	private final String nome;
	private final String descricao;

	private TipoLogradouro(String sigla, String nome, String descricao) {
		this.sigla = sigla;
		this.nome = nome;
		this.descricao = descricao;
	}

	public static List<String> recuperaNomes(){
		List<String> tiposLogradouros = new ArrayList<>();
		for (TipoLogradouro tipoLogradouro : Arrays.asList(TipoLogradouro.values())) {
			tiposLogradouros.add(tipoLogradouro.getNome());
		}
		return tiposLogradouros;
	}
	
	public final String getDescricao(){
		return descricao;
	}

	public String getNome(){
		return nome;
	}

	public String getSigla(){
		return sigla;
	}

	@Override
	public String toString(){
		return this.sigla;
	}
}