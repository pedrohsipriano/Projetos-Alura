package br.com.musicas.classes;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getApresentador() {
        return apresentador;
    }
    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }
    public void Detalhespodcast() {
        DetalhesAudio();
        System.out.println("Apresentador: " + getApresentador());
        System.out.println("Descrição: " + getDescricao());
    }
}
