package com.palencia77.componentes;

import java.math.BigDecimal;

/**
 * Created by palencia77 on 7/17/17.
 */
public class AutomovilCoupe extends Automovil{

    public AutomovilCoupe() {
        super(270_000d);
        this.setDescripcion("Autom\u00F3vil Coup\u00E9");
    }

    @Override
    public Double calcularCostoTotal() {
        return this.getPrecio();
    }
}
