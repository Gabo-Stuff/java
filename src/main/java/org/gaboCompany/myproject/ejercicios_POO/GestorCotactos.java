package org.gaboCompany.myproject.ejercicios_POO;

public class GestorCotactos {
    
    protected String nombre;
    protected int telefono;
    protected String email;

    public GestorCotactos(String email, int telefono, String nombre) {
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
        return "GestorCotactos [nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + "]";
    }   
}
