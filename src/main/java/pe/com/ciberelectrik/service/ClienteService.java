package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.ClienteEntity;
import java.util.List;

public interface ClienteService {

    public List<ClienteEntity> findAll();

    public List<ClienteEntity> findAllCustom();

    public ClienteEntity findById(long id);

    public ClienteEntity add(ClienteEntity c);

    public ClienteEntity update(ClienteEntity c);

    public ClienteEntity delete(ClienteEntity c);
}
