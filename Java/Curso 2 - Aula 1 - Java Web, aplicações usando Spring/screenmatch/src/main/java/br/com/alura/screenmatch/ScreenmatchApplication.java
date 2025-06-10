package br.com.alura.screenmatch;

import java.util.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.screenmatch.principal.Principal;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print("\033[H\033[J");

		Scanner scanner = new Scanner(System.in);
		Principal principal = new Principal();

		principal.exibeMenu();
		

		
		
		scanner.close();
	}

}
