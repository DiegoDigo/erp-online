package br.com.control.cadastro.sincronismo;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import br.com.control.cadastro.ComodatoService;
import br.com.control.cadastro.MovimentoFinanceiroService;
import br.com.control.mensageria.produtor.SincronismoAgendadoProducer;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.integracao.Identificacao;
import br.com.control.portal.integracao.MensagemRetorno;
import br.com.control.portal.integracao.Sistema;
import br.com.control.portal.mensageria.to.ComodatoTO;
import br.com.control.portal.mensageria.to.MovimentoFinanceiroTO;
import br.com.control.vendas.cadastro.modelo.Comodato;
import br.com.control.vendas.cadastro.modelo.MovimentoFinanceiro;

@Service
public class SincronismosAgendadosService {

	private static final Logger LOG = Logger.getLogger(SincronismosAgendadosService.class);

	@Autowired
	private ComodatoService comodatoService;

	@Autowired
	private MovimentoFinanceiroService movimentoFinanceiroService;

	@Value("${numero_matricula_empresa}")
	private String matriculaEmpresa;

	@Autowired
	private SincronismoAgendadoProducer sincronismoAgendadoProducer;

	@Scheduled(cron = "${periodo_sincronismo_comodato}")
	public void atualizaComodatosNoPortalDeVendas() {
		LOG.info("### PROCESSO DE ATUALIZACOES DE COMODATO AGENDADO PARA O PORTAL DE VENDAS WEB ###");
		List<Comodato> listaDeComodatosDaMatricula = comodatoService.listarComodato();
		List<ComodatoTO> comodatosTO = new ArrayList<>();
		for (Comodato comodato : listaDeComodatosDaMatricula) {
			ComodatoTO comodatoTO = new ComodatoTO(comodato);
			comodatosTO.add(comodatoTO);
		}
		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Comodatos Listado com sucessos !", comodatosTO,
				criaIdentificacao(CadastrosEnum.COMODATO));
		sincronismoAgendadoProducer.sendMessage(msg);
	}

//	@Scheduled(cron = "${periodo_sincronismo_historico_pedidos}")
//	public void atualizaHistoricosPedidoCapaNoPortalDeVendas() {
//		LOG.info("### PROCESSO DE ATUALIZACOES DE HISTORICO DE PEDIDOS CAPA AGENDADO PARA O PORTAL DE VENDAS WEB ###");
//		List<HistoricoPedidoCapa> listaDeHistoricosDaMatricula = historicoPedidoCapaService.listarHistoricoCapa();
//		List<HistoricoPedidoCapaTO> historicosTO = new ArrayList<>();
//		for (HistoricoPedidoCapa historico : listaDeHistoricosDaMatricula) {
//			HistoricoPedidoCapaTO historicoTO = new HistoricoPedidoCapaTO(historico);
//			historicosTO.add(historicoTO);
//		}
//		MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Historicos Listado com sucessos !", historicosTO,
//				criaIdentificacao(CadastrosEnum.HISTORICO_PEDIDO_CAPA));
//		sincronismoAgendadoProducer.sendMessage(msg);
//	}

	@Scheduled(cron = "${periodo_sincronismo_movimento_financeiro}")
	public void atualizaMovimentosFinanceirosNoPortalDeVendas() {
		try {
			LOG.info("### PROCESSO DE ATUALIZACOES DE MOVIMENTOS FINANCEIROS AGENDADO PARA O PORTAL DE VENDAS WEB ###");
			List<MovimentoFinanceiro> listaDeMovimentosDaMatricula = movimentoFinanceiroService.listar();
			LOG.info("--> Lista com " + listaDeMovimentosDaMatricula.size() + " movimentos.");
			List<MovimentoFinanceiroTO> movimentosFinanceirosTO = new ArrayList<>();
			for (MovimentoFinanceiro movimentoFinanceiro : listaDeMovimentosDaMatricula) {
				MovimentoFinanceiroTO movimentoFinanceiroTO = new MovimentoFinanceiroTO(movimentoFinanceiro);
				movimentosFinanceirosTO.add(movimentoFinanceiroTO);
			}
			MensagemRetorno msg = new MensagemRetorno(HttpStatus.OK, "Movimentos Financeiros Listados com sucessos !",
					movimentosFinanceirosTO, criaIdentificacao(CadastrosEnum.MOVIMENTO_FINANCEIRO));
			LOG.info("--> enviando para a fila.");
			sincronismoAgendadoProducer.sendMessage(msg);
			LOG.info("--> enviado para a fila.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Identificacao criaIdentificacao(CadastrosEnum cadastro) {
		Identificacao identificacao = new Identificacao();
		identificacao.setCadastroASincronizar(cadastro);
		identificacao.setMatriculaAssociada(matriculaEmpresa);
		identificacao.setDestino(Sistema.PORTAL_VENDAS);
		identificacao.setOrigem(Sistema.ERP);
		return identificacao;
	}

}
