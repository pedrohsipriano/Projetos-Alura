package br.com.alura.Atividade1.Numero;

public class Numero {
    private int numero = 0;

    

    @Override
    public String toString() {
        return "Numero [" + numero + "]";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
