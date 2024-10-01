package pe.com.ciberelectrik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.ciberelectrik.service.MarcaService;

@Controller
public class MarcaController {

    @Autowired
    private MarcaService servicio;

    @GetMapping("/listarmarca")
    public String MostrarMarca(Model modelo) {
        modelo.addAttribute("marcas", servicio.findAllCustom());
        return "marca/listar_marca";
    }
}
