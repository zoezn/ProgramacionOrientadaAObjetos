package com.company;

import java.util.ArrayList;
import java.util.List;

public class Tren {
    private List<Area> componentes;

    public Tren() {
        componentes = new ArrayList<>();
    }

    public void agregarFigura(Area figura){
        componentes.add(figura);
    }

    public Double calcularArea() {
        Double sumaArea = 0.0;
        for (Area figura: componentes) {
            sumaArea += figura.calcularArea();
        }
        System.out.println("La superficie total es: " + sumaArea);
        return sumaArea;
    }

}
