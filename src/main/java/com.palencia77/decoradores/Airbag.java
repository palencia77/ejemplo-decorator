package com.palencia77.decoradores;

import com.palencia77.componentes.Automovil;

/**
 * Created by palencia77 on 7/17/17.
 */
public class Airbag extends OpcionalesDecorator {

    public Airbag(Automovil automovil) {
        super(7_000d, automovil);
    }

    @Override
    public String getDescripcion() {
        return "AB";
    }

    @Override
    public Double calcularCostoTotal() {
        return this.getAutomovil().calcularCostoTotal() + this.getPrecio();
    }
}
