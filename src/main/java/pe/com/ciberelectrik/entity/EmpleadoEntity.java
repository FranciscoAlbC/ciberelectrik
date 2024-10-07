package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="EmpleadoEntity")
@Table(name="empleado")
public class EmpleadoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codemp")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nomemp")
    private String nombre;

    @Column(name = "apepemp")
    private String apellidoPaterno;

    @Column(name = "apememp")
    private String apellidoMaterno;

    @Column(name = "dniemp")
    private String dni;

    @Column(name = "fecemp")
    private Date fecha;

    @Column(name = "diremp")
    private String direccion;

    @Column(name = "telemp")
    private String telefono;

    @Column(name = "celemp")
    private String celular;

    @Column(name = "coremp")
    private String correo;

    @Column(name = "sexemp")
    private String sexo;

    @Column(name = "usuemp")
    private String usuemp;

    @Column(name ="claemp")
    private String clase;

    @Column(name = "estemp")
    private boolean estado;

    @ManyToOne
    @JoinColumn(name="coddis", nullable=false)
    private DistritoEntity distrito;

    @ManyToOne
    @JoinColumn(name="codrol", nullable = false)
    private RolEntity rol;


}
