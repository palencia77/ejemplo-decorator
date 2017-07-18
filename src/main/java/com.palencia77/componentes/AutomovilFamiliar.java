package com.palencia77.componentes;

import java.math.BigDecimal;

/**
 * Created by palencia77 on 7/17/17.
 */
public class AutomovilFamiliar extends Automovil {

    public AutomovilFamiliar() {
        super(245_000d);
        this.setDescripcion("Autom\u00F3vil Familiar");
    }

    @Override
    public Double calcularCostoTotal() {
        return this.getPrecio();
    }
}
