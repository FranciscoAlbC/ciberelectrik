package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.MarcaEntity;
import pe.com.ciberelectrik.service.MarcaService;

import java.util.List;

@RestController
@RequestMapping("/marca")
public class MarcaRestController {

    @Autowired
    private MarcaService servicio;

    @GetMapping
    public List<MarcaEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<MarcaEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public MarcaEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public MarcaEntity add(@RequestBody MarcaEntity m) {
        return servicio.add(m);
    }

    //actualizar --> PUT
    @PutMapping("/{id}")
    public MarcaEntity update(@PathVariable long id, @RequestBody MarcaEntity m) {
        m.setId(id);
        return servicio.update(m);
    }

    @DeleteMapping("/{id}")
    public MarcaEntity delete(@PathVariable long id) {
        MarcaEntity objmarca = new MarcaEntity();
        objmarca.setEstado(false);
        return servicio.delete(MarcaEntity.builder().id(id).build());
    }
}
