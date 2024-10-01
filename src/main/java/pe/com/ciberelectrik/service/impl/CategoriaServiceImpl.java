package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.CategoriaEntity;
import pe.com.ciberelectrik.repository.CategoriaRepository;
import pe.com.ciberelectrik.service.CategoriaService;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository repositorio;

    @Override
    public List<CategoriaEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<CategoriaEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public CategoriaEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public CategoriaEntity add(CategoriaEntity c) {
        return repositorio.save(c);
    }

    @Override
    public CategoriaEntity update(CategoriaEntity c) {
        CategoriaEntity objcategoira = new CategoriaEntity();
        BeanUtils.copyProperties(c, objcategoira);
        return repositorio.save(objcategoira);
    }

    @Override
    public CategoriaEntity delete(CategoriaEntity c) {
        CategoriaEntity objcategoria = repositorio.findById(c.getId()).get();
        objcategoria.setEstado(false);
        return repositorio.save(objcategoria);
    }
}
