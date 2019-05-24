package br.com.control.retransmissao.Model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Retransmissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String motivo;
    private boolean transmitido;

    public Retransmissao() {
    }

    public Retransmissao(String motivo, boolean transmitido) {
        this.motivo = motivo;
        this.transmitido = transmitido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isTransmitido() {
        return transmitido;
    }

    public void setTransmitido(boolean transmitido) {
        this.transmitido = transmitido;
    }
}