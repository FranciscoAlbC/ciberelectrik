package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.CategoriaEntity;

import java.util.List;

public interface CategoriaService {

    public List<CategoriaEntity> findAll();

    public List<CategoriaEntity> findAllCustom();

    public CategoriaEntity findById(long id);

    public CategoriaEntity add(CategoriaEntity c);

    public CategoriaEntity update(CategoriaEntity c);

    public CategoriaEntity delete(CategoriaEntity c);

}
