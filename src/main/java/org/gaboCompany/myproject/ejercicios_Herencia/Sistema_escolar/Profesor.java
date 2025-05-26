package org.gaboCompany.myproject.ejercicios_Herencia.Sistema_escolar;

public class Profesor extends Persona {
    protected String especialidad;

    public Profesor(String especialidad, String nombre, int edad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
