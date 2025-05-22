package org.gaboCompany.myproject.ejercicios_POO;

import java.util.List;
import java.util.Objects;

public class Alumno {
    
    protected String nombre;
    protected List<Double> notas;

    public Alumno(String nombre, List<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public void addNota(Double nota) {
        this.notas.add(nota);
    }

    public Double calcMedia() {
        Double sumNotas = 0.0;
        for (Double nota: this.notas) sumNotas+=nota;
        Double mediaNotas = sumNotas/this.notas.size();
        if (mediaNotas >= 5) System.out.println("Aprueba."); else System.out.println("No aprueba.");
        return mediaNotas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno{");
        sb.append("nombre=").append(nombre);
        sb.append(", notas=").append(notas);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.notas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.notas, other.notas);
    }
}
