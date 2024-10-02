package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.DistritoEntity;
import pe.com.ciberelectrik.service.DistritoService;

import java.util.List;

@RestController
@RequestMapping("/distrito")
public class DistritoRestController {

    @Autowired
    private DistritoService servicio;

    @GetMapping
    public List<DistritoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<DistritoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public DistritoEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public DistritoEntity add(@RequestBody DistritoEntity d) {
        return servicio.add(d);
    }

    @PutMapping("/{id}")
    public DistritoEntity update(@PathVariable long id, @RequestBody DistritoEntity d) {
        d.setCodigo(id);
        return servicio.update(d);
    }

    @DeleteMapping("/{id}")
    public DistritoEntity delete(@PathVariable long id) {
        DistritoEntity distrito = new DistritoEntity();
        distrito.setEstado(false);
        return servicio.delete(DistritoEntity.builder().codigo(id).build());
    }


}
