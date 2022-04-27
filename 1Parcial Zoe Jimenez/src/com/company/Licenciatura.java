package com.company;

public class Licenciatura extends Titulo implements Comparable{
    private String temaDeTesis;
    private String fechaDeEntregaTesis;
    private Integer cantidadTrabajosDeInvestigacion;

    public Licenciatura(Persona persona, Integer cantidadDeMaterias, String fechaDeInicio, String fechaDeFinalizacion, Boolean selladoPorMinisterio, Boolean selladoPorInstituto, String temaDeTesis, String fechaDeEntregaTesis, Integer cantidadTrabajosDeInvestigacion) {
        super(persona, cantidadDeMaterias, fechaDeInicio, fechaDeFinalizacion, selladoPorMinisterio, selladoPorInstituto);
        this.temaDeTesis = temaDeTesis;
        this.fechaDeEntregaTesis = fechaDeEntregaTesis;
        this.cantidadTrabajosDeInvestigacion = cantidadTrabajosDeInvestigacion;
    }


    @Override
    public int compareTo(Object object) {
        Licenciatura otraLicenciatura = (Licenciatura) object;

        if (this.cantidadTrabajosDeInvestigacion > otraLicenciatura.cantidadTrabajosDeInvestigacion){
            return 1;
        }
        if (this.cantidadTrabajosDeInvestigacion < otraLicenciatura.cantidadTrabajosDeInvestigacion){
            return -1;
        }
        return 0;
    }
}