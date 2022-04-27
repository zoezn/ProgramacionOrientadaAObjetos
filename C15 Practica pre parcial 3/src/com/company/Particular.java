package com.company;

import java.sql.Date;

public class Particular extends Paciente{
    private Double montoConsulta;
    private Integer DNI;

    public Particular(Consulta consulta, Date fechaDeNacimiento, String nombre, String apellido, Boolean primeraConsulta, Double montoConsulta, Integer DNI) {
        super(consulta, fechaDeNacimiento, nombre, apellido, primeraConsulta);
        this.montoConsulta = montoConsulta;
        this.DNI = DNI;
    }


}
