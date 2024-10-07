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
@Entity(name="ProductoEntity")
@Table(name="producto")
public class ProductoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codpro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nompro")
    private String nombre;

    @Column(name = "despro")
    private String descripcion;

    @Column(name = "prepro")
    private double precio;

    @Column(name = "canpro")
    private int cantidad;

    @Column(name = "estpro")
    private boolean estado;

    @ManyToOne
    @JoinColumn(name = "codcat", nullable = false)
    private CategoriaEntity categoria;

    @ManyToOne
    @JoinColumn(name = "codmar", nullable = false)
    private MarcaEntity marca;


}
