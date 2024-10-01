package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.CategoriaEntity;
import pe.com.ciberelectrik.entity.MarcaEntity;
import pe.com.ciberelectrik.repository.MarcaRepository;
import pe.com.ciberelectrik.service.MarcaService;

import java.util.List;

@Service
public class MarcaServiceImpl implements MarcaService {

    @Autowired
    private MarcaRepository repositorio;

    @Override
    public List<MarcaEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<MarcaEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public MarcaEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public MarcaEntity add(MarcaEntity m) {
        return repositorio.save(m);
    }

    @Override
    public MarcaEntity update(MarcaEntity m) {
        MarcaEntity objmarca = new MarcaEntity();
        BeanUtils.copyProperties(m, objmarca);
        return repositorio.save(objmarca);
    }

    @Override
    public MarcaEntity delete(MarcaEntity m) {
        MarcaEntity objmarca = repositorio.findById(m.getId()).get();
        objmarca.setEstado(false);
        return repositorio.save(objmarca);
    }
}
