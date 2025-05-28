package org.gaboCompany.myproject.ejercicios_Herencia.Mascotas_virtuales;

public class MascotaVirtualImpl {
    public static void main(String args[]) {
        PerroVirtual perro = new PerroVirtual(5, 5, "baba yaga");
        perro.comer();
        perro.jugar();
        System.out.println(perro.mostrarEstado());
        System.out.println("");

        GatoVirtual gato = new GatoVirtual(5, 5, "kowa bunga");
        gato.comer();
        gato.jugar();
        System.out.println(gato.mostrarEstado());
        System.out.println("");

        HamsterVirtual hamster = new HamsterVirtual(5, 5, "la monjamon");
        hamster.comer();
        hamster.jugar();
        System.out.println(hamster.mostrarEstado());
        System.out.println("");
    }
}
