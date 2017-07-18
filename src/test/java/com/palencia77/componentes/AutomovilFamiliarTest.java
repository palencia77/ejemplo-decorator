package com.palencia77.componentes;

import com.palencia77.decoradores.Airbag;
import com.palencia77.decoradores.AireAcondicionado;
import com.palencia77.decoradores.FrenosABS;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by palencia77 on 7/17/17.
 */
public class AutomovilFamiliarTest {

    @Test
    public void calcularCostoTotal() throws Exception{
        Automovil familiar = new AutomovilFamiliar();
        familiar = new FrenosABS(familiar);
        familiar = new Airbag(familiar);
        familiar = new AireAcondicionado(familiar);

        System.out.println("familiar.calcularCostoTotal() = " + familiar.calcularCostoTotal());
        assertTrue(familiar.calcularCostoTotal() > new AutomovilFamiliar().getPrecio());
    }
}