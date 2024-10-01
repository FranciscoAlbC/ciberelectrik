package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ciberelectrik.entity.MarcaEntity;
import pe.com.ciberelectrik.entity.ProductoEntity;

import java.util.List;

public interface MarcaRepository extends JpaRepository<MarcaEntity, Long> {

    @Query("select m from MarcaEntity m where m.estado = true")
    List<MarcaEntity> findAllCustom();
}
