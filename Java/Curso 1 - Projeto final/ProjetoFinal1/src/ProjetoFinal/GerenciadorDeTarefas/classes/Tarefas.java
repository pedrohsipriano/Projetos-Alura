package ProjetoFinal.GerenciadorDeTarefas.classes;

import java.util.List;
import java.util.Scanner;

public class Tarefas {
    public String titulo;
    public String descricao;
    public int prioridade;
    public boolean concluida;

    // public Tarefas(String descricao, int prioridade, boolean concluida) {
    // this.descricao = descricao;
    // this.prioridade = prioridade;
    // this.concluida = concluida;
    // }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public static void marcarComoConcluida(List<Tarefas> lista, Scanner scanner) {
        System.out.println("Digite o número da tarefa a ser marcada como concluída:");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i).getDescricao());
        }

        int indice = Integer.parseInt(scanner.nextLine());

        if (indice >= 0 && indice < lista.size()) {
            lista.get(indice).setConcluida(true);
            System.out.println("Tarefa marcada como concluída!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    @Override
    public String toString() {
        return String.format("Título: %s | Descrição: %s | Prioridade: %d | Concluída: %s",
                titulo, descricao, prioridade, concluida ? "Sim" : "Não");
    }

    public static void exibirTarefas(List<Tarefas> lista) {
        for (Tarefas tarefa : lista) {
            System.out.println(tarefa);
        }
    }

}
