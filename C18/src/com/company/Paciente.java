package com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion)  throws PacienteException{

        Date hoy = new Date();
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        if (fechaInternacion.before(hoy))
            this.fechaInternacion=fechaInternacion;
        if (fechaInternacion.after(hoy) || fechaAlta.before(fechaInternacion)){
            throw new PacienteException("Las fechas estan mal");
        };
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta)
    {
        if (fechaAlta.after(fechaInternacion))
            System.out.println("Ok");
        else
            System.out.println("No se puede");
    }



}
