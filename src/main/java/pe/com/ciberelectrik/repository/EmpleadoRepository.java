package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ciberelectrik.entity.EmpleadoEntity;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long> {

    @Query("select e from EmpleadoEntity e where e.estado = true")
    List<EmpleadoEntity> findAllCustom();
}
