package com.company.cuentas;

import com.company.Cliente;

public abstract class Cuenta {

    private Cliente titular;
    protected Double saldo;

    public Cuenta(Cliente titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(Double monto){
        if(monto >  0){
            System.out.println("se deposito " + monto);
            saldo += monto;
            informarSaldo();
        }
    }

    public abstract void extraer(Double monto);



    public void informarSaldo(){
        System.out.println("tu saldo es de " + saldo);
    }

    public Double getSaldo() {
        return saldo;
    }
}
