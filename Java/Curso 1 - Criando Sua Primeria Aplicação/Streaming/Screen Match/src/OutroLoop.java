import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliacao para o filme ou -1 para parar:");
            nota = Leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Media das avaliações: " + mediaAvaliacao / totalDeNotas);
        Leitura.close();
    }
}
 