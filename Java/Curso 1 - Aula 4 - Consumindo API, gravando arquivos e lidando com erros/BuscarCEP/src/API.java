import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class API {
    private String CEP = "";
    
    public void buscaCep() throws IOException, InterruptedException {
        try {
            Scanner scanner = new Scanner(System.in);
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting().create();
            System.out.print("Digite o CEP: ");
            CEP = scanner.nextLine();
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(
                            "https://viacep.com.br/ws/" + CEP.replace("-", "") + "/json/"))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

            String json = response.body();
            CEPFormatado CEP1 = gson.fromJson(json, CEPFormatado.class);

            FileWriter writer = new FileWriter(CEP + ".json");

            writer.write(gson.toJson(CEP1));

            scanner.close();
            writer.close();
        }catch (java.lang.IllegalStateException e) {
            System.out.println("Digite um CEP válido!");
            System.out.println(e.getMessage());
        }catch (RuntimeException e) {
            System.out.println("Digite um CEP válido!");
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Digite um CEP válido!");
            System.out.println(e.getMessage());
        }
    }
}
