package com.palencia77.decoradores;

import com.palencia77.componentes.Automovil;

import java.math.BigDecimal;

/**
 * Created by palencia77 on 7/17/17.
 */
public abstract class OpcionalesDecorator extends Automovil {
    private Automovil automovil;

    protected OpcionalesDecorator(Double precio, Automovil automovil) {
        super(precio);
        this.automovil = automovil;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }
}
