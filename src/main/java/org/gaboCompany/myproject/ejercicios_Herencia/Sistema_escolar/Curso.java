package org.gaboCompany.myproject.ejercicios_Herencia.Sistema_escolar;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    protected String nombreCurso;
    protected Profesor profesor;
    protected List<Estudiante> estudiantes;

    public Curso(List<Estudiante> estudiantes, String nombreCurso, Profesor profesor) {
        this.estudiantes = estudiantes;
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void agregarEstudiante(Estudiante e) {
        this.estudiantes.add(e);
    }

    public String mostrarParticipantes() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso: {");
        sb.append("nombreCurso = ").append(nombreCurso);
        sb.append(", profesor = ").append(profesor.getNombre());

        List<String> nombresEstudiantes = new ArrayList<>();
        for (Estudiante e: estudiantes){
            nombresEstudiantes.add(e.getNombre());
        }
        sb.append(", estudiantes = ").append(nombresEstudiantes);
        sb.append('}');
        return sb.toString();
    }




}
