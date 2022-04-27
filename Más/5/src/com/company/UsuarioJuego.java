package com.company;

public class UsuarioJuego {
    /*Para desarrollar un juego necesitamos implementar la clase UsuarioJuego. Los usuarios
    tienen nombre y clave, estos datos se deben suministrar cuando se crea un nuevo usuario.
    Inicialmente tienen puntaje y nivel en cero. Sin embargo, pueden aumentar tanto el puntaje
    como el nivel en 1, debemos suministrar un método para poder hacerlo. El usuario también
    puede recibir un bonus, esto quiere decir que recibe un valor extra que se suma a su puntaje.

            UsuarioJuego
- nombre: String
- clave: String
- puntaje: Double
- nivel: int
+ UsuarioJuego(nombre, clave; String)
            + aumentarPuntaje()
+ subirNivel()
+ bonus(int valor)*/

    private String nombre;
    private String clave;
    private Double puntaje=0.0;
    private Integer nivel=0;

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    public double aumentarPuntaje(){
        return puntaje += 1.0;
    }

    public int subirNivel(){
        return nivel += 1;
    }
    public double bonus(int valor){
        return puntaje += valor;
    }
}
