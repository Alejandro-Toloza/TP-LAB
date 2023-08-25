package org.store;

import org.store.model.Tienda;
import org.store.model.productos.Bebidas;
import org.store.model.productos.Envasados;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //BEBIDAS:

        System.out.println("//------------------------------//");

        Bebidas coca = new Bebidas();
        coca.setDescription("Coca");
        coca.setCodigo("AC134");
        coca.setPriceUnit(700);
        coca.setEsAlcoholica(false);
        coca.setImportado(false);
        // descuento
        coca.setDescuento(10);
        System.out.println(coca.precioDescuento(coca));
        coca.calcularFechaYvencimiento("36", LocalDate.of(2022,10,11));


        Tienda.agregarProducto(coca.getDescription(), coca.getPriceUnit());

        System.out.println("El precio de la coca es: $" + Tienda.obtenerPrecio("Coca"));
        System.out.println("Fecha de venciemiento: "+coca.getFecha());


        //ENVASADOS:
        System.out.println("//------------------------------//");

        Envasados provenzal = new Envasados();
        provenzal.setDescription("Provenzal");
        provenzal.setCodigo("AB134");
        provenzal.setPriceUnit(980);
        provenzal.setImportado(true);
        provenzal.setTipoEnvase("Vidrio");
        provenzal.calcularFechaYvencimiento("21", LocalDate.of(2025,10,11));

        Tienda.agregarProducto(provenzal.getDescription(), provenzal.getPriceUnit());

        System.out.println("El precio de la Quilmes es: $" + Tienda.obtenerPrecio("Provenzal"));
        System.out.println("Fecha de venciemiento: "+provenzal.getFecha());
        System.out.println("Importado:" + (provenzal.isImportado()));
        System.out.println("Tipo de Envase: " + provenzal.getTipoEnvase());

        coca.calcularFechaYvencimiento("17", LocalDate.of(2025,10,11));


    }
}