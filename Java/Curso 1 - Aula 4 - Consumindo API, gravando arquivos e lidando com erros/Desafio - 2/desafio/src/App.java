import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        String json = """
            {
                "nome": "Ana",
                "idade": 25,
                "cidade": "São Paulo"
            }
        """;

        String json2 = """
            {
                "nome": "Ana",
                "idade": 25,
                "profissão": "Programador"
            }
        """;



        // Gson gson = new Gson();

        // Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        // System.out.println(pessoa);

        // Gson gson = new GsonBuilder().setLenient().create(); //nova versão do java faz isso automaticamente 
        // Pessoa1 pessoa1 = gson.fromJson(json2, Pessoa1.class);
        // System.out.println(pessoa1);

        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println("Objeto Livro: " + livro);
        

    }
}
