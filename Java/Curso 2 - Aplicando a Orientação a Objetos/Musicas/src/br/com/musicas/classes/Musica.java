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
        System.out.println("Album: " + getAlbum());
        System.out.println("Artista: " + getArtista());
        System.out.println("Genreo: " + getGenero());
    }
}
