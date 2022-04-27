package com.company;

public class CajaDeAhorro extends Cuenta{
    private Integer tasaDeInteres;
    private Double saldo = getSaldo();

    public CajaDeAhorro(Integer nroDeCliente, String apellido, Integer DNI, Integer CUIT, Double saldo, Integer tasaDeInteres) {
        super(nroDeCliente, apellido, DNI, CUIT, saldo);
        this.tasaDeInteres = tasaDeInteres;
    }


    @Override
    public double extraerEfectivo(Double importeARetirar) {
        if (importeARetirar < saldo){
            return setSaldo(saldo - importeARetirar);
        } else  {
            System.out.println("Fondos insuficientes");
            return saldo;
        }
    }


    public double cobrarInteresMensual(){
        return setSaldo(saldo + (saldo*2)/100);
    }
}
