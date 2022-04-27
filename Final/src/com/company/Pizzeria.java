package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private List<Pizza> pizzas;

    public Pizzeria() {
        pizzas = new ArrayList<>();
    }

    public void agregarPizzasEnPizzeria(Pizza pizza){
        pizzas.add(pizza);
    }

    public void mostrarPizzas(){
        for (Pizza pizza:pizzas) {
            System.out.println("Nombre: " + pizza.getNombre() + " | Precio: " + pizza.calcularPrecio());
        }
    }

}
