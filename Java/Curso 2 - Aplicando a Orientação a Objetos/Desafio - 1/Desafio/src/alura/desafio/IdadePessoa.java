package alura.desafio;
public class IdadePessoa {
    private String nome;
    private int idade = 0;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    } 
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("Pessoa maior de idade.");
        } else {
            System.out.println("Pessoa menor de idade.");
        }
    }
}
