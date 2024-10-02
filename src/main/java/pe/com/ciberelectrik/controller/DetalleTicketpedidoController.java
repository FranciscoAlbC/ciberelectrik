package pe.com.ciberelectrik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.ciberelectrik.service.DetalleTicketpedidoService;

@Controller
public class DetalleTicketpedidoController {

    @Autowired
    private DetalleTicketpedidoService servicio;

    @GetMapping("/listardetalle")
    private String MostrarDetalle(Model model) {
        model.addAttribute("detalles", servicio.findAll());
        return "detalleticketpedido/listar_detalle";
    }
}
