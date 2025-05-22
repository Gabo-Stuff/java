package org.gaboCompany.myproject.ejercicios_POO;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class AlumnoImpl {
    
    private static void alumnoNotaMasAlta(Dictionary<String,Double> listaAlumnos) {
        System.out.println("El mejor alumno eees: ");
        Double mayorNota = 0.0;
        String mayorAlumno = "";
        
        Enumeration keys = listaAlumnos.keys();
        while(keys.hasMoreElements()) {
            Object actualAlumno = keys.nextElement();
            Double actualNota = listaAlumnos.get(actualAlumno);
            if (actualNota > mayorNota) {
                mayorNota = actualNota;
                mayorAlumno = actualAlumno.toString();
            } 
        }
        System.out.println(mayorAlumno+"!! Con una media de "+mayorNota+"!!");
    }

    public static void main(String args[]) {
        Dictionary<String,Double> listaAlumnos = new Hashtable<>();

        Alumno gesting = new Alumno("MariaJosé", new ArrayList<>());
        gesting.addNota(3.0);
        gesting.addNota(7.0);
        gesting.addNota(1.9);
        System.out.println(gesting.toString());
        Double media = gesting.calcMedia();
        System.out.println(media);
        listaAlumnos.put(gesting.getNombre(), media);
        System.out.println();

        Alumno gesting2 = new Alumno("JoseMaría", new ArrayList<>());
        gesting2.addNota(6.0);
        gesting2.addNota(7.0);
        gesting2.addNota(4.9);
        System.out.println(gesting2.toString());
        Double media2 = gesting2.calcMedia();
        System.out.println(media2);
        listaAlumnos.put(gesting2.getNombre(), media2);
        System.out.println();

        alumnoNotaMasAlta(listaAlumnos);
    }
}
