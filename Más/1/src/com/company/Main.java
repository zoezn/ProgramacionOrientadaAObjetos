package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector;
        lector = new Scanner(System.in);

        /*System.out.println("Ingrese dos valores");
        Integer n = lector.nextInt();
        Integer divisor = lector.nextInt();
        esDivisible(n, divisor);*/

        System.out.println("Ingrese dos valores");
        int a = lector.nextInt();
        int b = lector.nextInt();
        System.out.println(sumar(a,b));
        System.out.println(restar(a,b));
        System.out.println(division(a,b));
        System.out.println(multiplicacion(a,b));
        /*sumar(a,b);
        restar(a,b);
        division(a,b);
        multiplicacion(a,b);*/

        /*int num1;
        int num2;
        float coeficiente;
        String nombre;
        char inicial;

        System.out.println("Ingrese primer valor");
        num1= lector.nextInt();
        System.out.println("Ingrese segundo valor");
        num2= lector.nextInt();
        System.out.println("Ingrese el coeficiente");
        coeficiente= lector.nextFloat();
        System.out.println("Ingrese su nombre");
        nombre = lector.next();
        inicial = nombre.charAt(0);
        System.out.print(inicial);*/

        /*String nombre;
        String apellido;
        char iniciales;
        System.out.println("Ingrese su nombre");
        nombre = lector.next();
        System.out.println("Ingrese su apellido");
        apellido = lector.next();
        System.out.println("Sus iniciales son");
        iniciales = nombre.charAt(0);
        System.out.print(iniciales);
        iniciales = apellido.charAt(0);
        System.out.print(iniciales);*/

}
    /*public static boolean esDivisible(int n, int divisor)
    {
        if (n%divisor == 0) {
            System.out.println("Es divisible");
            return true;
        } else {
            System.out.println("No es divisible");
            return false;
        }

    }



    public static Integer sumar(int a, int b) {
        int suma = a + b;
        return suma;
        }*/
    public static int sumar(int a, int b) {
        int suma = a+b;
        return suma;
    }
    public static int restar(int a, int b) {
        int resta = a-b;
        return resta;
    }
    public static double division(int a, int b) {
        double divison = a/b;
        return divison;
    }
    public static int multiplicacion(int a, int b) {
        int multi = a*b;
        return multi;
    }

}
