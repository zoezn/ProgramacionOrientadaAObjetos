package com.company;

public abstract class Titulo {
    private Persona persona;
    private Integer cantidadDeMaterias;
    private String fechaDeInicio;
    private String fechaDeFinalizacion;
    private Boolean selladoPorMinisterio;
    private Boolean selladoPorInstituto;

    public Titulo(Persona persona, Integer cantidadDeMaterias, String fechaDeInicio, String fechaDeFinalizacion, Boolean selladoPorMinisterio, Boolean selladoPorInstituto) {
        this.persona = persona;
        this.cantidadDeMaterias = cantidadDeMaterias;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFinalizacion = fechaDeFinalizacion;
        this.selladoPorMinisterio = selladoPorMinisterio;
        this.selladoPorInstituto = selladoPorInstituto;
    }

    public Boolean puedeEjercer(){
        return (selladoPorInstituto && selladoPorMinisterio);
    }


}
