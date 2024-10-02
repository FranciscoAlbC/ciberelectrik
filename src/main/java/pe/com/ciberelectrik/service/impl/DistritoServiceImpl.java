package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.DistritoEntity;
import pe.com.ciberelectrik.repository.DistritoRepository;
import pe.com.ciberelectrik.service.DistritoService;

import java.util.List;

@Service
public class DistritoServiceImpl implements DistritoService {

    @Autowired
    private DistritoRepository repositorio;

    @Override
    public List<DistritoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<DistritoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public DistritoEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public DistritoEntity add(DistritoEntity d) {
        return repositorio.save(d);
    }

    @Override
    public DistritoEntity update(DistritoEntity d) {
        DistritoEntity distrito = new DistritoEntity();
        BeanUtils.copyProperties(d,distrito);
        return repositorio.save(distrito);
    }

    @Override
    public DistritoEntity delete(DistritoEntity d) {
        DistritoEntity distrito = repositorio.findById(d.getCodigo()).get();
        distrito.setEstado(false);
        return repositorio.save(distrito);
    }
}
