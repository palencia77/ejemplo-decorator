package com.palencia77.principal;

import com.palencia77.componentes.Automovil;
import com.palencia77.componentes.AutomovilSedan;
import com.palencia77.decoradores.Airbag;
import com.palencia77.decoradores.LlantaAleacion;
import com.palencia77.decoradores.TechoCorredizo;

public class Principal {

    public static void main(String[] args) {
        Automovil sedan = new AutomovilSedan();
        sedan = new TechoCorredizo(sedan);
        sedan = new Airbag(sedan);
        sedan = new LlantaAleacion(sedan);

        System.out.println("sedan costo = " + sedan.calcularCostoTotal());
    }
}
