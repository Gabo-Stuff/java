package org.gaboCompany.myproject.ejercicios_Herencia.Mascotas_virtuales;

public class PerroVirtual extends MascotaVirtual {

    public PerroVirtual(int energia, int felicidad, String nombre) {
        super(energia, felicidad, nombre);
    }
    
    @Override
    public void jugar() {
        this.felicidad+= 2;
        this.energia-= 1;
    }
}
