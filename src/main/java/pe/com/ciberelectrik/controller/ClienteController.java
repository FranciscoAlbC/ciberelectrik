package pe.com.ciberelectrik.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.ciberelectrik.service.ClienteService;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService servicio;

    @GetMapping("/listarcliente")
    public String MostrarCliente(Model model) {
        model.addAttribute("clientes", servicio.findAllCustom());
        return "cliente/listar_cliente";
    }

}
