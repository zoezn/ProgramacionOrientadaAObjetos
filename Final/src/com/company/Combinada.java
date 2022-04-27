package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combinada extends Pizza{
    private List<Pizza> pizzas;

    public Combinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        pizzas = new ArrayList<>();
    }

    public void agregarPizzas(Pizza pizza){
        pizzas.add(pizza);
    }

    @Override
    public Double calcularPrecio() {
        double valorTotal = 0.0;
        int cantidadPizzas = 0;
        for (Pizza pizza: pizzas) {
            cantidadPizzas += 1;
            valorTotal += pizza.calcularPrecio();
        }
        return valorTotal / cantidadPizzas;
    }
}
