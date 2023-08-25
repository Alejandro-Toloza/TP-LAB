package org.store.impl;

import org.store.model.Productos;

public interface ProductosConDescuento {

    void setDescuento(double descuento);
    double getDescuento();

    double precioDescuento(Productos precioProduct);

}
