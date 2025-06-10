import atividade_1.Operacao;
import atividade_2.VerificadorPrimo;
import atividade_3.ConversorMaiuscula;

public class App {
    public static void main(String[] args) {
        Operacao operacao = (a, b) -> a * b;

        int resultado = operacao.multiplicacao(4, 5);
        System.out.println("Resultado da multiplicação: " + resultado);

        VerificadorPrimo verificador = (n) -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        int numero = 17;
        if (verificador.primo(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        ConversorMaiuscula conversor = (texto) -> texto.toUpperCase();

        String entrada = "programação com java";
        String resultadoA = conversor.converter(entrada);

        System.out.println(resultadoA);
        
    }
}

