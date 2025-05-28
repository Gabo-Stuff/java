package org.gaboCompany.myproject.ejercicios_Herencia.Mascotas_virtuales;

public class HamsterVirtual extends MascotaVirtual {

    public HamsterVirtual(int energia, int felicidad, String nombre) {
        super(energia, felicidad, nombre);
    }
    
    @Override
    public void jugar() {
        this.energia-= 2;
        this.felicidad+= 1;
    }
}
