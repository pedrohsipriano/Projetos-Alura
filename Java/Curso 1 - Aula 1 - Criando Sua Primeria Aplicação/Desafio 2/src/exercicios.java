import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

class App {
    public static void main(String[] args) throws Exception {
        // Define o idioma para Português do Brasil
        Locale.setDefault(Locale.of("pt", "BR"));
        // Força a saída do console para UTF-8
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        // Cria um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        double nota1 = 8.9;
        double nota2 = 7.5;
        double media = (nota1 + nota2) / 2;
        System.out.println("A média do aluno é: " + media);

        scanner.close();
    }
}