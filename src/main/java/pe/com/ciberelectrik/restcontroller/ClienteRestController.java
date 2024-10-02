package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.CategoriaEntity;
import pe.com.ciberelectrik.entity.ClienteEntity;
import pe.com.ciberelectrik.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteRestController {

    @Autowired
    private ClienteService servicio;

    @GetMapping
    public List<ClienteEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<ClienteEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public ClienteEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public ClienteEntity add(@RequestBody ClienteEntity c) {
        return servicio.add(c);
    }

    @PutMapping("/{id}")
    public ClienteEntity update(@PathVariable long id, @RequestBody ClienteEntity c) {
        c.setCodigo(id);
        return servicio.update(c);
    }

    @DeleteMapping("/{id}")
    public ClienteEntity delete(@PathVariable long id) {
        ClienteEntity cliente = new ClienteEntity();
        cliente.setEstado(false);
        return servicio.delete(ClienteEntity.builder().codigo(id).build());
    }
}
