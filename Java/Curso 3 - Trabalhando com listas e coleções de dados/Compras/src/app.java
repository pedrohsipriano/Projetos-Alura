import java.util.Collections;
import java.util.Scanner;
import desafio.produtos.classes.CartaoDeCredito;
import desafio.produtos.classes.Compra;

public class app {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o limite do cartão de crédito: ");
        double limite = scanner.nextDouble();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0) {
            System.out.print("Digite a descrição da compra: ");
            String descricao = scanner.next();

            System.out.print("Digite o valor da compra: ");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartaoDeCredito.lancarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Digite 0 para sair ou 1 para continuar: ");
                sair = scanner.nextInt();
            } else {
                System.out.println("Compra não realizada, saldo insuficiente!");
                sair = 0;
            }
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("Compras realizadas: \n");
        Collections.sort(cartaoDeCredito.getCompras());

        for (Compra c : cartaoDeCredito.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("\nSaldo do cartão de crédito: " + cartaoDeCredito.getSaldo());
        scanner.close();
    }
}
