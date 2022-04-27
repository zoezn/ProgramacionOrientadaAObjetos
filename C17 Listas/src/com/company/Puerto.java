package com.company;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private String nombre;
    private List<Contenedor> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        contenedores = new ArrayList<>();
    }

    public void agregarContenedoress(Contenedor contenedor){
        contenedores.add(contenedor);
    }

    public void mostrarContenedoresOrdenados(){
        contenedores.sort(null);
        for (Contenedor contenedor: contenedores) {
                System.out.println(contenedor);
            }
        }

        public Integer cantContenedoresOrigenDesconocido(){
            Integer contadorOrigenDesconocido = 0;
            for (Contenedor contenedor: contenedores) {
                if( contenedor.getTransportaMaterialPeligroso() == true && contenedor.getProcedencia() == "Desconocida"){
                    contadorOrigenDesconocido++;
                }
            }
            return contadorOrigenDesconocido;
        }
    }




