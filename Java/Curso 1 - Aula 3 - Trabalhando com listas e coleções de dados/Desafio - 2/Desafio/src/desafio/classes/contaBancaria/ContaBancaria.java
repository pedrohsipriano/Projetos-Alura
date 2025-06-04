package desafio.classes.contaBancaria;

public class ContaBancaria implements Comparable<ContaBancaria> {
    private int numero;
    private double valor; // Usando 'valor' como saldo

    public ContaBancaria(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Implementação da comparação para Collections.max()
    @Override
    public int compareTo(ContaBancaria outraConta) {
        return Double.compare(this.valor, outraConta.valor);
    }

    @Override
    public String toString() {
        return "Conta " + numero + " | Saldo: R$" + valor;
    }
}
