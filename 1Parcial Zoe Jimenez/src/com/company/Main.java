package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona persona1= new Persona("Juan", "Lopez", 123, 24);
        Persona persona2= new Persona("Lucia", "Martinez", 222, 32);

        Terciario terciario1= new Terciario(persona1,28,"22/03/2018", "23/04/2022", true, false, "PROVINCIAL");
        Terciario terciario2= new Terciario(persona2,32,"12/03/2018", "5/02/2022", true, true, "NACIONAL");

        System.out.println(terciario1.puedeEjercer());
        System.out.println(terciario2.puedeEjercer());
        System.out.println(terciario1.validezNacional());
        System.out.println(terciario2.validezNacional());

        Licenciatura licenciatura1= new Licenciatura(persona1,28,"22/03/2018", "23/04/2022", true, false, "Tema interesante", "4/04/2022", 12);
        Licenciatura licenciatura2= new Licenciatura(persona2,32,"12/03/2018", "5/02/2022", true, true, "Tema super interesante", "22/12/2021", 24);

        System.out.println(licenciatura1.puedeEjercer());
        System.out.println(licenciatura2.puedeEjercer());
        System.out.println(licenciatura1.compareTo(licenciatura2));

    }
}
