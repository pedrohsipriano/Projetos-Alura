package br.com.musicas.classes;

public class Audio {
    private String titulo;
    private double duracao;
    private int totaolReproducoes;
    private int curtidas;
    private int filtro;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotaolReproducoes() {
        return totaolReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getFiltro() {
        return filtro;
    }
    
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void setTotaolReproducoes(int totaolReproducoes) {
        this.totaolReproducoes = totaolReproducoes;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setFiltro(int filtro) {
        this.filtro = filtro;
    }

    public void DetalhesAudio() {
        System.out.println(getTitulo());
        System.out.println("Duracao: " + getDuracao());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Reproducoes: " + getTotaolReproducoes());
    }

    public void Reproduzir() {
        setTotaolReproducoes(getTotaolReproducoes() + 1);
    }

    public void Curtir() {
        setCurtidas(getCurtidas() + 1);
    }
}
