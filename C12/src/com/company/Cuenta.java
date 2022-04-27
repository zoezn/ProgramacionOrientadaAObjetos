package com.company;

public abstract class Cuenta extends Cliente{
    private Double saldo;

    public Cuenta(Integer nroDeCliente, String apellido, Integer DNI, Integer CUIT, Double saldo) {
        super(nroDeCliente, apellido, DNI, CUIT);
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public double setSaldo(Double saldo) {
        return this.saldo = saldo;
    }

    public void depositar (Double importe) {
        if (importe > 0){
            saldo += importe;
        }
    }

    public abstract double extraerEfectivo(Double importeARetirar);

    public void informarSaldo (){
        System.out.println("Su saldo es de: " + this.saldo);
    }
};


