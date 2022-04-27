package com.company;

public class Parcial extends Examen{
    private Integer numeroDeUnidad;
    private Integer numeroDeIntento;

    public Parcial(Alumno alumno, String titulo, String enunciado, Double nota, Integer numeroDeUnidad, Integer numeroDeIntento) {
        super(alumno, titulo, enunciado, nota);
        this.numeroDeUnidad = numeroDeUnidad;
        this.numeroDeIntento = numeroDeIntento;
    }

    public Boolean puedeRecuperarONo (){
        if (numeroDeUnidad <= 3 && numeroDeIntento < 3 ){
            return true;
        } else if (numeroDeUnidad > 3 && numeroDeIntento < 2){
            return true;
        }
        return false;
    }


    @Override
    public Boolean estaAprobadoONo() {
        return getNota()>=4;
    }
}
