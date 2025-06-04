import java.io.PrintStream;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        // Define o idioma para Português do Brasil
        Locale.setDefault(Locale.of("pt", "BR"));
        // Força a saída do console para UTF-8
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        System.out.println("Esse é o Screem Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        //Media calculada pelas 3 notas de Jack, Paulo e João
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Média: " + media);

        String sinopse = """
                        Filme: Top Gun: Maverick
                        Filme de aventura com galã dos anos 80
                        Ano de lançamento:""" + anoDeLancamento; 
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println("Classificação: " + classificacao);
    }
}
