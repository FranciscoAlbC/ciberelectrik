package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ciberelectrik.entity.RolEntity;

import java.util.List;

public interface RolRespository extends JpaRepository<RolEntity, Long> {

    @Query("select r from RolEntity r where r.estado = true")
    List<RolEntity> findAllCustom();
}
