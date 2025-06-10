package br.com.alura;

import java.io.File;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.alura.Atividade1.Numero.Numero;
import br.com.alura.Atividade3.Tarefa;
import br.com.alura.Atividade6.Avaliacao;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.print("\033[H\033[J");
		
		Scanner scanner = new Scanner(System.in);
		var numero = new Numero ();
		
		System.out.print("Digite um número: ");
		numero.setNumero(scanner.nextInt());

		for (int i = 1; i <= numero.getNumero(); i++) {
			System.out.println(i);
		}

		System.out.println(numero);

		var tarefa = new Tarefa ("Pedro", "Limpar a casa", true);
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File("tarefa.json"), tarefa);
		System.out.println("Arquivo criado com sucesso!");

		// ObjectMapper objectMapper = new ObjectMapper();
      	Tarefa tarefaLida = objectMapper.readValue(new File("tarefa.json"), Tarefa.class);
      	System.out.println("Tarefa lida do JSON:");
      	System.out.println(tarefaLida);
		scanner.close();


		var avaliacao = new Avaliacao<String>("Livro", 10, "Muito bom!");
		System.out.println(avaliacao);
	}

}
