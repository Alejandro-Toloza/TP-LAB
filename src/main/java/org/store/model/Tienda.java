package org.store.model;

import java.util.HashMap;
import java.util.Map;

public abstract class Tienda {

    // nombre,
    //número máximo de productos en stock, saldo en la caja
    private String nombre;
    private static int stockProductos = 0;
    private static double caja = 0.0;
    private static Map<String, Double> inventario;

    public Tienda() {
        inventario = new HashMap<>();
    }

    public static void agregarProducto(String nombre, double precio) {

        Map<String, Double> inventario2;
        inventario2 = new HashMap<>();
        inventario2.put(nombre,precio);

        if(Tienda.caja>=inventario2.get(nombre)){
            inventario.put(nombre, precio);
            stockProductos++;
            double saldo = Tienda.getCaja() - inventario.get(nombre);
            Tienda.setCaja(saldo);
            System.out.println("Producto agregado con nombre: "+nombre+" . Precio: "+precio);

        }else {
            System.out.println("Saldo insuficiente");
            System.out.println("Porducto no agregado");
        }
    }

    public static double obtenerPrecio(String nombre) {
        Double precio = inventario.get(nombre);
        return precio != null ? precio : 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getStockProductos() {
        return stockProductos;
    }

    public static void setStockProductos(int stockProductos) {
        Tienda.stockProductos = stockProductos;
    }

    public static void setInventario(Map<String, Double> inventario) {
        Tienda.inventario = inventario;
    }

    public static double getCaja() {
        return caja;
    }

    public static void setCaja(double caja) {
        Tienda.caja = caja;
    }

}