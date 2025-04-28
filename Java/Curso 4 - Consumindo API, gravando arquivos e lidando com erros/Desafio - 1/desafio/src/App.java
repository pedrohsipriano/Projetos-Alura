import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        //buscar filmes

        // System.out.print("\033[H\033[J");
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Digite o filme que deseja buscar: ");
        // String filme = scanner.nextLine();

        // HttpClient client = HttpClient.newHttpClient();
        // HttpRequest request = HttpRequest.newBuilder()
        //         .uri(URI.create("https://www.googleapis.com/books/v1/volumes?q="+ filme + ":keyes&key=AIzaSyDZcwBu4xuhB3G5CTvvZdlIitaQNkJrx80"))
        //         .build();
        // HttpResponse<String> response = client
        //         .send(request, HttpResponse.BodyHandlers.ofString());
        // System.out.println(response.body());
        // scanner.close();

        //buscar livros
        // System.out.print("\033[H\033[J");
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Digite o livro que deseja buscar: ");
        // String livro = scanner.nextLine();

        // HttpClient client = HttpClient.newHttpClient();
        // HttpRequest request = HttpRequest.newBuilder()
        //         .uri(URI.create("https://www.googleapis.com/books/v1/volumes?q="+ livro + ":keyes&key=AIzaSyDZcwBu4xuhB3G5CTvvZdlIitaQNkJrx80"))
        //         .build();
        // HttpResponse<String> response = client
        //         .send(request, HttpResponse.BodyHandlers.ofString());
        // System.out.println(response.body());
        // scanner.close();

        System.out.print("\033[H\033[J");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a receita que deseja buscar: ");
        String receita = scanner.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        scanner.close();
    }
}
