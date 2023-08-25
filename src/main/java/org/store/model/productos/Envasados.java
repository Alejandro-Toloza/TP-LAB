package org.store.model.productos;

import org.store.model.Productos;

public class Envasados extends Productos {

    // Cod: ABXXX
    private String tipoEnvase;
    private boolean importado;

    public Envasados() {
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }

    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }
}
