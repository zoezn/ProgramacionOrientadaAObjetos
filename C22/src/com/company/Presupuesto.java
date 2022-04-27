package com.company;

public class Presupuesto implements Estado{


    @Override
    public Estado siendoPresupuestado() {
        return new EnReparacion();
    }



    @Override
    public Estado siendoReparado() {
        return null;
    }

    @Override
    public Estado paraSerEnviado() {
        return null;
    }

    @Override
    public Estado finalizando() {
        return null;
    }



}
