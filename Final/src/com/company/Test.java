package com.company;

public class Test {

    public static void main(String[] args) {
	// write your code here

    Pizzeria pizzeria = new Pizzeria();
    PizzaFactory pizzas = PizzaFactory.getInstance();

    Pizza muzzaChica = pizzas.crearPizza("MUZZARELLA CHICA");
    Pizza especialChica = pizzas.crearPizza("ESPECIAL CHICA");
    Pizza ananaChica = pizzas.crearPizza("ANANA CHICA");
    Pizza combinadaLoca = pizzas.crearPizza("LOCA");


    pizzeria.agregarPizzasEnPizzeria(muzzaChica);
    pizzeria.agregarPizzasEnPizzeria(especialChica);
    pizzeria.agregarPizzasEnPizzeria(ananaChica);
    pizzeria.agregarPizzasEnPizzeria(combinadaLoca);

    pizzeria.mostrarPizzas();

    }
}
