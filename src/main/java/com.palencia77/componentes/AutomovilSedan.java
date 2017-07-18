package com.palencia77.componentes;

import java.math.BigDecimal;

/**
 * Created by palencia77 on 7/17/17.
 */
public class AutomovilSedan extends Automovil {

    public AutomovilSedan() {
        super(230_000d);
        this.setDescripcion("Autom\u00F3vil Sed\u00E1n");
    }

    @Override
    public Double calcularCostoTotal() {
        return this.getPrecio();
    }
}
