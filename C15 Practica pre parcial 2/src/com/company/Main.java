package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Alumno alumno1= new Alumno("Zoe", "Jimenez", 123);
        Alumno alumno2= new Alumno("Kanye", "West", 333);

        Parcial parcialZoe= new Parcial(alumno1, "Bound", "Bad reputation", 8.5, 1, 2);

        System.out.println(parcialZoe.estaAprobadoONo());
        System.out.println(parcialZoe.puedeRecuperarONo());

        Parcial parcialKanye= new Parcial(alumno2, "In Paris", "Caballeros en Paris", 3.0, 2,3);

        System.out.println(parcialKanye.estaAprobadoONo());
        System.out.println(parcialKanye.puedeRecuperarONo());

        Final finalZoe = new Final(alumno1, "Yop", "Jeje", 4.0, 4.0, "Cuak cuak cuak");
        Final finalKanye = new Final(alumno2, "Eeeel", "Jasdad", 7.0, 5.0, "Turned 30!!");

        System.out.println(finalZoe.estaAprobadoONo());
        System.out.println(finalKanye.estaAprobadoONo());

        System.out.println(finalZoe.compareTo(finalKanye));
        System.out.println(finalKanye.compareTo(finalZoe));


    }
}
