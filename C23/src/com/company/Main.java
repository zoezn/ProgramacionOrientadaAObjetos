package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Circulo circulo = new Circulo(1.0);
        Circulo circulo2 = new Circulo(1.0);
        Circulo circulo3 = new Circulo(1.0);
        Rectangulo rectangulo = new Rectangulo(5.0, 4.0);
        Rectangulo rectangulo2 = new Rectangulo(3.0, 4.0);
        Rectangulo rectangulo3 = new Rectangulo(1.0, 2.0);
        Rectangulo rectangulo4 = new Rectangulo(2.0, 1.0);
        Triangulo triangulo = new Triangulo(2.0, 2.0);


        FiguraCompleja vagon= new FiguraCompleja();
        vagon.agregarFiguras(circulo);
        vagon.agregarFiguras(circulo2);
        vagon.agregarFiguras(circulo3);
        vagon.agregarFiguras(rectangulo);

        vagon.calcularArea();

        FiguraCompleja locomotora = new FiguraCompleja();
        locomotora.agregarFiguras(circulo);
        locomotora.agregarFiguras(circulo);
        locomotora.agregarFiguras(triangulo);
        locomotora.agregarFiguras(rectangulo2);
        locomotora.agregarFiguras(rectangulo3);
        locomotora.agregarFiguras(rectangulo4);
        locomotora.calcularArea();

        Tren tren = new Tren();

        tren.agregarFigura(locomotora);
        tren.agregarFigura(vagon);
        tren.agregarFigura(vagon);

        tren.calcularArea();

    }
}
