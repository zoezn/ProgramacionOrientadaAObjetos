package com.company;

public class EnReparacion implements Estado {

    @Override
    public Estado siendoReparado() {
        return new ParaEnvio();
    }



    @Override
    public Estado siendoPresupuestado() {
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
