package persistenceapp.entidades;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;


import java.io.Serializable;

@Entity
//@Audited
@Data
@Builder
@Table(name = "detalle_factura")
public class DetalleFactura implements Serializable {
    private static final long serialVersionID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "subtotal")
    private int subtotal;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_factura")
    private Factura factura;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_articulo")
    private Articulo articulo;


    public DetalleFactura() {

    }
}
