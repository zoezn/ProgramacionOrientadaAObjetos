package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Instituto instituto = new Instituto();
        OfertasAcademicasFactory ofertas = OfertasAcademicasFactory.getInstance();

        OfertasAcademicas front = ofertas.crearOfertaAcademica(OfertasAcademicasFactory.CODIGO_FRONTEND);
        OfertasAcademicas back = ofertas.crearOfertaAcademica(OfertasAcademicasFactory.CODIGO_BACKEND);
        OfertasAcademicas fullstack = ofertas.crearOfertaAcademica(OfertasAcademicasFactory.CODIGO_FULLSTACK);

        System.out.println(front.calcularPrecio());
        System.out.println(back.calcularPrecio());
        System.out.println(fullstack.calcularPrecio());

        instituto.agregarOfertasAcademicas(front);
        instituto.agregarOfertasAcademicas(back);
        instituto.agregarOfertasAcademicas(fullstack);

        instituto.generarInforme();


    }
}
