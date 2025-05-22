package org.gaboCompany.myproject.ejercicios_POO;

import java.util.Objects;

public class ListaTareas {
    
    protected String titulo;
    protected String descripcion;
    protected String estado;
    
    private static final String COMPLETADA = "completada";
    private static final String PENDIENTE = "pendiente";


    public ListaTareas(String descripcion, String estado, String titulo) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado.equals(COMPLETADA) || estado.equals(PENDIENTE)) {
            this.estado = estado;
        } else System.err.printf("ERROR al cambiar estado. Completada o pendiente por favor; no '%s'", estado);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListaTareas{");
        sb.append("titulo=").append(titulo);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.titulo);
        hash = 23 * hash + Objects.hashCode(this.descripcion);
        hash = 23 * hash + Objects.hashCode(this.estado);
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
        final ListaTareas other = (ListaTareas) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Objects.equals(this.estado, other.estado);
    }
}
