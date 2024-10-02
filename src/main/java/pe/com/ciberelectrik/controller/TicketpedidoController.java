package pe.com.ciberelectrik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.ciberelectrik.service.TicketpedidoService;

@Controller
public class TicketpedidoController {

    @Autowired
    private TicketpedidoService servicio;

    @GetMapping("/listarTicketpedido")
    private String MostrarTicketpedido(Model model) {
        model.addAttribute("tickets", servicio.findAllCustom());
        return "ticketpedido/listar_ticketpedido";
    }
}
