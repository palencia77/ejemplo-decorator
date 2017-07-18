package com.palencia77.decoradores;

import com.palencia77.componentes.Automovil;

/**
 * Created by palencia77 on 7/17/17.
 */
public class TechoCorredizo extends OpcionalesDecorator {

    public TechoCorredizo(Automovil automovil) {
        super(12_000d, automovil);
    }

    @Override
    public String getDescripcion() {
        return "TC";
    }

    @Override
    public Double calcularCostoTotal() {
        return this.getAutomovil().calcularCostoTotal() + this.getPrecio();
    }
}
