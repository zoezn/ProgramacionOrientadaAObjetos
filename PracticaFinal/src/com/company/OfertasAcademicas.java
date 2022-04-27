package com.company;

public abstract class OfertasAcademicas {
    private String nombre;
    private String descripcion;

    public OfertasAcademicas(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPrecio();

    public String getNombre() {
        return nombre;
    }
}
