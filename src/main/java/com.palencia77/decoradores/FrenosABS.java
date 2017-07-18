package com.palencia77.decoradores;

import com.palencia77.componentes.Automovil;

import java.math.BigDecimal;

/**
 * Created by palencia77 on 7/17/17.
 */
public class FrenosABS extends OpcionalesDecorator {

    public FrenosABS(Automovil automovil) {
        super(14_000d, automovil);
    }

    @Override
    public String getDescripcion() {
        return "ABS";
    }

    @Override
    public Double calcularCostoTotal() {
        return this.getAutomovil().calcularCostoTotal() + this.getPrecio();
    }
}
