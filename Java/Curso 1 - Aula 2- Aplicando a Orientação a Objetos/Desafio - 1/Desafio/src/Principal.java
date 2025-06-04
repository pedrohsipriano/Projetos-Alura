import alura.desafio.ContaBancaria;
import alura.desafio.IdadePessoa;
import alura.desafio.Produto;
import alura.desafio.Aluno;
import alura.desafio.Livro;

public class Principal {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        System.out.println("");
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(1234567890);
        conta.setTitular("João da Silva");
        conta.setSaldo(1000.0f);
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Titular da conta: " + conta.getTitular());
        System.out.println("Saldo da conta: " + conta.getSaldo());

        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("");

        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("João");
        pessoa.setIdade(20);
        System.out.println("Nome da pessoa: " + pessoa.getNome());
        System.out.println("Idade da pessoa: " + pessoa.getIdade());
        pessoa.verificarIdade();

        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("");

        Produto produto = new Produto();
        produto.setNome("Camiseta");
        produto.setPreco(50.0);
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: " + produto.getPreco());
        produto.aplicarDesconto();
        System.out.println("Preço com desconto: " + produto.getPreco());

        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("");

        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setNota1(7.0f);
        aluno.setNota2(8.0f);
        aluno.setNota3(9.0f);
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Nota 3: " + aluno.getNota3());
        aluno.calcularMedia();

        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("");

        Livro livro = new Livro();
        livro.setTitulo("O Senhor dos Anéis");
        livro.setAutor("J.R.R. Tolkien");
        livro.Detalhes();

    }

}
