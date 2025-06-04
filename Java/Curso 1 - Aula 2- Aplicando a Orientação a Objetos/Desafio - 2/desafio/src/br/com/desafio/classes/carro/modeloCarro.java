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

    public void Descricao(){
        System.out.println("O modelo do carro é: " + getModelo());
        System.out.println("O preço do modelo no primeiro ano é: " + getPreco1());
        System.out.println("O preço do modelo no segundo ano é: " + getPreco2());
        System.out.println("O preço do modelo no terceiro ano é: " + getPreco3());
        System.out.println("O ano de lançamento do veiculo é: " + getAno());
        System.out.println("A cor do veiuclo é: " + getCor());
        System.out.println("A quantidade de portas do veiculo é: " + getQuantidadePortas());
    }
}
