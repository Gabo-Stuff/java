package org.gaboCompany.myproject.ejercicios_Herencia.Sistema_entradas_espectaculos;

public class EntradaConDescuento extends Entrada {
    protected double porcentajeDescuento;

    public EntradaConDescuento(double porcentajeDescuento, String evento, double precioBase) {
        super(evento, precioBase);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularPrecioFinal() {
        return super.calcularPrecioFinal() - this.precioBase * this.porcentajeDescuento;
    }

    @Override
    public String resumen() {
        StringBuilder sb = new StringBuilder();
        sb.append("EntradaConDescuento {");
        sb.append("evento = ").append(evento);
        sb.append(", precioBase = ").append(precioBase);
        sb.append(", precio final calculado = ").append(this.calcularPrecioFinal());
        sb.append('}');
        return sb.toString();
    }
}
