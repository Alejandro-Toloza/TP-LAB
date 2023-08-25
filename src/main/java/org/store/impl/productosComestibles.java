package org.store.impl;


import org.store.model.Productos;

import java.time.LocalDate;

public interface productosComestibles {

    void calcular(String calorias, LocalDate vencimiento);
    void setDescuento(double descuento);
    double getDescuento();

    double precioDescuento(Productos precioProduct);

}
