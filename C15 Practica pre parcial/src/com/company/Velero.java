package com.company;

public class Velero extends Embarcaciones {
    private Integer cantidadDeMastiles;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioDeFabricacion, Double eslora, Integer cantidadDeMastiles) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, eslora);
        this.cantidadDeMastiles = cantidadDeMastiles;
    }


    public void evaluarTamanio (){
        if (cantidadDeMastiles > 4){
            System.out.println("El velero es grande, tiene " + cantidadDeMastiles + " mástiles.");
        } else {
            System.out.println("El velero es chico, tiene " + cantidadDeMastiles + " mástiles.");
        }
    }

}
