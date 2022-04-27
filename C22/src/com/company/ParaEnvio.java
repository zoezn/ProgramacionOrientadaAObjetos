package com.company;

public class ParaEnvio implements Estado{

    @Override
    public Estado paraSerEnviado() {
        return new Finalizado();
    }

    @Override
    public Estado siendoPresupuestado() {
        return null;
    }

    @Override
    public Estado siendoReparado() {
        return null;
    }

    @Override
    public Estado finalizando() {
        return null;
    }


}
