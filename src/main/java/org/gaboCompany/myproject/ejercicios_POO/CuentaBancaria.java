package org.gaboCompany.myproject.ejercicios_POO;

import java.util.Objects;

public class CuentaBancaria {
    
    protected String titular;
    protected double saldo;

    public CuentaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    public void retirar(double saldo) {
        if (saldo > this.saldo) System.err.println("ERROR: no tienes tanto sorry");
        else this.saldo -= saldo;
    }

    public double consultarSaldo() {
        return this.getSaldo();
    }

    @Override
    public String toString() {
        return "CuentaBancaria [titular=" + titular + ", saldo=" + saldo + "]";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.titular);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CuentaBancaria other = (CuentaBancaria) obj;
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        return Objects.equals(this.titular, other.titular);
    }

}
