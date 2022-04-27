package com.company;

public class Terciario extends Titulo{
    private String tipoDeValidacion;

    public Terciario(Persona persona, Integer cantidadDeMaterias, String fechaDeInicio, String fechaDeFinalizacion, Boolean selladoPorMinisterio, Boolean selladoPorInstituto, String tipoDeValidacion) {
        super(persona, cantidadDeMaterias, fechaDeInicio, fechaDeFinalizacion, selladoPorMinisterio, selladoPorInstituto);
        this.tipoDeValidacion = tipoDeValidacion;
    }

    public Boolean validezNacional(){
        if (this.tipoDeValidacion == "NACIONAL"){
            return true;
        }
        return false;
    }
}
