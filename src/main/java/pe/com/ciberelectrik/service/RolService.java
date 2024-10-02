package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.RolEntity;

import java.util.List;

public interface RolService {

    public List<RolEntity> findAll();

    public List<RolEntity> findAllCustom();

    public RolEntity findById(long id);

    public RolEntity add(RolEntity r);

    public RolEntity update(RolEntity r);

    public RolEntity delete(RolEntity r);
}
