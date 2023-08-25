package org.store.model;

import java.util.HashMap;
import java.util.Map;

public abstract class Tienda {
    private static Map<String, Double> inventario;

    public Tienda() {
        inventario = new HashMap<>();
    }

    public static void agregarProducto(String nombre, double precio) {
        inventario.put(nombre, precio);
        System.out.println("Se ha agregado el producto '" + nombre + "' con precio $" + precio + " al inventario.");
    }

    public static double obtenerPrecio(String nombre) {
        Double precio = inventario.get(nombre);
        return precio != null ? precio : 0.0;
    }
}