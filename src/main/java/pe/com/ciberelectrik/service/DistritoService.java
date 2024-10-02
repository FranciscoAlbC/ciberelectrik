package pe.com.ciberelectrik.service;


import pe.com.ciberelectrik.entity.DistritoEntity;
import java.util.List;

public interface DistritoService {

    public List<DistritoEntity> findAll();

    public List<DistritoEntity> findAllCustom();

    public DistritoEntity findById(long id);

    public DistritoEntity add(DistritoEntity d);

    public DistritoEntity update(DistritoEntity d);

    public DistritoEntity delete(DistritoEntity d);
}
