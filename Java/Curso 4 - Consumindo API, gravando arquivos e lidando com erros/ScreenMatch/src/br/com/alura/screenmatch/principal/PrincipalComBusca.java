package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.print("\033[H\033[J");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o filme que deseja buscar: ");
        String filme = scanner.nextLine();
    
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://www.omdbapi.com/?t="+ filme +"&apikey=45bb756d"))
            .build();
        HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        String json = response.body();


        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println(meuTituloOmdb);
        System.out.println("");
        System.out.println("Titulo convertido: ");
        System.out.println(meuTitulo);

        scanner.close();
    }
}