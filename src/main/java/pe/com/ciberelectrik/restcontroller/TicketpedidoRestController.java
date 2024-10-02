package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.TicketpedidoEntity;
import pe.com.ciberelectrik.service.TicketpedidoService;
import java.util.List;

@RestController
@RequestMapping("/ticketpedido")
public class TicketpedidoRestController {

    @Autowired
    private TicketpedidoService servicio;

    @GetMapping
    public List<TicketpedidoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<TicketpedidoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public TicketpedidoEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public TicketpedidoEntity add(@RequestBody TicketpedidoEntity tp) {
        return servicio.add(tp);
    }

    @PutMapping("/{id}")
    public TicketpedidoEntity update(@PathVariable long id, @RequestBody TicketpedidoEntity tp) {
        tp.setNumero(id);
        return servicio.update(tp);
    }

    @DeleteMapping("/{id}")
    public TicketpedidoEntity delete(@PathVariable long id) {
        TicketpedidoEntity ticketpedido = new TicketpedidoEntity();
        ticketpedido.setEstado(false);
        return servicio.delete(TicketpedidoEntity.builder().numero(id).build());
    }
}
