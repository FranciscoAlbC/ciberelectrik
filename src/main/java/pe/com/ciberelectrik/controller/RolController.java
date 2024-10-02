package pe.com.ciberelectrik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.ciberelectrik.service.RolService;

@Controller
public class RolController {

    @Autowired
    private RolService servicio;

    @GetMapping("/listarrol")
    private String MostrarRol(Model model){
        model.addAttribute("roles", servicio.findAllCustom());
        return "rol/listar_rol";
    }
}
