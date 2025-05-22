package org.gaboCompany.myproject.ejercicios_POO;

import java.util.Objects;

public class GestorContactos {
    
    protected String nombre;
    protected int telefono;
    protected String email;

    public GestorContactos(String email, int telefono, String nombre) {
        this.email = email;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "GestorContactos [nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + "]";
    } 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + this.telefono;
        hash = 47 * hash + Objects.hashCode(this.email);
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
        final GestorContactos other = (GestorContactos) obj;
        if (this.telefono != other.telefono) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
    }
}
