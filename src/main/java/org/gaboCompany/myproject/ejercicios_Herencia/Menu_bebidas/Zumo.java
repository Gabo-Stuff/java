package org.gaboCompany.myproject.ejercicios_Herencia.Menu_bebidas;

public class Zumo extends Bebida {
    protected String fruta;

    public Zumo(String nombre, String tamaño, String fruta) {
        super(nombre, tamaño);
        this.fruta = fruta;
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String conGas) {
        this.fruta = conGas;
    }

    @Override
    public void getDescripcion() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zumo: {");
        sb.append("nombre = ").append(nombre);
        sb.append(", tamaño = ").append(tamaño);
        sb.append(", fruta = ").append(fruta);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
