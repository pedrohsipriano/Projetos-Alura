// 1- Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
// 2- No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
// 3- Adicione pelo menos três pessoas à lista utilizando o método add.
// 4- Imprima o tamanho da lista utilizando o método size.
// 5- Imprima a primeira pessoa da lista utilizando o método get.
// 6- Imprima a lista completa


import java.util.ArrayList;
import br.com.desafios.classes.Pessoa;

public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[J");
        var pessoa1 = new Pessoa();
        pessoa1.setNome("Joaquim");
        pessoa1.setIdade(20);

        var pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setIdade(18);

        var pessoa3 = new Pessoa();
        pessoa3.setNome("João");
        pessoa3.setIdade(21);

        var ListaPessoas = new ArrayList<>();
        ListaPessoas.add(pessoa1);
        ListaPessoas.add(pessoa2);
        ListaPessoas.add(pessoa3);

        System.out.println(ListaPessoas.toString());
        System.out.println(ListaPessoas.size());
        System.out.println(ListaPessoas.getFirst());

        for (Object pessoa : ListaPessoas) {
            System.out.println(pessoa);
        }
    }
}
