package pe.com.ciberelectrik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.ciberelectrik.service.EmpleadoService;

@Controller
public class EmpleadoController {

    @Autowired
    private EmpleadoService servicio;

    @GetMapping("/listarempleado")
    public String MostrarEmpleado(Model model) {
        model.addAttribute("empleados", servicio.findAllCustom());
        return "empleado/listar_empleado";
    }
}
