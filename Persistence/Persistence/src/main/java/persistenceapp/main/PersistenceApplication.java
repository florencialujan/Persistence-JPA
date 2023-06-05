package persistenceapp.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import persistenceapp.entidades.*;

@SpringBootApplication
public class PersistenceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersistenceApplication.class, args);


    /*    //try {
        //em.getTransaction().begin();


        Factura factura = new Factura();
        factura.setNumero(12);
        factura.setFecha("10/08/2020");
        Domicilio dom = Domicilio.builder().nombreCalle("San Martin").numero(1222).build();
        Cliente cliente = Cliente.builder().nombre("Pablo").apellido("Muñoz").dni(15245732).build();
        cliente.setDomicilio(dom);
        dom.setCliente(cliente);
        factura.setCliente(cliente);

        Categoria perecederos = Categoria.builder().denominacion("Perecederos").build();
        Categoria lacteos = Categoria.builder().denominacion("Lacteos").build();
        Categoria limpieza = Categoria.builder().denominacion("Limpieza").build();
        Articulo art1 = Articulo.builder()
                .cantidad(200)
                .denominacion("Yogunt Ser sabor frutilla")
                .precio(20)
                .build();
        Articulo art2 = Articulo.builder()
                .cantidad (300)
                .denominacion("Detergente Magistral")
                .precio(80)
                .build();

        art1.getCategorias().add(perecederos);
        art1.getCategorias().add(lacteos);
        lacteos.getArticulos().add(art1);
        perecederos.getArticulos().add(art1);
        art2.getCategorias().add(limpieza);
        limpieza.getArticulos().add(art2);

        DetalleFactura det1 = DetalleFactura.builder()
                .articulo(art1)
                .cantidad(2)
                .subtotal (40)
                .build();
        art1.getDetalle().add(det1);
        factura.getDetalleFacturas().add(det1);

        det1.setFactura(factura);

        DetalleFactura det2 = DetalleFactura.builder()
                .articulo(art2)
                .cantidad(1)
                .subtotal (80)
                .build();
        art2.getDetalle().add(det2);
        factura.getDetalleFacturas().add(det2);
        det2.setFactura(factura);
        factura.setTotal(120);

            /*em.persist(factura);


            Factura factura = em.find(Factura.class,1L);
            //factura.setNumero(85);
            //em.merge(factura);
            em.remove(factura);


            em.flush();
            em.getTransaction().commit();

        }catch (Exception e){
            em.getTransaction().rollback();
        }

        em.close();
        emf.close();
        */


    }
}
