package br.com.control.vendas.cadastro.modelo.cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Estado {

    /**
     * Nome: Acre, Sigla: AC
     */
    ACRE("Acre", "AC", Regiao.NORTE),
    /**
     * Nome: Alagoas, Sigla: AL
     */
    ALAGOAS("Alagoas", "AL", Regiao.NORDESTE),
    /**
     * Nome: Amapá, Sigla: AP
     */
    AMAPA("Amapá", "AP", Regiao.NORTE),
    /**
     * Nome: Amazonas, Sigla: AM
     */
    AMAZONAS("Amazonas", "AM", Regiao.NORTE),
    /**
     * Nome: Bahia, Sigla: BA
     */
    BAHIA("Bahia", "BA", Regiao.NORDESTE),
    /**
     * Nome: Ceará, Sigla: CE
     */
    CEARA("Ceará", "CE", Regiao.NORDESTE),
    /**
     * Nome: Distrito Federal, Sigla: DF
     */
    DISTRITOFEDERAL("Distrito Federal", "DF", Regiao.CENTROOESTE),
    /**
     * Nome: Espírito Santo, Sigla: ES
     */
    ESPIRITOSANTO("Espírito Santo", "ES", Regiao.SUDESTE),
    /**
     * Nome: Goiás, Sigla: GO
     */
    GOIAS("Goiás", "GO", Regiao.CENTROOESTE),
    /**
     * Nome: Maranhão, Sigla: MA
     */
    MARANHAO("Maranhão", "MA", Regiao.NORDESTE),
    /**
     * Nome: Mato Grosso, Sigla: MT
     */
    MATOGROSSO("Mato Grosso", "MT", Regiao.CENTROOESTE),
    /**
     * Nome: Mato Grosso do Sul, Sigla: MS
     */
    MATOGROSSODOSUL("Mato Grosso do Sul", "MS", Regiao.CENTROOESTE),
    /**
     * Nome: Minas Gerais, Sigla: MG
     */
    MINASGERAIS("Minas Gerais", "MG", Regiao.SUDESTE),
    /**
     * Nome: Pará, Sigla: PA
     */
    PARA("Pará", "PA", Regiao.NORTE),
    /**
     * Nome: Paraíba, Sigla: PB
     */
    PARAIBA("Paraíba", "PB", Regiao.NORDESTE),
    /**
     * Nome: Paraná, Sigla: PR
     */
    PARANA("Paraná", "PR", Regiao.SUL),
    /**
     * Nome: Pernambuco, Sigla: PE
     */
    PERNAMBUCO("Pernambuco", "PE", Regiao.NORDESTE),
    /**
     * Nome: Piauí, Sigla: PI
     */
    PIAUI("Piauí", "PI", Regiao.NORDESTE),
    /**
     * Nome: Rio de Janeiro, Sigla: RJ
     */
    RIODEJANEIRO("Rio de Janeiro", "RJ", Regiao.SUDESTE),
    /**
     * Nome: Rio Grande do Norte, Sigla: RN
     */
    RIOGRANDEDONORTE("Rio Grande do Norte", "RN", Regiao.NORDESTE),
    /**
     * Nome: Rio Grande do Sul, Sigla: RS
     */
    RIOGRANDEDOSUL("Rio Grande do Sul", "RS", Regiao.SUL),
    /**
     * Nome Rondônia, Silga: RO
     */
    RONDONIA("Rondônia", "RO", Regiao.NORTE),
    /**
     * Nome: Roraima, Sigla: RO
     */
    RORAIMA("Roraima", "RR", Regiao.NORTE),
    /**
     * Nome: Santa Catarina, Sigla: SC
     */
    SANTACATARINA("Santa Catarina", "SC", Regiao.SUL),
    /**
     * Nome: São Paulo, Sigla: SP
     */
    SAOPAULO("São Paulo", "SP", Regiao.SUDESTE),
    /**
     * Nome: Sergipe, Sigla: SE
     */
    SERGIPE("Sergipe", "SE", Regiao.NORDESTE),
    /**
     * Nome: Tocantins, Sigla: TO
     */
    TOCANTINS("Tocantins", "TO", Regiao.NORTE);
    private String nome;
    private String sigla;
    private Regiao regiao;
    
    /**
     * Construtor que recebe nome sigla
     *
     * @param nome
     * @param sigla
     */
    private Estado(String nome, String sigla, Regiao regiao) {
        this.nome = nome;
        this.sigla = sigla;       
        this.regiao = regiao;
    }
    
	public static List<String> recuperaEstados(){
		List<String> estados = new ArrayList<>();
		for (Estado estado : Arrays.asList(Estado.values())) {
			estados.add(estado.getNome());
		}
		return estados;
	}    

    /**
     * Retorna nome
     * 
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna sigla
     *
     * @return sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Retorna região
     * @return regiao
     */
    public Regiao getRegiao() {
        return regiao;
    }
}