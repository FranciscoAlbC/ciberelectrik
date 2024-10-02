package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.TicketpedidoEntity;
import pe.com.ciberelectrik.repository.TicketpedidoRepository;
import pe.com.ciberelectrik.service.TicketpedidoService;

import java.util.List;

@Service
public class TicketpedidoServiceImpl implements TicketpedidoService {

    @Autowired
    private TicketpedidoRepository repositorio;

    @Override
    public List<TicketpedidoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<TicketpedidoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public TicketpedidoEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public TicketpedidoEntity add(TicketpedidoEntity tp) {
        return repositorio.save(tp);
    }

    @Override
    public TicketpedidoEntity update(TicketpedidoEntity tp) {
        TicketpedidoEntity ticketpedido = new TicketpedidoEntity();
        BeanUtils.copyProperties(tp, ticketpedido);
        return repositorio.save(ticketpedido);
    }

    @Override
    public TicketpedidoEntity delete(TicketpedidoEntity tp) {
        TicketpedidoEntity ticketpedido = repositorio.findById(tp.getNumero()).get();
        ticketpedido.setEstado(false);
        return repositorio.save(ticketpedido);
    }
}
