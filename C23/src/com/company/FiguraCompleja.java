package com.company;

import java.util.ArrayList;
import java.util.List;

public class FiguraCompleja implements Area{
    private List<Area> listaFiguras;

    public FiguraCompleja() {
        listaFiguras = new ArrayList<>();
    }

    public void agregarFiguras(Area figura){
        listaFiguras.add(figura);
    }

    @Override
    public Double calcularArea() {
        Double sumaArea = 0.0;
        for (Area figura: listaFiguras) {
            sumaArea += figura.calcularArea();
        }
        System.out.println("La superficie total es: " + sumaArea);
        return sumaArea;
    }
}
