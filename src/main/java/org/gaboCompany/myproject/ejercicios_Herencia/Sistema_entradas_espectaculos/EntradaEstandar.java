package org.gaboCompany.myproject.ejercicios_Herencia.Sistema_entradas_espectaculos;

public class EntradaEstandar extends Entrada {

    public EntradaEstandar(String evento, double precioBase) {
        super(evento, precioBase);
    }

    @Override
    public String resumen() {
        StringBuilder sb = new StringBuilder();
        sb.append("EntradaEstandar {");
        sb.append("evento = ").append(evento);
        sb.append(", precioBase = ").append(precioBase);
        sb.append('}');
        return sb.toString();
    }
}
