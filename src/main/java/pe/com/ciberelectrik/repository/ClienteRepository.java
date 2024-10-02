package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ciberelectrik.entity.ClienteEntity;

import java.util.List;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    @Query("select c from ClienteEntity c where c.estado = true")
    List<ClienteEntity> findAllCustom();
}
