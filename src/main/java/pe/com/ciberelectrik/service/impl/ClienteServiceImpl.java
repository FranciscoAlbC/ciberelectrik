package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.ClienteEntity;
import pe.com.ciberelectrik.repository.ClienteRepository;
import pe.com.ciberelectrik.service.ClienteService;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repositorio;

    @Override
    public List<ClienteEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<ClienteEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public ClienteEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public ClienteEntity add(ClienteEntity c) {
        return repositorio.save(c);
    }

    @Override
    public ClienteEntity update(ClienteEntity c) {
        ClienteEntity cliente = new ClienteEntity();
        BeanUtils.copyProperties(c, cliente);
        return repositorio.save(cliente);
    }

    @Override
    public ClienteEntity delete(ClienteEntity c) {
        ClienteEntity cliente = repositorio.findById(c.getCodigo()).get();
        cliente.setEstado(false);
        return repositorio.save(cliente);
    }
}
