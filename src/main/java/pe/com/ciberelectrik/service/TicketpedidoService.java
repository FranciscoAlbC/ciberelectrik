package pe.com.ciberelectrik.service;


import pe.com.ciberelectrik.entity.TicketpedidoEntity;
import java.util.List;

public interface TicketpedidoService {

    public List<TicketpedidoEntity> findAll();

    public List<TicketpedidoEntity> findAllCustom();

    public TicketpedidoEntity findById(long id);

    public TicketpedidoEntity add(TicketpedidoEntity tp);

    public TicketpedidoEntity update(TicketpedidoEntity tp);

    public TicketpedidoEntity delete(TicketpedidoEntity tp);
}
