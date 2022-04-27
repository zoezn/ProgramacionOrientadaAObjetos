package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UsuarioJuego nuevoUsuario= new UsuarioJuego("Zoe", "Hola");
        nuevoUsuario.aumentarPuntaje();
        nuevoUsuario.aumentarPuntaje();
        System.out.println(nuevoUsuario.aumentarPuntaje());

        nuevoUsuario.subirNivel();
        nuevoUsuario.subirNivel();
        nuevoUsuario.subirNivel();
        nuevoUsuario.subirNivel();
        System.out.println(nuevoUsuario.subirNivel());



    }
}
