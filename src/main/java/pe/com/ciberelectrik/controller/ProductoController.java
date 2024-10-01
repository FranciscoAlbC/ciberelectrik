package pe.com.ciberelectrik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.ciberelectrik.service.ProductoService;

@Controller
public class ProductoController {

    @Autowired
    private ProductoService servicio;

    @GetMapping("/listarproducto")
    public String MostrarProducto(Model modelo) {
        modelo.addAttribute("productos", servicio.findAllCustom());
        return "producto/listar_producto";
    }
}
