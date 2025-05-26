package org.gaboCompany.myproject.ejercicios_Herencia.Sistema_escolar;

import java.util.ArrayList;
import java.util.List;

public class CursoImpl {
    public static void main(String args[]) {
        Profesor profe = new Profesor("Sax", "SaxMan", 50);
        Estudiante paco1 = new Estudiante("1", "Paco1", 10);
        Estudiante paco2 = new Estudiante("2", "Paco2", 11);
        Estudiante paco3 = new Estudiante("3", "Paco3", 12);

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(paco1);
        estudiantes.add(paco2);
        estudiantes.add(paco3);

        Curso curso = new Curso(estudiantes, "SaxClass", profe);

        curso.agregarEstudiante(new Estudiante("4", "Paco4", 13));
        System.out.println(curso.mostrarParticipantes());
    }
}
