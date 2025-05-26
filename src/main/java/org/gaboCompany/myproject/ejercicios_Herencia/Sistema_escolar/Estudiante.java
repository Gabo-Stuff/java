package org.gaboCompany.myproject.ejercicios_Herencia.Sistema_escolar;

public class Estudiante extends Persona {
    protected String grado;

    public Estudiante(String grado, String nombre, int edad) {
        super(nombre, edad);
        this.grado = grado;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}
