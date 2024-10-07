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


}
