package org.store.model;


import org.store.impl.ProductosComestibles;
import org.store.impl.ProductosConDescuento;

import java.time.LocalDate;


public class Productos extends Tienda implements ProductosComestibles, ProductosConDescuento {

    private static long productId;
    private String codigo;
    private String description;
    private int stock;
    private double priceUnit;
    private double costUnit;


    private String calorias;
    private LocalDate fecha;
    private double descuento;



    public Productos() {

    }



    @Override
    public void calcularFechaYvencimiento(String cal, LocalDate fec) {
        this.calorias = cal;
        this.fecha = fec;
        System.out.println("Fecha Vencimiento: "+ this.fecha + "Calorias: "+ this.calorias);
    }

    @Override
    public double precioDescuento(Productos precioProduct) {
        double precio = (precioProduct.getPriceUnit() * precioProduct.descuento) / 100;
        double precioDescuento = precioProduct.getPriceUnit() - precio;
        return precioDescuento;
    }

    @Override
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }


    @Override
    public double getDescuento() {
        return descuento;
    }



    public LocalDate getFecha() {
        return fecha;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public static long getProductId() {
        return productId;
    }

    public static void setProductId(long productId) {
        Productos.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public double getCostUnit() {
        return costUnit;
    }

    public void setCostUnit(double costUnit) {
        this.costUnit = costUnit;
    }



}

