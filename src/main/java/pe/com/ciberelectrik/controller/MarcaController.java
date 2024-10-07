package pe.com.ciberelectrik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pe.com.ciberelectrik.entity.MarcaEntity;
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

    @GetMapping("/registromarca")
    public String MostrarRegistroMarca() {
        return "marca/registrar_marca";
    }

    @ModelAttribute("marca")
    public MarcaEntity ModeloMarca() {
        return new MarcaEntity();
    }

    @PostMapping("/registrarmarca")
    public String RegistrarMarca(@ModelAttribute("marca") MarcaEntity m) {
        servicio.add(m);
        return "redirect:/listarmarca";
    }
}