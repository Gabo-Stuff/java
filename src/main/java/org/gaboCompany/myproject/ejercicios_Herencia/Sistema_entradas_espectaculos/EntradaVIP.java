package org.gaboCompany.myproject.ejercicios_Herencia.Sistema_entradas_espectaculos;

public class EntradaVIP extends Entrada {
    protected double recargoVIP;

    public EntradaVIP(double recargoVIP, String evento, double precioBase) {
        super(evento, precioBase);
        this.recargoVIP = recargoVIP;
    }

    public double getRecargoVIP() {
        return recargoVIP;
    }

    public void setRecargoVIP(double recargoVIP) {
        this.recargoVIP = recargoVIP;
    }

    @Override
    public double calcularPrecioFinal() {
        return super.calcularPrecioFinal() + precioBase * recargoVIP;
    }
    
    @Override
     public String resumen() {
        StringBuilder sb = new StringBuilder();
        sb.append("EntradaVIP {");
        sb.append("evento = ").append(evento);
        sb.append(", precioBase = ").append(precioBase);
        sb.append(", precio final calculado = ").append(this.calcularPrecioFinal());
        sb.append('}');
        return sb.toString();
    }
}
