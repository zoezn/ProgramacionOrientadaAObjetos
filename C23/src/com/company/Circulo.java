package com.company;

public class Circulo implements Area{
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return radio * radio * Math.PI;
    }
}
