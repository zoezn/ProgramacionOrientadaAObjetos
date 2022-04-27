package com.company;

public class Yate extends Embarcaciones implements Comparable{
    private Integer cantidadDeCamarotes;

    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioDeFabricacion, Double eslora, Integer cantidadDeCamarotes) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, eslora);
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }


    @Override
    public int compareTo(Object object) {

        Yate otroYate = (Yate) object;

        if (this.cantidadDeCamarotes > otroYate.cantidadDeCamarotes){
            return 1;
        }
        if (this.cantidadDeCamarotes > otroYate.cantidadDeCamarotes){
            return -1;
        }
        return 0;
    }
}
