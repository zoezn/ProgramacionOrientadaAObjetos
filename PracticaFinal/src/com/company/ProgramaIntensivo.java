package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertasAcademicas{

    private List<OfertasAcademicas> cursos;
    private Integer porcentajePrograma;

    public ProgramaIntensivo(String nombre, String descripcion, Integer porcentajePrograma) {
        super(nombre, descripcion);
        this.porcentajePrograma = porcentajePrograma;
        cursos = new ArrayList<>();
    }

    public void agregarCursos(OfertasAcademicas curso){
        cursos.add(curso);
    }


    @Override
    public Double calcularPrecio() {
        double valorTotal = 0.0;
        for (OfertasAcademicas curso: cursos) {
            valorTotal += curso.calcularPrecio();
        }

        return valorTotal - ((porcentajePrograma * valorTotal)/100);
    }
}
