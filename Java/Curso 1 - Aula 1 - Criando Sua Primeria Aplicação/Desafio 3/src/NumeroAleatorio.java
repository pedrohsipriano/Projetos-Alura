import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) throws Exception {
        Scanner NumeroAleatorio = new Scanner(System.in);
        int aleatorio = new Random().nextInt(101);
        System.out.println("Este é o jogo do número secreto!");
        System.out.println("Digite um número de 0 a 100: ");
        int numeroDigitado = NumeroAleatorio.nextInt();
        
        while (numeroDigitado != aleatorio) {
            if (numeroDigitado > aleatorio) {
                System.out.println("");
                System.out.println("O número digitado é maior que o número aleatório");
            } else {
                System.out.println("");
                System.out.println("O número digitado é menor que o número aleatório");
            }
            System.out.println("Digite um número de 0 a 100: ");
            numeroDigitado = NumeroAleatorio.nextInt();
        }
        System.out.println("Parabéns, vocé acertou!");
        NumeroAleatorio.close();
    }
}
