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
@Entity(name="MarcaEntity")
@Table(name="marca")
public class MarcaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codmar")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nommar")
    private String nombre;

    @Column(name = "estmar")
    private boolean estado;


}
