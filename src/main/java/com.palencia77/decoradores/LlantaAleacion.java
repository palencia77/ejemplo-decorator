package com.palencia77.decoradores;

import com.palencia77.componentes.Automovil;

/**
 * Created by palencia77 on 7/17/17.
 */
public class LlantaAleacion extends OpcionalesDecorator {

    public LlantaAleacion(Automovil automovil) {
        super(12_000.00, automovil);
    }

    @Override
    public String getDescripcion() {
        return "LL";
    }

    @Override
    public Double calcularCostoTotal() {
        return this.getAutomovil().calcularCostoTotal() + this.getPrecio();
    }
}
