package com.company;

/*Identificar, modelar e implementar en Java la clase involucrada en siguiente enunciado
        especificando sus atributos, responsabilidades, al menos dos constructores y los
        correspondientes getters, y setters.
        Para una institución que adopta perros se requiere tener de ellos: si están en adopción o
        no, raza, año aproximado de nacimiento, peso, si tiene o no chip, si está o no lastimado y el
        nombre de pila que le asignaron en la institución.
        Deberemos poder preguntar la edad de un perro y si es un perro factible de perderse
        —entendiendo que los perros que tienen chip son los que no se pueden perder—. Por otro
        lado, se puede enviar a adopción a un perro si no está lastimado y su peso es mayor a 5 kg.*/
public class Main {

    public static void main(String[] args) {
	 Perro perro = new Perro("Sultan","2008", 10.0);
     Perro perro1 = new Perro("Ronia","2013",15.0,false);
        perro.confirmar();
        perro1.confirmar();
    }
}
