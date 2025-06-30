import java.text.Normalizer;
import java.util.function.Predicate;

import atividade_1.Operacao;
import atividade_2.VerificadorPrimo;
import atividade_3.ConversorMaiuscula;
import atividade_4.Palindromo;

public class App {
    public static void main(String[] args) {
        Operacao operacao = (a, b) -> a * b;

        int resultado = operacao.multiplicacao(4, 5);
        System.out.println("Resultado da multiplicação: " + resultado);

        VerificadorPrimo verificador = (n) -> {
            if (n <= 1)
                return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
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

        String entradaA = "programação com java";
        String resultadoA = conversor.converter(entradaA);

        System.out.println(resultadoA);

        Palindromo verificadorPalindromo = (texto) -> {
            // Normaliza e remove acentos
            String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD)
                    .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
                    .replaceAll("[\\W_]", "")
                    .toLowerCase();

            String textoInvertido = new StringBuilder(textoNormalizado).reverse().toString();

            return textoNormalizado.equals(textoInvertido);
        };

        // Testando
        String entradaB = "o i o";
        boolean resultadoB = verificadorPalindromo.verificarPalindromo(entradaB);

        System.out.println(resultadoB); // Deve imprimir: true

    }
}
