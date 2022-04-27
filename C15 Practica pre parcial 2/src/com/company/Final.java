package com.company;

public class Final extends Examen implements Comparable{
    private Double notaDeOral;
    private String descripcionDelTema;

    public Final(Alumno alumno, String titulo, String enunciado, Double nota, Double notaDeOral, String descripcionDelTema) {
        super(alumno, titulo, enunciado, nota);
        this.notaDeOral = notaDeOral;
        this.descripcionDelTema = descripcionDelTema;
    }

    @Override
    public int compareTo(Object object) {
        Final otroFinal = (Final) object;
        Double promedioFinales = (this.getNota() + notaDeOral)/2;
        Double promedioFinalesOtro = (otroFinal.getNota() + otroFinal.notaDeOral)/2;

        if (promedioFinales > promedioFinalesOtro){
            return 1;
        }
        if (promedioFinales < promedioFinalesOtro){
            return -1;
        }
        return 0;

    }

    @Override
    public Boolean estaAprobadoONo() {
        return ( notaDeOral >= 4 && getNota() >= 4 );
    }
}
