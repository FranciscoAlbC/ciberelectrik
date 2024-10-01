package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.MarcaEntity;
import java.util.List;

public interface MarcaService {

    public List<MarcaEntity> findAll();

    public List<MarcaEntity> findAllCustom();

    public MarcaEntity findById(long id);

    public MarcaEntity add(MarcaEntity m);

    public MarcaEntity update(MarcaEntity m);

    public MarcaEntity delete(MarcaEntity m);

}
