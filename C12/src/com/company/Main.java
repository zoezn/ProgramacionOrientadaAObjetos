package com.company;

public class Main {

    public static void main(String[] args) {

        CajaDeAhorro cuentaNueva= new CajaDeAhorro(1,"Guzman",123,231234,200.50,2);
        cuentaNueva.extraerEfectivo(100.0);
        cuentaNueva.informarSaldo();
        cuentaNueva.depositar(1000.0);
        cuentaNueva.informarSaldo();
        cuentaNueva.cobrarInteresMensual();
        cuentaNueva.informarSaldo();

        cuentaCorriente cuentaNueva2 = new cuentaCorriente(2, "Lopez", 234, 232345, 1050.0,200.0);
        cuentaNueva2.extraerEfectivo(1200.0);
        cuentaNueva2.informarSaldo();
        cuentaNueva2.extraerEfectivo(1300.0);
        cuentaNueva2.informarSaldo();
    }
}
