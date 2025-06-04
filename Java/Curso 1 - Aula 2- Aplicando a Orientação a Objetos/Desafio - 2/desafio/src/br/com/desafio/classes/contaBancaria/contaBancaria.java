package br.com.desafio.classes.contaBancaria;

public class contaBancaria {
    private String titular;
    private double saldo = 0.0;
    private double deposito = 0.0;
    private double saque = 0.0;

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

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public void Extrato() {
        System.out.println("Titular: " + getTitular() + " Saldo: " + getSaldo());
    }

    public void Deposito(double valor) {
        setSaldo(saldo += valor);
        System.out.println("Depósito: " + valor + " Novo Saldo: " + getSaldo());
    }

    public void Saque(double valor) {
        if (saldo >= valor) {
            setSaldo(saldo -= valor);
            System.out.println("Saque: " + valor + " Novo Saldo: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}