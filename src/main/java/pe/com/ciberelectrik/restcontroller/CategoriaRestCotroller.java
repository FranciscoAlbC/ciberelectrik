package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.CategoriaEntity;
import pe.com.ciberelectrik.service.CategoriaService;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaRestCotroller {

    @Autowired
    private CategoriaService servicio;

    //Listados --> GET
    @GetMapping
    public List<CategoriaEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<CategoriaEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public CategoriaEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    //registrar -->POST
    @PostMapping
    public CategoriaEntity add(@RequestBody CategoriaEntity c) {
        return servicio.add(c);
    }

    //actualizar --> PUT
    @PutMapping("/{id}")
    public CategoriaEntity update(@PathVariable long id, @RequestBody CategoriaEntity c) {
        c.setId(id);
        return servicio.update(c);
    }

    //eliminar --> DELETE
    @DeleteMapping("/{id}")
    public CategoriaEntity delete(@PathVariable long id) {
        CategoriaEntity objcategoria = new CategoriaEntity();
        objcategoria.setEstado(false);
        return servicio.delete(CategoriaEntity.builder().id(id).build());
    }
}
