package pe.com.ciberelectrik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping("/index")
    public String MostrarInicio() {
        return "index";
    }

    @GetMapping("/menuprincipal")
    public String MostrarMenu() {
        return "menuprincipal";
    }
}
