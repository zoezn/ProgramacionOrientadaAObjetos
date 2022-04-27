package com.company;

public class Contenedor implements Comparable<Contenedor> {
    private Integer nroIdentificacion;
    private String procedencia;
    private Boolean transportaMaterialPeligroso;

    public Contenedor(Integer nroIdentificacion, String procedencia, Boolean transportaMaterialPeligroso) {
        this.nroIdentificacion = nroIdentificacion;
        this.procedencia = procedencia;
        this.transportaMaterialPeligroso = transportaMaterialPeligroso;

    }

    /* El puerto de Buenos Aires necesita administrar los
    contenedores que ingresan día a día.
    Estos poseen un número que los identifica, un texto que
    describe el país de procedencia
            (China, EEUU, Brasil, Rusia, Canadá, Desconocida)
            y una marca que indica si transporta
    materiales peligrosos.
    El sistema debe permitir que el puerto pueda ingresar
    contenedores, mostrarlos
    ordenados de acuerdo al número que los identifica y
    poder calcular la cantidad de
    contenedores peligrosos cuya procedencia sea “Desconocida”. */

    @Override
    public int compareTo(Contenedor contenedor) {
        if(this.nroIdentificacion > contenedor.nroIdentificacion){
            return 1;
        }
        if(this.nroIdentificacion < contenedor.nroIdentificacion){
            return -1;
        }
        return 0;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public Boolean getTransportaMaterialPeligroso() {
        return transportaMaterialPeligroso;
    }
}
