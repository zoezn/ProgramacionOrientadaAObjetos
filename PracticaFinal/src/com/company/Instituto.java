package com.company;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<OfertasAcademicas> ofertasAcademicas;

    public Instituto() {
        ofertasAcademicas = new ArrayList<>();
    }

    public void agregarOfertasAcademicas(OfertasAcademicas oferta){
        ofertasAcademicas.add(oferta);
    }

    public void generarInforme(){
        for (OfertasAcademicas ofertaAcademica: ofertasAcademicas) {
            System.out.println("Nombre:" + ofertaAcademica.getNombre());
            System.out.println("Precio:" + ofertaAcademica.calcularPrecio());
        }
    }
}
