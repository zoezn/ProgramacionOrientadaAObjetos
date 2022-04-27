package com.company;

public class Curso extends OfertasAcademicas{
    private Integer cargaHorariaMensual;
    private Integer mesesDeDuracion;
    private Double valorHora;

    public Curso(String nombre, String descripcion, Integer cargaHorariaMensual, Integer mesesDeDuracion, Double valorHora) {
        super(nombre, descripcion);
        this.cargaHorariaMensual = cargaHorariaMensual;
        this.mesesDeDuracion = mesesDeDuracion;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcularPrecio() {
        double valorCurso = cargaHorariaMensual * valorHora * mesesDeDuracion;
        return valorCurso;
    }


}
