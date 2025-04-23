package desafio.classes;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    @Override
    public String toString() {
        return "Titulo [" + nome + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
