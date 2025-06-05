package br.com.alura.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.screenmatch.model.DadoSerie;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print("\033[H\033[J");

		var consumoApi = new ConsumoApi();
		String json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=45bb756d");
		System.out.println("====================================================================================");
		System.out.println(json);
		System.out.println("====================================================================================");
		System.out.println("");

		ConverteDados conversor = new ConverteDados();
		DadoSerie dados = conversor.obterDados(json, DadoSerie.class);
		System.out.println("====================================================================================");
		System.out.println(dados);
		System.out.println("====================================================================================");
		System.out.println("");
	}

}
