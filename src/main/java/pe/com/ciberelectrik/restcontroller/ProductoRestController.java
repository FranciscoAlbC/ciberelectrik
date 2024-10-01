package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.ProductoEntity;
import pe.com.ciberelectrik.service.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoRestController {

    @Autowired
    private ProductoService servicio;

    @GetMapping
    public List<ProductoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<ProductoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public ProductoEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public ProductoEntity add(@RequestBody ProductoEntity p) {
        return servicio.add(p);
    }

    @PutMapping("/{id}")
    public ProductoEntity update(@PathVariable long id, @RequestBody ProductoEntity p) {
        p.setId(id);
        return servicio.update(p);
    }

    @DeleteMapping("/{id}")
    public ProductoEntity delete(@PathVariable long id) {
        ProductoEntity objproducto = new ProductoEntity();
        objproducto.setEstado(false);
        return servicio.delete(ProductoEntity.builder().id(id).build());
    }
}
