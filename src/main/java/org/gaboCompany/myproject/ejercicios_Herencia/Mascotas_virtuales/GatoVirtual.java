package org.gaboCompany.myproject.ejercicios_Herencia.Mascotas_virtuales;

public class GatoVirtual extends MascotaVirtual {

    public GatoVirtual(int energia, int felicidad, String nombre) {
        super(energia, felicidad, nombre);
    }
    
    @Override
    public void comer() {
        this.energia+= 2;
    }
}
