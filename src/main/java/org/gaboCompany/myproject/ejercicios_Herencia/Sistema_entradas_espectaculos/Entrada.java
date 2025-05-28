package org.gaboCompany.myproject.ejercicios_Herencia.Sistema_entradas_espectaculos;

public class Entrada {
    protected String evento;
    protected double precioBase;

    public Entrada(String evento, double precioBase) {
        this.evento = evento;
        this.precioBase = precioBase;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double calcularPrecioFinal() {
        return getPrecioBase();
    }

    public String resumen() {return "";};
}
