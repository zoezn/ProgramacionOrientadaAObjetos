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

public class Perro {
    private String nombre;
    private String raza;
    private String anio;
    private Double peso;
    private Boolean chip;
    private Boolean lastimado;

    public Perro (String nombre, String anio, Double peso ) {
            this.nombre = nombre;
            this.anio = anio;
            this.peso = peso;
            chip = false;
            lastimado = false;
    }
    public Perro (String nombre, String anio, Double peso, Boolean chip ) {
        this.nombre = nombre;
        this.anio = anio;
        this.peso = peso;
        chip = false;
        lastimado = false;
    }

   private  Boolean tieneChip () {
        return chip;
   }
   private boolean estaLastimado () {
        return lastimado;
   }
   private   Boolean pesoIdeal () {
        return  peso > 5.0;
   }
   public boolean adoptable () {
        if (!estaLastimado() && pesoIdeal()) {
            return true;
       } else {
            return false;
       }
   }

   public void  confirmar () {
       if (adoptable()) {
           System.out.println("Es adoptable");
       } else {
           System.out.println("No es adoptable");
       }
   }

    private void setChip(Boolean chip) {
        this.chip = chip;
    }
    private void setLastimado (Boolean lastimado) {
        this.lastimado = lastimado;
    }


}




