package br.com.desafio.classes.carro;

public class modeloCarro extends Carro {

    private String Cor;
    private int ano;
    private int quantidadePortas;
    public String getCor() {
        return Cor;
    }
    public void setCor(String cor) {
        this.Cor = cor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getQuantidadePortas() {
        return quantidadePortas;
    }
    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
}
