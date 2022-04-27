package com.company;

public class cuentaCorriente extends Cuenta{
    private Double giroEnDescubierto;
    private Double saldo = getSaldo();

    public cuentaCorriente(Integer nroDeCliente, String apellido, Integer DNI, Integer CUIT, Double saldo, Double giroEnDescubierto) {
        super(nroDeCliente, apellido, DNI, CUIT, saldo);
        this.giroEnDescubierto = giroEnDescubierto;
    }

    @Override
    public double extraerEfectivo(Double importeARetirar) {
        if (importeARetirar <= saldo){
            return setSaldo(saldo - importeARetirar);
        } else if (importeARetirar > saldo && importeARetirar <= saldo+giroEnDescubierto ){
            return setSaldo(saldo - importeARetirar);
        } else{
            System.out.println("Fondos insuficientes");
            return saldo;
        }

    }

}
