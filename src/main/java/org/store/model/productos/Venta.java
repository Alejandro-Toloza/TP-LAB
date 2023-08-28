package org.store.model.productos;

import org.store.model.Productos;
import org.store.model.Tienda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Venta extends Tienda {
    private int idVenta;
    private Date fecha;
    private double total;
    private static Map<Productos, Integer> productosEnVenta;

    public Venta(int idVenta, Date fecha) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.total = 0;
        this.productosEnVenta = new HashMap<>();
    }


    public void agregarProducto() {

    }

    public void agregarProducto(Productos producto, Integer cantidad) {
        if (Tienda.getStockProductos() >= cantidad) {
            productosEnVenta.put(producto, cantidad);
            System.out.println("PRODUCTO EN CARRO "+productosEnVenta.put(producto, cantidad));
            total += producto.calcularTotal(cantidad);
            producto.setStock(producto.getStock() - cantidad);
            Tienda.setCaja(Tienda.getCaja() + total);
        } else {
            System.out.println("No hay suficiente stock de " + producto);
        }
    }

    public void mostrarVenta() {
        System.out.println("Venta #"+ idVenta + " - Fecha: " + fecha);
        System.out.println("Total de la venta: $" + total);
    }




}
