import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import desafio.classes.animal.Animal;
import desafio.classes.animal.Cachorro;
import desafio.classes.area.Circulo;
import desafio.classes.area.Forma;
import desafio.classes.area.Quadrado;
import desafio.classes.contaBancaria.ContaBancaria;
import desafio.classes.produtos.Produto;

public class App{
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[J");
        var Cachorro1 = new Cachorro();
        var Cachorro2 = new Cachorro();
        var Cachorro3 = new Cachorro();
        var Cachorro4 = new Cachorro();
        var Cachorro5 = new Cachorro();

        Cachorro1.setRaca("Pastor Alemão");
        Cachorro1.setIdade(1);
        Cachorro2.setRaca("Golden Retriever");
        Cachorro2.setIdade(2);
        Cachorro3.setRaca("Poodle");
        Cachorro3.setIdade(3);
        Cachorro4.setRaca("Shih Tzu");
        Cachorro4.setIdade(4);
        Cachorro5.setRaca("Bulldog");
        Cachorro5.setIdade(5);

        var Animais = new ArrayList<Cachorro>();

        Animais.add(Cachorro1);
        Animais.add(Cachorro2);
        Animais.add(Cachorro3);
        Animais.add(Cachorro4);
        Animais.add(Cachorro5);

        for (Animal item : Animais) {
            System.out.println(item);
            if (item instanceof Animal) {
                Cachorro dog = new Cachorro();

                Animal animal = (Animal) dog;

                animal.Som();
            }
        }
        System.out.println("\n");
        var Produto1 = new Produto("Arroz", 5.99);
        var Produto2 = new Produto("Feijão", 6.99);
        var Produto3 = new Produto("Macarrão", 7.99);
        var Produto4 = new Produto("Batata", 8.99);

        var Produtos = new ArrayList<Produto>();

        Produtos.add(Produto1);
        Produtos.add(Produto2);
        Produtos.add(Produto3);
        Produtos.add(Produto4);

        for (Produto item : Produtos) {
            double media = item.getPreco()/4;
            System.out.println("Produto: " + item.getNome() + " (" + media + ")");
        }
        System.out.println("\n");
        List<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(3));
        formas.add(new Quadrado(4));
        formas.add(new Circulo(5));
        formas.add(new Quadrado(2.5));

        for (Forma f : formas) {
            System.out.println("Área: " + f.calcularArea());
        }

        System.out.println("\n");

        var Conta1 = new ContaBancaria(1, 1000.00);
        var Conta2 = new ContaBancaria(2, 2000.00);
        var Conta3 = new ContaBancaria(3, 3000.00);
        var Conta4 = new ContaBancaria(4, 4000.00);

        var Contas = new ArrayList<ContaBancaria>();

        Contas.add(Conta1);
        Contas.add(Conta2);
        Contas.add(Conta3);
        Contas.add(Conta4);

        
        System.out.println(Collections.max(Contas)); 

    }
}
