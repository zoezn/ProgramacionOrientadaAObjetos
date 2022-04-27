package com.company;

public class PizzaFactory {
    public static final String CODIGO_MUZZA_CHICA = "MUZZARELLA CHICA";
    public static final String CODIGO_ESPECIAL_CHICA = "ESPECIAL CHICA";
    public static final String CODIGO_ANANA_CHICA = "ANANA CHICA";
    public static final String CODIGO_LOCA = "LOCA";

    private static PizzaFactory instance;

    private PizzaFactory(){}

    public static PizzaFactory getInstance() {
        if (instance == null){
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza crearPizza(String codigo){
        switch (codigo){
            case CODIGO_MUZZA_CHICA:
                return new Simple("Muzzarella","Pizza chica de muzarella",700.0,false);
            case CODIGO_ESPECIAL_CHICA:
                return new Simple("Especial", "Pizza chica especial", 850.0,false);
            case CODIGO_ANANA_CHICA:
                return new Simple("Anana", "Pizza chica de ananá", 950.0, false);
            case CODIGO_LOCA:
                Combinada pizzaLoca = new Combinada("Loca", "Pizza loca, mitad especial y mitad ananá");
                pizzaLoca.agregarPizzas(crearPizza("ESPECIAL CHICA"));
                pizzaLoca.agregarPizzas(crearPizza("ANANA CHICA"));
                return pizzaLoca;
        }
        return null;
    }










}
