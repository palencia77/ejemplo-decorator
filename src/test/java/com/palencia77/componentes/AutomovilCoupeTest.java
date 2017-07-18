package com.palencia77.componentes;

import com.palencia77.decoradores.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by palencia77 on 7/17/17.
 */
public class AutomovilCoupeTest {
    @Test
    public void calcularCostoTotal() throws Exception {
        Automovil coupe = new AutomovilCoupe();
        coupe = new TechoCorredizo(coupe);
        coupe = new LlantaAleacion(coupe);
        coupe = new Airbag(coupe);
        coupe = new AireAcondicionado(coupe);
        coupe = new FrenosABS(coupe);

        System.out.println("coupe.calcularCostoTotal() = " + coupe.calcularCostoTotal());
        assertTrue(coupe.calcularCostoTotal() > new AutomovilCoupe().getPrecio());
    }

}