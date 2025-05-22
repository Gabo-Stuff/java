package org.gaboCompany.myproject.ejercicios_POO;

import java.util.Dictionary;

public class Encuesta {
    
    protected String nombre;
    protected String descripcion;
    // Preguntas("Pregunta", {"Opciones"})
    protected Dictionary<String, String[]> preguntas;

    public Encuesta(String descripcion, String nombre, Dictionary<String, String[]> preguntas) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.preguntas = preguntas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Preguntas({"Pregunta", {"Opciones"}}, {...})
     * @return Dictionary<String, String[]>
     */
    public Dictionary<String, String[]> getPreguntas() {
        return preguntas;
    }
    /**
     * Preguntas({"Pregunta", {"Opciones"}}, {...})
     */
    public void setPreguntas(Dictionary<String, String[]> preguntas) {
        this.preguntas = preguntas;
    }
}
