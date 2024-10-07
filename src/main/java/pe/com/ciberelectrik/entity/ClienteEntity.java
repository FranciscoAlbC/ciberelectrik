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
@Entity(name="ClienteEntity")
@Table(name="cliente")
public class ClienteEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codcli")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nomcli")
    private String nombre;

    @Column(name = "apepcli")
    private String apellidoPaterno;

    @Column(name = "apemcli")
    private String apellidoMaterno;

    @Column(name = "dnicli")
    private String dni;

    @Column(name = "feccli")
    private Date fecha;

    @Column(name = "dircli")
    private String direccion;

    @Column(name = "telcli")
    private String telefono;

    @Column(name = "celcli")
    private String celular;

    @Column(name = "corcli")
    private String correo;

    @Column(name = "sexcli")
    private String sexo;

    @Column(name = "usuemp")
    private String usuemp;

    @Column(name = "estcli")
    private boolean estado;

    @ManyToOne
    @JoinColumn(name="coddis", nullable=false)
    private DistritoEntity distrito;



}
