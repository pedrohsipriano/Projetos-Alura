package alura.desafio;

public class Produto {
    private String nome;
    private double preco;

    

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public double getPreco() {
        return preco;
    }



    public void setPreco(double preco) {
        this.preco = preco;
    }



    public void aplicarDesconto(){
        preco *= 0.9;
    }
}
