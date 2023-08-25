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
        coca.calcular("36", LocalDate.of(2022,10,11));


        Tienda.agregarProducto(coca.getDescription(), coca.getPriceUnit());

        System.out.println("El precio de la coca es: $" + Tienda.obtenerPrecio("Coca"));
        System.out.println("Fecha de venciemiento: "+coca.fecha);


        //ENVASADOS:
        System.out.println("//------------------------------//");

        Envasados quilmes = new Envasados();
        quilmes.setDescription("Cerveza");
        quilmes.setCodigo("AB134");
        quilmes.setPriceUnit(980);
        quilmes.setImportado(true);
        quilmes.setTipoEnvase("Vidrio");
        quilmes.calcular("21", LocalDate.of(2025,10,11));

        Tienda.agregarProducto(quilmes.getDescription(), quilmes.getPriceUnit());

        System.out.println("El precio de la Quilmes es: $" + Tienda.obtenerPrecio("Cerveza"));
        System.out.println("Fecha de venciemiento: "+quilmes.fecha);
        System.out.println("Importado:" + (quilmes.isImportado()));
        System.out.println("Tipo de Envase: " + quilmes.getTipoEnvase());

        coca.calcular("17", LocalDate.of(2025,10,11));


    }
}