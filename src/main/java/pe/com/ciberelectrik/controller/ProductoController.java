package pe.com.ciberelectrik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pe.com.ciberelectrik.entity.ProductoEntity;
import pe.com.ciberelectrik.service.CategoriaService;
import pe.com.ciberelectrik.service.MarcaService;
import pe.com.ciberelectrik.service.ProductoService;

@Controller
public class ProductoController {

    @Autowired
    private ProductoService servicio;

    @Autowired
    private MarcaService serviciomarca;

    @Autowired
    private CategoriaService serviciocategoria;

    @GetMapping("/listarproducto")
    public String MostrarProducto(Model modelo) {
        modelo.addAttribute("productos", servicio.findAllCustom());
        return "producto/listar_producto";
    }

    @GetMapping("/registroproducto")
    public String MostrarRegistrarProducto(Model modelo) {
        modelo.addAttribute("marcas",
                serviciomarca.findAllCustom());
        modelo.addAttribute("categorias",
                serviciocategoria.findAllCustom());
        return "producto/registrar_producto";
    }

    @ModelAttribute("producto")
    public ProductoEntity ModeloProducto() {
        return new ProductoEntity();
    }


    @PostMapping("/registrarproducto")
    public String RegistrarProducto(@ModelAttribute("producto") ProductoEntity p) {
        servicio.add(p);
        return "redirect:/listarproducto";
    }
}

