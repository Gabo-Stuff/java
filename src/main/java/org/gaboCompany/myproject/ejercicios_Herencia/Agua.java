package org.gaboCompany.myproject.ejercicios_Herencia;

public class Agua extends Bebida {
    protected boolean mineral;

    public Agua(String nombre, String tamaño, boolean mineral) {
        super(nombre, tamaño);
        this.mineral = mineral;
    }

    public boolean isMineral() {
        return mineral;
    }

    public void setmineral(boolean mineral) {
        this.mineral = mineral;
    }

    @Override
    public void getDescripcion() {
        StringBuilder sb = new StringBuilder();
        sb.append("Agua: {");
        sb.append("nombre = ").append(nombre);
        sb.append(", tamaño = ").append(tamaño);
        sb.append(", mineral = ").append(mineral);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
