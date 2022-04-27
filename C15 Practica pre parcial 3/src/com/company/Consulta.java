package com.company;

import java.sql.Date;
import java.sql.Time;

public class Consulta {
    private Date fechaDeConsulta;
    private String especialidad;
    private Time horaYMinuto;

    public Consulta (Date fechaDeConsulta, String especialidad, Time horaYMinuto){
        this.fechaDeConsulta= fechaDeConsulta;
        this.especialidad= especialidad;
        this.horaYMinuto= horaYMinuto;
    }
}
