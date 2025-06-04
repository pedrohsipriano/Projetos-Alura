import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        FileWriter escrita = new FileWriter("arquvo.txt");
        escrita.write("Conteúdo a ser gravado no arquivo.");
        escrita.close();


        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        Gson gson1 = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting().create();
        String Titulo1 = gson.toJson(new Titulo("O Senhor dos Aneis", "J.R.R. Tolkien", 300, "Fantasia"));
        String Titulo2 = gson1.toJson(new Titulo("Vingadores", "Stan Lee", 200, "Aventura"));
        System.out.println(Titulo1 + "\n" + Titulo2);

        String veiculo1 = gson1.toJson(new Veiculo("Camaro", 2022, "Vermelho"));
        System.out.println(veiculo1);
    }
}
 