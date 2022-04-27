package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Puerto puerto = new Puerto("Buenos Aires");

        puerto.agregarContenedoress(new Contenedor(1, "Desconocida", true));
        puerto.agregarContenedoress(new Contenedor(2, "China", false));
        puerto.agregarContenedoress(new Contenedor(3, "Desconocida", false));

        System.out.println(puerto.cantContenedoresOrigenDesconocido());
        System.out.println(puerto.mostrarContenedoresOrdenados());

    }
}
