package pe.com.ciberelectrik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.ciberelectrik.service.DistritoService;

@Controller
public class DistritoController {

    @Autowired
    private DistritoService servicio;

    @GetMapping("/listardistrito")
    public String MostrarDistrito(Model model) {
        model.addAttribute("distritos", servicio.findAllCustom());
        return "distrito/listar_distrito";
    }
}
