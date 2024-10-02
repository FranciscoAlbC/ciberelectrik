package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.DetalleTicketpedidoEntity;

import java.util.List;

public interface DetalleTicketpedidoService {

    public List<DetalleTicketpedidoEntity> findAll();

    public DetalleTicketpedidoEntity findById(long id);

    public DetalleTicketpedidoEntity add(DetalleTicketpedidoEntity d);

    public DetalleTicketpedidoEntity update(DetalleTicketpedidoEntity d);

}
