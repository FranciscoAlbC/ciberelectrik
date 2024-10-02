package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
