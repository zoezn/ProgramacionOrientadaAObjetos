package com.company;

import java.sql.Date;

public class ObraSocial extends Paciente implements Comparable{
    private String nombreObraSocial;
    private Integer numeroDeAsociado;

    public ObraSocial(Consulta consulta, Date fechaDeNacimiento, String nombre, String apellido, Boolean primeraConsulta, String nombreObraSocial, Integer numeroDeAsociado) {
        super(consulta, fechaDeNacimiento, nombre, apellido, primeraConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroDeAsociado = numeroDeAsociado;
    }

    @Override
    public int compareTo(Object object) {
        ObraSocial otroPaciente = (ObraSocial) object;
        if (this.numeroDeAsociado > otroPaciente.numeroDeAsociado){
            return 1;
        }
        if (this.numeroDeAsociado < otroPaciente.numeroDeAsociado){
            return -1;
        }
        return 0;
    }
}
