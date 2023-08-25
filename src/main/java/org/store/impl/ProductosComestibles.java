package org.store.impl;


import org.store.model.Productos;

import java.time.LocalDate;

public interface ProductosComestibles {

    void calcularFechaYvencimiento(String calorias, LocalDate vencimiento);


}
