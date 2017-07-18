package com.palencia77.componentes;

/**
 * Created by palencia77 on 7/17/17.
 *
 */
public abstract class Automovil {
    private final Double precio;
    private String descripcion;

    protected Automovil(Double precio) {
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract Double calcularCostoTotal();
}
