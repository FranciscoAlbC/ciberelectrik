package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="TicketpedidoEntity")
@Table(name="ticketpedido")
public class TicketpedidoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "nrotic")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numero;

    @Column(name = "fectic")
    private Date fecha;

    @Column(name = "esttic")
    private boolean estado;

    @ManyToOne
    @JoinColumn(name="codcli", nullable = false)
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name="codemp", nullable = false)
    private EmpleadoEntity  empleado;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public EmpleadoEntity getEmpleado() {
        return empleado;
    }

    public void setEmpleado(EmpleadoEntity empleado) {
        this.empleado = empleado;
    }
}
