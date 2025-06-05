package br.com.alura.Atividade3;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;
    
    public Tarefa() {
    }
    
    public Tarefa(String pessoaResponsavel, String descricao, boolean concluida ) {
        this.pessoaResponsavel = pessoaResponsavel;
        this.descricao = descricao;
        this.concluida = concluida;
    }
    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", concluida=" + concluida + ", pessoaResponsavel="
                + pessoaResponsavel + "]";
    }
    public String getDescricao() {
        return descricao;
    }
    public boolean isConcluida() {
        return concluida;
    }
    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

}