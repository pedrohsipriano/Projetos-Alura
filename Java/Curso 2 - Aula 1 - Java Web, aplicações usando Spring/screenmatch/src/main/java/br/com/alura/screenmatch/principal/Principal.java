package br.com.alura.screenmatch.principal;

import java.util.*;

import br.com.alura.screenmatch.model.DadoSerie;
import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

public class Principal {
    private Scanner scanner = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KAY = "&apikey=45bb756d";

    public void exibeMenu() {
        
        System.out.println("Digite o nome da serie para busca: ");
       
        var nomeSerie = scanner.nextLine();
        var json = consumo.obterDados( ENDERECO + nomeSerie.replace(" ", "+") + API_KAY);

		DadoSerie dados = conversor.obterDados(json, DadoSerie.class);
        System.out.println("====================================================================================");
        System.out.println(dados);
        System.out.println("====================================================================================");
		System.out.println("");

        List<DadosTemporada> temporadas = new ArrayList<>();
		for (int i = 1; i <= dados.totalTemporadas(); i++) {
			json = consumo.obterDados( ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KAY);
			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada);
			System.out.println("====================================================================================");
			System.out.println(dadosTemporada);
			System.out.println("====================================================================================");
			System.out.println("");
		}

        // for (int i = 0; i < dados.totalTemporadas(); i++) {
        //     System.out.println("====================================================================================");
        //     List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
        //     for(int j = 0; j < episodiosTemporada.size(); j++) {
        //         System.out.println(episodiosTemporada.get(j).titulo());
        //     }
        //     System.out.println("====================================================================================");
		// 	System.out.println("");
        // }

        System.out.println("====================================================================================");
        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));
        System.out.println("====================================================================================");
		System.out.println("");
		// System.out.println("====================================================================================");
		// temporadas.forEach(System.out::println);
		// System.out.println("====================================================================================");

		// System.out.println("====================================================================================");
		// System.out.print("Digite o numero da temporada que deseja ver: ");
		// int temporada = scanner.nextInt();
		// System.out.print("\033[H\033[J");
		// System.out.print("Digite o numero da temporada que deseja ver: " + temporada);
		// System.out.println("");
		// System.out.println("====================================================================================");
		// json = consumo.obterDados("https://www.omdbapi.com/?t=gilmore+girls&Season="+ temporada +"&apikey=45bb756d");
		// DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
		// System.out.println(dadosTemporada);
		// System.out.println("====================================================================================");
		// System.out.println("");
    }
}
