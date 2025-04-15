package br.com.musicas.classes;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void DetalhesMusicas() {
        DetalhesAudio();
        System.out.println("Classificacao: " + ExibirClassificacao());
        System.out.println("Album: " + getAlbum());
        System.out.println("Artista: " + getArtista());
        System.out.println("Genreo: " + getGenero());
    }

    public int getClassificacao() {
        if (getCurtidas() == 0) {
            return 0;
        } else if (getCurtidas() <= 1000) {
            return 1000;
        } else {
            return 2000;
        }
    }

    public String ExibirClassificacao() {
        if (getClassificacao() == 0) {
            return "Seja o primeiro a curtir!";
        } else if (getClassificacao() <= 1000) {
            return "Entre as musicas mais curtidas";
        } else {
            return "Top 10 musicas mais curtidas";
        }
    }
}
