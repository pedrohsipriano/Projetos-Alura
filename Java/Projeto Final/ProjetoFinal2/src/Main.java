import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ProjetoFinal2.desafio.classes.Contatos;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[J");
        Scanner scanner = new Scanner(System.in);

        List<Contatos> lista = new ArrayList<>();

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("=================================");
            System.out.println("LISTA DE CONTATOS");
            System.out.println("");
            System.out.println("O que deseja fazer?");
            System.out.println("");
            System.out.println("1 - Visualizar contatos.");
            System.out.println("2 - Buscar contato.");
            System.out.println("3 - Adicionar contato.");
            System.out.println("4 - Remover contato.");
            System.out.println("5 - Sair");
            System.out.println("");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("=================================");

            switch (opcao) {
                case 1:
                    System.out.println("Visualizar Contatos:");
                    Contatos.exibirContatos(lista);
                    break;
                case 2:
                    System.out.println("Buscar Contatos:");
                    Contatos.buscarContato(lista);
                    break;
                case 3:
                    System.out.println("Adicionar contatos:");
                    Contatos.adicionarContato(lista);
                    break;
                case 4:
                    System.out.println("3 - Remover contato.");
                    Contatos.removerContato(lista);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    System.out.println("=================================");
                    break;
                default:
                    System.out.println("Opção inválida!");
            if (opcao == 5) {
                break;
            }
            }
        }       
        scanner.close();
    }
}
