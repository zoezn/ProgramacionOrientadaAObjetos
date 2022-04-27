package com.company;

public class OfertasAcademicasFactory {
    public static final String CODIGO_FRONTEND = "FRONTEND";
    public static final String CODIGO_BACKEND = "BACKEND";
    public static final String CODIGO_FULLSTACK = "FULLSTACK";

    private static OfertasAcademicasFactory instance;

    private OfertasAcademicasFactory(){}

    public static OfertasAcademicasFactory getInstance() {
        if(instance == null){
            instance = new OfertasAcademicasFactory();
        }
        return instance;
    }

    public OfertasAcademicas crearOfertaAcademica(String codigo){
        switch (codigo){
            case CODIGO_FRONTEND:
                return new Curso("Front End", "Blablabla", 16,2,1000.0);
            case CODIGO_BACKEND:
                return new Curso("Back End", "Blaaaaaaaa",20, 2, 900.0);
            case CODIGO_FULLSTACK:
                ProgramaIntensivo fullstack = new ProgramaIntensivo("FullStack", "Blablablablb", 20);
                fullstack.agregarCursos(crearOfertaAcademica("FRONTEND"));
                fullstack.agregarCursos(crearOfertaAcademica("BACKEND"));
                return fullstack;

        }
        return null;
    }

}
