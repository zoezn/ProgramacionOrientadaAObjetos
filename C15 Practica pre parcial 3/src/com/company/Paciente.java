package com.company;

import java.sql.Date;

public class Paciente {
    private Consulta consulta;
    private Date fechaDeNacimiento;
    private String nombre;
    private String apellido;
    private Boolean primeraConsulta;

    public Paciente(Consulta consulta, Date fechaDeNacimiento, String nombre, String apellido, Boolean primeraConsulta) {
        this.consulta = consulta;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.primeraConsulta = primeraConsulta;
    }

    public Boolean evaluacionInicialNecesaria (){
        return (primeraConsulta);
    }
}
