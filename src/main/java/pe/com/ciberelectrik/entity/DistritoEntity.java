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
@Entity(name="DistritoEntity")
@Table(name="distrito")
public class DistritoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "coddis")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nomdis")
    private String nombre;

    @Column(name = "estado")
    private boolean estado;


}
