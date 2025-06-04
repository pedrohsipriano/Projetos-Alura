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
        System.out.println("Classificacao: " + ExibirClassificacao());
        System.out.println("Apresentador: " + getApresentador());
        System.out.println("Descrição: " + getDescricao());
    }

    public int getClassificacao() {
        if (getTotaolReproducoes() == 0) {
            return 0;
        }else if (getTotaolReproducoes() <= 1000) {
            return 1000;
        }else{
            return 2000;
        }
    }

    public String ExibirClassificacao() {
        if (getClassificacao() == 0) {
            return "Seja o primeiro a ouvir!";
        }else if (getClassificacao() <= 1000) {
            return "Entre os podcasts mais ouvidos";
        }else {
            return "Top 10 podcasts mais ouvidos";
        }        
    }
}