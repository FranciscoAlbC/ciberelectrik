package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="RolEntity")
@Table(name="rol")
public class RolEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="codrol")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long codigo;

    @Column(name="nomrol")
    private String nombre;

    @Column(name="estado")
    private boolean estado;


}
