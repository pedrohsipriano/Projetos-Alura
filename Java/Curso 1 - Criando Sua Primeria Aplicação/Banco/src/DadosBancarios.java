import java.util.Scanner;

public class DadosBancarios {
    public static void main(String[] args) throws Exception {
        // Criação de um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Limpa a tela do terminal
        System.out.print("\033[H\033[J");

        // Mensagem de boas-vindas
        System.out.println("\nOlá, bem vindo ao sistema de dados bancários!\n");

        // Solicita e lê o nome do usuário
        System.out.print("Digite o seu Nome: ");
        String nome = scanner.nextLine();

        // Solicita e lê o saldo do usuário
        System.out.print("Digite o seu Saldo: R$");
        float saldo = scanner.nextFloat();

        // Limpa o buffer de entrada
        scanner.nextLine();

        // Solicita e lê o tipo de conta
        System.out.print("Conta Corrente ou Poupança? (C/P) ");
        String conta = scanner.nextLine();

        // Limpa a tela após a entrada dos dados
        System.out.print("\033[H\033[J");

        // Exibe o cabeçalho com informações do usuário
        System.out.println("******************************************************");
        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.printf("Saldo: R$%.2f", saldo);

        // Verifica o tipo de conta e exibe a descrição correspondente
        if (conta.equalsIgnoreCase("C")) {
            System.out.println("\nTipo de conta: Conta Corrente");
        } else if (conta.equalsIgnoreCase("P")) {
            System.out.println("\nTipo de conta: Poupança");
        } else {
            // Caso o tipo de conta seja inválido, pede novamente ao usuário
            while (!conta.equalsIgnoreCase("C") && !conta.equalsIgnoreCase("P")) {
                System.out.println("Tipo de conta: Desconhecido");
                System.out.print("Conta Corrente ou Poupança? (C/P) ");
                conta = scanner.nextLine();
                System.out.print("\033[H\033[J");
            }
            // Exibe as informações novamente após a entrada correta
            System.out.println("******************************************************");
            System.out.println("Nome: " + nome);
            System.out.printf("Saldo: R$%.2f", saldo);
            // Exibe o tipo de conta de forma correta
            System.out.println("Tipo de conta: " + (conta.equalsIgnoreCase("C") ? "Conta Corrente" : "Poupança"));
        }

        // Exibe uma linha de separação
        System.out.println("");
        System.out.println("******************************************************");

        // Variável para armazenar a opção escolhida pelo usuário
        int opcao = 0;

        // Loop principal para exibir opções até o usuário escolher sair (opção 4)
        while (opcao != 4) {
            System.out.println("");
            System.out.println("Opções:");
            System.out.println("");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Transferir Valor");
            System.out.println("3 - Receber");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            System.out.println("");

            // Switch para determinar qual operação o usuário quer executar
            switch (opcao) {
                case 1:
                    // Exibe o saldo atual do usuário
                    System.out.println("******************************************************");
                    System.out.println("");
                    System.out.printf("Seu saldo é de: R$%.2f", saldo);
                    System.out.println("");
                    System.out.println("******************************************************");
                    break;

                case 2:
                    // Operação de transferência
                    System.out.println("******************************************************");
                    System.out.println("");
                    float valorTransferido = 0;

                    // Solicita o valor da transferência
                    System.out.print("Digite o valor da transferência: R$");
                    valorTransferido = scanner.nextFloat();

                    // Verifica se o valor transferido é maior que o saldo
                    if (valorTransferido > saldo) {
                        // Enquanto o valor for maior que o saldo, solicita um novo valor
                        while (valorTransferido > saldo) {
                            System.out.println("");
                            System.out.printf("O valor de R$%.2f é maior que seu saldo de R$%.2f", valorTransferido,
                                    saldo);
                            System.out.print("Digite o valor da transferência: R$");
                            valorTransferido = scanner.nextFloat();
                        }
                    } else {
                        // Realiza a transferência e atualiza o saldo
                        System.out.println("");
                        saldo -= valorTransferido;
                        System.out.printf("Transferência realizada! Seu saldo é de: R$%.2f", saldo);
                    }
                    System.out.println("");
                    System.out.println("******************************************************");
                    break;

                case 3:
                    // Operação de recebimento
                    System.out.println("******************************************************");
                    System.out.println("");
                    System.out.print("Digite o valor do recebimento: R$");
                    float valorRecebido = scanner.nextFloat();
                    saldo += valorRecebido; // Atualiza o saldo com o valor recebido
                    System.out.println("");
                    System.out.printf("Valor recebido! Seu saldo é de: R$%.2f", saldo);
                    System.out.println("");
                    System.out.println("******************************************************");
                    break;

                case 4:
                    // Sai do sistema
                    System.out.println("******************************************************");
                    System.out.println("");
                    System.out.println("Saindo...");
                    System.out.println("");
                    System.out.println("******************************************************");
                    break;

                default:
                    // Caso o usuário escolha uma opção inválida
                    System.out.println("******************************************************");
                    System.out.println("");
                    System.out.println("Opção não encontrada. Tente novamente");
                    System.out.println("");
                    System.out.println("******************************************************");
                    break;
            }
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
