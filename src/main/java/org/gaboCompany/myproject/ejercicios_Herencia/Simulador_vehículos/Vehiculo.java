package org.gaboCompany.myproject.ejercicios_Herencia.Simulador_vehículos;

public class Vehiculo {
    protected String marca;
    protected int año;

    public Vehiculo(int año, String marca) {
        this.año = año;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void arrancar() {};

    public void detener() {};
}
