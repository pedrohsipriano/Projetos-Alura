import br.com.musicas.classes.Musica;
import br.com.musicas.classes.Podcast;
public class Principal {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        Musica musica1 = new Musica();

        musica1.setTitulo("Teste");
        musica1.setArtista("Artista Teste");
        musica1.setAlbum("Album Teste");
        musica1.setGenero("Genero Teste");
        musica1.setDuracao(3.5);
        musica1.setCurtidas(0);
        musica1.setTotaolReproducoes(0);

        musica1.DetalhesMusicas();
        System.out.println("***********************************");
        musica1.Reproduzir();
        musica1.Curtir();   

        musica1.DetalhesMusicas();
        System.out.println("------------------------------");

        Podcast podcast1 = new Podcast();

        podcast1.setTitulo("Podcast Teste");
        podcast1.setApresentador("Apresentador Teste");
        podcast1.setDescricao("Descricao Teste");
        podcast1.setDuracao(3.5);
        podcast1.setCurtidas(0);
        podcast1.setTotaolReproducoes(0);

        podcast1.Detalhespodcast();
        System.out.println("***********************************");
        podcast1.Reproduzir();
        podcast1.Curtir();   

        podcast1.Detalhespodcast();
        System.out.println("------------------------------");
        

    }
}
