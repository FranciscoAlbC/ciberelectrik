package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.RolEntity;
import pe.com.ciberelectrik.repository.RolRespository;
import pe.com.ciberelectrik.service.RolService;

import java.util.List;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRespository repositorio;


    @Override
    public List<RolEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<RolEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public RolEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public RolEntity add(RolEntity r) {
        return repositorio.save(r);
    }

    @Override
    public RolEntity update(RolEntity r) {
        RolEntity rol = new RolEntity();
        BeanUtils.copyProperties(r, rol);
        return repositorio.save(rol);
    }

    @Override
    public RolEntity delete(RolEntity r) {
        RolEntity rol = repositorio.findById(r.getCodigo()).get();
        rol.setEstado(false);
        return repositorio.save(rol);
    }
}
