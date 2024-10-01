package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="DetalleTicketpedidoEntity")
@Table(name="detalleticketpedido")
public class DetalleTicketpedidoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="nrodettic")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long numero;

    @OneToOne
    @JoinColumn(name = "nrotic", nullable = false)
    private TicketpedidoEntity ticketpedido;

    @ManyToOne
    @JoinColumn(name = "codpro", nullable = false)
    private ProductoEntity producto;

    @Column(name = "cantic")
    private int cantidad;

    @Column(name = "pretic")
    private double precio;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ProductoEntity getProducto() {
        return producto;
    }

    public void setProducto(ProductoEntity producto) {
        this.producto = producto;
    }

    public TicketpedidoEntity getTicketpedido() {
        return ticketpedido;
    }

    public void setTicketpedido(TicketpedidoEntity ticketpedido) {
        this.ticketpedido = ticketpedido;
    }
}
