package com.company;

import java.util.List;

public class Reparacion {
    private String nombreDeArticulo;
    private Integer valorDePresupuesto;
    private String direccionDeEntrega;
    private Estado estadoActual;

    public Reparacion(String nombreDeArticulo, Integer valorDePresupuesto, String direccionDeEntrega) {
        this.nombreDeArticulo = nombreDeArticulo;
        this.valorDePresupuesto = valorDePresupuesto;
        this.direccionDeEntrega = direccionDeEntrega;
        this.estadoActual = new Presupuesto();
    }

    private void cambiarDireccion(String nuevaDireccion) {
        direccionDeEntrega = nuevaDireccion;
    }

    private void darValorDePresupuesto(int valorPresupuesto) {
        valorDePresupuesto = valorPresupuesto;
    }

    private void agregarRepuestos(int valorRepuestos) {
        valorDePresupuesto += valorRepuestos;
    }

    private void pasarSigPaso() {

    }
}

