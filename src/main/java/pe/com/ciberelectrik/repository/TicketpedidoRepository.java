package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ciberelectrik.entity.TicketpedidoEntity;

import java.util.List;

public interface TicketpedidoRepository extends JpaRepository<TicketpedidoEntity, Long> {

    @Query("select tp from TicketpedidoEntity tp where tp.estado = true")
    List<TicketpedidoEntity> findAllCustom();
}
