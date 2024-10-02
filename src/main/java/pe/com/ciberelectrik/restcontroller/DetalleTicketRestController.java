package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.DetalleTicketpedidoEntity;
import pe.com.ciberelectrik.service.DetalleTicketpedidoService;

import java.util.List;

@RestController
@RequestMapping("/detalleticket")
public class DetalleTicketRestController {

    @Autowired
    private DetalleTicketpedidoService servicio;

    @GetMapping
    public List<DetalleTicketpedidoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/{id}")
    public DetalleTicketpedidoEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public DetalleTicketpedidoEntity add(@RequestBody DetalleTicketpedidoEntity dp) {
        return servicio.add(dp);
    }

    @PutMapping("/{id}")
    public DetalleTicketpedidoEntity update(@PathVariable long id, @RequestBody DetalleTicketpedidoEntity dp) {
        dp.setNumero(id);
        return servicio.update(dp);
    }

}
