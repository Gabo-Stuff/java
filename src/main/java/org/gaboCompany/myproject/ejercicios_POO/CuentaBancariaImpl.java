package org.gaboCompany.myproject.ejercicios_POO;

public class CuentaBancariaImpl {
    
    public static void main(String args[]) {
        CuentaBancaria gesting = new CuentaBancaria(3,"Maria José");
        System.out.println(gesting.toString());
        gesting.depositar(0.3);
        gesting.retirar(6);
        System.out.println("Resumen final: ");
        System.out.println(gesting.toString());
        System.out.println();

        CuentaBancaria gesting2 = new CuentaBancaria(444,"Jose María");
        System.out.println(gesting2.toString());
        gesting2.depositar(44);
        gesting2.retirar(88);
        gesting2.consultarSaldo();
        System.out.println("Resumen final: ");
        System.out.println(gesting2.toString());
        System.out.println();
    }
}
