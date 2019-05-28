package br.com.control.portal.Repository;

import br.com.control.portal.Model.PedidoItemPortal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoItemRepository extends JpaRepository<PedidoItemPortal, Long> {
}
