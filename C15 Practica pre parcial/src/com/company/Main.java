package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Capitan capitan= new Capitan("juan", "lopez", "AB6");

        /*Yate yate1= new Yate();
        Yate yate2= new Yate(capitan, 2000.0, 300.0, 2022, 30.4, 6);

        yate1.calcularMontoAlquiler();*/

        Yate embarcacion= new Yate(capitan, 1000.0, 20.0, 2002, 23.0, 2);
        Yate embarcacion2= new Yate(capitan, 2000.0, 300.0, 2022, 30.4, 6);
        Yate embarcacion3= new Yate(capitan, 2000.0, 300.0, 2022, 30.4, 6);

        System.out.println( embarcacion.calcularMontoAlquiler());
        System.out.println( embarcacion2.calcularMontoAlquiler());

        embarcacion3.compararLujos(embarcacion);


        Velero velero1 = new Velero(capitan, 400.0, 200.0, 2008, 20.5, 7);
        Velero velero2 = new Velero(capitan, 400.0, 200.0, 2008, 20.5, 3);

        velero1.evaluarTamanio();
        velero2.evaluarTamanio();

    }
}
