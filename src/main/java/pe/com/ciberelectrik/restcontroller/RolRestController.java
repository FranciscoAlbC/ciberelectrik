package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.RolEntity;
import pe.com.ciberelectrik.service.RolService;

import java.util.List;

@RestController
@RequestMapping("/rol")
public class RolRestController {

    @Autowired
    private RolService servicio;

    @GetMapping
    public List<RolEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<RolEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public RolEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public RolEntity add(@RequestBody RolEntity r) {
        return servicio.add(r);
    }

    @PutMapping("/{id}")
    public RolEntity update(@PathVariable long id, @RequestBody RolEntity r) {
        r.setCodigo(id);
        return servicio.update(r);
    }

    @DeleteMapping("/{id}")
    public RolEntity delete(@PathVariable long id) {
        RolEntity rol = new RolEntity();
        rol.setEstado(false);
        return servicio.delete(RolEntity.builder().codigo(id).build());
    }
}
