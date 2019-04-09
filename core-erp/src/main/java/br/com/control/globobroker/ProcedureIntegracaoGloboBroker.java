package br.com.control.globobroker;

import br.com.control.globobroker.model.envio.MovimentoFinanceiroGloboBroker;

public enum ProcedureIntegracaoGloboBroker {

	CONFIRMACAO_ENVIO_PEDIDO_ERPTEC("SP_CONFIRMACAO_ENVIO_PEDIDO_ERPTEC", MovimentoFinanceiroGloboBroker.class);

	private String procedure;
	private Class<?> classe;

	private ProcedureIntegracaoGloboBroker(String procedure, Class<?> classe) {
		this.procedure = procedure;
		this.classe = classe;
	}

	public String getProcedure() {
		return procedure;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	public Class<?> getClasse() {
		return classe;
	}

	public void setClasse(Class<?> classe) {
		this.classe = classe;
	}

}