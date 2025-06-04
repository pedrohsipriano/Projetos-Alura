import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import ProjetoFinal.GerenciadorDeTarefas.classes.Tarefas;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[J");

        Scanner scanner = new Scanner(System.in);

        List<Tarefas> Lista = new LinkedList<>();

        String opcao = "";
        int opcao2 = 0;

        System.out.println("GERENCIADOR DE TAREFAS");

        while (!opcao.equalsIgnoreCase("n")) {

            Tarefas tarefa = new Tarefas();
            System.out.println("==================================");
            System.out.print("Titulo: ");
            tarefa.setTitulo(scanner.nextLine());

            System.out.print("Descrição: ");
            tarefa.setDescricao(scanner.nextLine());

            System.out.print("Prioridade: ");
            tarefa.setPrioridade(Integer.parseInt(scanner.nextLine()));
            Lista.add(tarefa);

            System.out.println("Deseja adicionar mais uma tarefa? (s/n)");
            opcao = scanner.nextLine();
            System.out.println("==================================");
            if (!opcao.equalsIgnoreCase("s")) {
                break;
            }

        }
        while (opcao2 != 5) {
            System.out.println("");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Listar tarefas");
            System.out.println("2 - Listar tarefas por ordem de prioridade");
            System.out.println("3 - Listar tarefas concluidas");
            System.out.println("4 - Marcar tarefa como concluida");
            System.out.println("5 - Sair");
            System.out.print("Opcao: ");

            opcao2 = scanner.nextInt();
            scanner.nextLine();
            if (opcao2 == 5) {
                break;
            }

            switch (opcao2) {
                case 1:
                    System.out.println("lista de tarefas por ordem de adicionadas:");
                    Tarefas.exibirTarefas(Lista);
                    break;
                case 2:
                    Lista.sort(Comparator.comparing(Tarefas::getPrioridade));
                    System.out.println("lista de tarefas ordenados por ordem de prioridadede:");
                    System.out.println(Lista);
                    break;
                case 3:
                    Lista.sort(Comparator.comparing(Tarefas::isConcluida));
                    for (Tarefas t : Lista) {
                        if (t.isConcluida()) {
                            System.out.println(t);
                        }
                    }
                    break;
                case 4:
                    Tarefas.marcarComoConcluida(Lista, scanner);
                    break;
                case 5:
                    break;
            }
        }

        scanner.close();

    }
}