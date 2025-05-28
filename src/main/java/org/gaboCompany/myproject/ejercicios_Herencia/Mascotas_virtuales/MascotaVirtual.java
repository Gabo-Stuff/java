package org.gaboCompany.myproject.ejercicios_Herencia.Mascotas_virtuales;

public class MascotaVirtual {
    protected String nombre;
    protected int energia;
    protected int felicidad;   

    public MascotaVirtual(int energia, int felicidad, String nombre) {
        this.energia = energia;
        this.felicidad = felicidad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getFelicidad() {
        return felicidad;
    }

    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }

    public void comer() {
        this.energia+= 1;
    }

    public void jugar() {
        this.energia-= 1;
        this.felicidad+= 1;
    }

    public String mostrarEstado() {
        return "MascotaVirtual [nombre = " + nombre + ", energia = " + energia + ", felicidad = " + felicidad + "]";
    }

    
}
