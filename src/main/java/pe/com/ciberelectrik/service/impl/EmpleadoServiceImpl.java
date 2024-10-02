package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.EmpleadoEntity;
import pe.com.ciberelectrik.repository.EmpleadoRepository;
import pe.com.ciberelectrik.service.EmpleadoService;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository repositorio;

    @Override
    public List<EmpleadoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<EmpleadoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public EmpleadoEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public EmpleadoEntity add(EmpleadoEntity e) {
       return repositorio.save(e);
    }

    @Override
    public EmpleadoEntity update(EmpleadoEntity e) {
        EmpleadoEntity empleado = new EmpleadoEntity();
        BeanUtils.copyProperties(e,empleado);
        return repositorio.save(empleado);
    }

    @Override
    public EmpleadoEntity delete(EmpleadoEntity e) {
        EmpleadoEntity empleado = repositorio.findById(e.getCodigo()).get();
        empleado.setEstado(false);
        return repositorio.save(empleado);
    }
}
