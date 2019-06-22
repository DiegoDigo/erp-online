package br.com.control.mensageria.consumidor.erp;

import br.com.control.cadastro.MotivoGeralService;
import br.com.control.cadastro.sincronismo.SincronismoCadastroService;
import br.com.control.portal.enums.CadastrosEnum;
import br.com.control.portal.mensageria.to.MotivoGeralTO;
import br.com.control.vendas.cadastro.modelo.MotivoGeral;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

@Component
public class MotivoGeralConsumer extends ERPConsumer {

    private static Logger log = LoggerFactory.getLogger(MotivoGeralConsumer.class);

    @Autowired
    private SincronismoCadastroService sincronismoCadastroService;

    @Autowired
    MotivoGeralService motivoGeralService;

    @JmsListener(destination = "VW_MOTIVO_GERAL", containerFactory = "jmsListenerContainerFactoryJControl")
    public void sinalizaStatusPedido(final Message<String> message) throws JMSException {
        String[] mensagem = message.getPayload().split("\\|");
        if (mensagem.length > 0) {
            log.info("### VW_MOTIVO_GERAL: " + mensagem[0]);

//            if (mensagem[0].trim().length() == 1){
//                mensagem[0] = "00" + mensagem[0].trim();
//            }

            MotivoGeral motivoGeral = motivoGeralService.listarMotivosPorCodigoETipo(mensagem[0].trim(), mensagem[1]);
            if (motivoGeral == null) {
                log.warn(String.format("O motivo geral com o codigo %s e o tipo %s nao encontrado no DBMaker!", mensagem[0], mensagem[1]));
                return;
            }

            sincronismoCadastroService.enviaParaOPortal(criaIdentificacaoServico(CadastrosEnum.MOTIVO_GERAL), new MotivoGeralTO(motivoGeral), "Motivo Geral");
            log.info("--> Motivo Geral com o codigo: " + mensagem[0] + " enviado para o Portal!");

        }

    }
}