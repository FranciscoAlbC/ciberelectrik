package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.DetalleTicketpedidoEntity;
import pe.com.ciberelectrik.repository.DetalleTicketpedidoRepository;
import pe.com.ciberelectrik.service.DetalleTicketpedidoService;

import java.util.List;

@Service
public class DetalleTicketpedidoImpl implements DetalleTicketpedidoService {

    @Autowired
    private DetalleTicketpedidoRepository repositorio;

    @Override
    public List<DetalleTicketpedidoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public DetalleTicketpedidoEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public DetalleTicketpedidoEntity add(DetalleTicketpedidoEntity d) {
        return repositorio.save(d);
    }

    @Override
    public DetalleTicketpedidoEntity update(DetalleTicketpedidoEntity d) {
        DetalleTicketpedidoEntity detalleTicketpedido = new DetalleTicketpedidoEntity();
        BeanUtils.copyProperties(d,detalleTicketpedido);
        return repositorio.save(detalleTicketpedido);
    }

}
