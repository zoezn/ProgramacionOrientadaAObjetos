package com.company;

public abstract class Embarcaciones {
    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anioDeFabricacion;
    private Double eslora;

    public Embarcaciones(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioDeFabricacion, Double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioDeFabricacion = anioDeFabricacion;
        this.eslora = eslora;
    }



    /* public Embarcaciones(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioDeFabricacion, Double eslora) {
        super(capitan);
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioDeFabricacion = anioDeFabricacion;
        this.eslora = eslora;
    }*/

    public Double calcularMontoAlquiler(){
        if (anioDeFabricacion > 2020){
            return precioBase+valorAdicional;
        } else{
            return precioBase;
        }
    }
}
