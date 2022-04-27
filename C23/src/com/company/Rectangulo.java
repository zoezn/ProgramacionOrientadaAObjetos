package com.company;

public class Rectangulo implements Area{
    private Double alto;
    private Double largo;

    public Rectangulo(Double alto, Double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public Double calcularArea() {
        return alto * largo;
    }
}
