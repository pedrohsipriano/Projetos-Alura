package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        var filme1 = new Filme("O Poderoso Chefão", 1972);
        filme1.avalia(9);
        var filme2 = new Filme("Avatar", 2023);
        filme2.avalia(6);
        var filme3 = new Filme("Dogville", 2003);
        filme3.avalia(10);

        var serie1 = new Serie("Lost", 2004);

        List<Titulo> Lista = new LinkedList<>();
        Lista.add(filme1);
        Lista.add(filme2);
        Lista.add(filme3);
        Lista.add(serie1);

        for (Titulo item : Lista) {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        System.out.println("");

        Lista.forEach(System.out::println);
        System.out.println("");

        var BuscaPorArtista = new ArrayList<String>();

        BuscaPorArtista.add("Artista 1");
        BuscaPorArtista.add("Artista 4");
        BuscaPorArtista.add("Artista 3");

        System.out.println("Artistas: " + BuscaPorArtista);
        Collections.sort(BuscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(BuscaPorArtista);
        System.out.println("");

        System.out.println("lista de titulos ordenados por ordem alfabetica: ");
        Collections.sort(Lista);
        System.out.println(Lista);
        System.out.println("");
        
        Lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("lista de titulos ordenados por ano de lancamento: ");
        System.out.println(Lista);
    }
}
