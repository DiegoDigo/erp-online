package br.com.control.retransmissao.Repository;

import br.com.control.retransmissao.PedidoRetransmissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRetransmissaoRepository extends JpaRepository<PedidoRetransmissao, Long> {

    List<PedidoRetransmissao> findAllByTransmitido(boolean transmitido);

    @Query("SELECT p FROM PedidoRetransmissao p WHERE p.pedidoCapaPortal.recId = :recId")
    PedidoRetransmissao buscarPorRecId(@Param("recId") long recId);
}
