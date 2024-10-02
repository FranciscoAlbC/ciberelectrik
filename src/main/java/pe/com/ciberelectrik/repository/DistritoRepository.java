package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ciberelectrik.entity.DistritoEntity;

import java.util.List;

public interface DistritoRepository extends JpaRepository<DistritoEntity, Long> {

    @Query("select d from DistritoEntity d where d.estado = true")
    List<DistritoEntity> findAllCustom();
}
