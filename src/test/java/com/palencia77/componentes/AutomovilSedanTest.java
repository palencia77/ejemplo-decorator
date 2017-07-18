package com.palencia77.componentes;

import com.palencia77.decoradores.Airbag;
import com.palencia77.decoradores.FrenosABS;
import com.palencia77.decoradores.LlantaAleacion;
import com.palencia77.decoradores.TechoCorredizo;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by palencia77 on 7/17/17.
 */
public class AutomovilSedanTest {
    @Test
    public void calcularCostoTotal() throws Exception {
        Automovil sedan = new AutomovilSedan();
        sedan = new FrenosABS(sedan);

        System.out.println("sedan.calcularCostoTotal() = " + sedan.calcularCostoTotal());
        assertTrue("No se sumo correctamente el costo de los opcionales",
                sedan.calcularCostoTotal() > new AutomovilSedan().getPrecio());
    }

}