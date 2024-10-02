package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.EmpleadoEntity;
import pe.com.ciberelectrik.service.EmpleadoService;

import java.util.List;

@RestController
@RequestMapping("/empleado")
public class EmpleadoRestController {

    @Autowired
    private EmpleadoService servicio;

    @GetMapping
    public List<EmpleadoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<EmpleadoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public EmpleadoEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public EmpleadoEntity add(@RequestBody EmpleadoEntity e) {
        return servicio.add(e);
    }

    @PutMapping("/{id}")
    public EmpleadoEntity update(@PathVariable long id, @RequestBody EmpleadoEntity e) {
        e.setCodigo(id);
        return servicio.update(e);
    }

    @DeleteMapping("/{id}")
    public EmpleadoEntity delete(@PathVariable long id) {
        EmpleadoEntity empleado = new EmpleadoEntity();
        empleado.setEstado(false);
        return servicio.delete(EmpleadoEntity.builder().codigo(id).build());
    }
}
