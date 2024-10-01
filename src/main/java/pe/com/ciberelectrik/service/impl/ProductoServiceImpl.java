package pe.com.ciberelectrik.service.impl;

import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.MarcaEntity;
import pe.com.ciberelectrik.entity.ProductoEntity;
import pe.com.ciberelectrik.repository.ProductoRepository;
import pe.com.ciberelectrik.service.ProductoService;
import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repositorio;

    @Override
    public List<ProductoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<ProductoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public ProductoEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public ProductoEntity add(ProductoEntity p) {
        return repositorio.save(p);
    }

    @Override
    public ProductoEntity update(ProductoEntity p) {
        ProductoEntity objproducto = new ProductoEntity();
        BeanUtils.copyProperties(p, objproducto);
        return repositorio.save(objproducto);
    }

    @Override
    public ProductoEntity delete(ProductoEntity p) {
        ProductoEntity objproducto = repositorio.findById(p.getId()).get();
        objproducto.setEstado(false);
        return repositorio.save(objproducto);
    }
}
