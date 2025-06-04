package br.com.desafio.classes.contaBancaria;

public class ContaCorrente extends contaBancaria {

    public void sacarComTarifa(double valor) {
        double valorComTarifa = valor + 10.0; // tarifa fixa de R$10

        if (getSaldo() >= valorComTarifa) {
            setSaldo(getSaldo() - valorComTarifa);
            System.out.println("Saque de R$" + valor + " (com tarifa de R$10). Novo saldo: R$" + getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque com tarifa.");
        }
    }
}
