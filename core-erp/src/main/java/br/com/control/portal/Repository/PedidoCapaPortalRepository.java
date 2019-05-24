package br.com.control.portal.Repository;

import br.com.control.portal.Model.PedidoCapaPortal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PedidoCapaPortalRepository extends JpaRepository<PedidoCapaPortal, Long> {

    Optional<PedidoCapaPortal> findByRecId(long recId);

}


