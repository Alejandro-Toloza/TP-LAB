package org.store.model.productos;

import org.store.model.Productos;

public class Bebidas extends Productos {

    //Cod: ACXXX,

    private boolean esAlcoholica;
    private boolean importado;
    private String graduacionAlcoholica;

    public Bebidas() {
    }

    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }

    public boolean isEsAlcoholica() {
        return esAlcoholica;
    }

    public void setEsAlcoholica(boolean esAlcoholica) {
        this.esAlcoholica = esAlcoholica;
    }


    public String getGraduacionAlcoholica() {
        return graduacionAlcoholica;
    }

    public void setGraduacionAlcoholica(String graduacionAlcoholica) {
        this.graduacionAlcoholica = graduacionAlcoholica;
    }
}
