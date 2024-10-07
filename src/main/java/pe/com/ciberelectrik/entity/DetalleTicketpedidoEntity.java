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


}
