package org.gaboCompany.myproject.ejercicios_Herencia;

public class Refresco extends Bebida {
    protected boolean conGas;

    public Refresco(String nombre, String tamaño, boolean conGas) {
        super(nombre, tamaño);
        this.conGas = conGas;
    }

    public boolean isConGas() {
        return conGas;
    }

    public void setConGas(boolean conGas) {
        this.conGas = conGas;
    }

    @Override
    public void getDescripcion() {
        StringBuilder sb = new StringBuilder();
        sb.append("Refresco: {");
        sb.append("nombre = ").append(nombre);
        sb.append(", tamaño = ").append(tamaño);
        sb.append(", conGas = ").append(conGas);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
