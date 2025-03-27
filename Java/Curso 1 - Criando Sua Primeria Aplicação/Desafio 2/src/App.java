import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Cria um objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ponha a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("%.2f graus Celsius equivale a %.0f graus Fahrenheit",celsius, fahrenheit);


        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
