package com.company;

public class Cliente {
    private Integer nroDeCliente;
    private String apellido;
    private Integer DNI;
    private Integer CUIT;

    public Cliente(Integer nroDeCliente, String apellido, Integer DNI, Integer CUIT) {
        this.nroDeCliente = nroDeCliente;
        this.apellido=apellido;
        this.DNI=DNI;
        this.CUIT=CUIT;
    }


}
