package com.company;

public interface Estado {
    public Estado siendoPresupuestado();
    public Estado siendoReparado();
    public Estado paraSerEnviado();
    public Estado finalizando();


}
