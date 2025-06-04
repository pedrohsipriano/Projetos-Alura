import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import desafio.classes.Numeros;
import desafio.classes.Titulo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[J");

        List<Numeros> listaDeNumeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            listaDeNumeros.add(new Numeros(i));
        }

        System.out.println(listaDeNumeros);
        System.out.println("");

        List<Titulo> listaDeTitulos = new ArrayList<>();

        var Titulo1 = new Titulo("Avatar: A Lenda de Aang");
        var Titulo2 = new Titulo("Titanic");
        var Titulo3 = new Titulo("Star Wars");

        listaDeTitulos.add(Titulo1);
        listaDeTitulos.add(Titulo2);
        listaDeTitulos.add(Titulo3);

        System.out.println(listaDeTitulos);
        System.out.println("");

        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos);
        System.out.println("");

        List<Titulo> listaDeTitulosArray = new ArrayList<>();
        listaDeTitulosArray.add(Titulo1);
        listaDeTitulosArray.add(Titulo2);
        listaDeTitulosArray.add(Titulo3);
        System.out.println(listaDeTitulosArray);
        System.out.println("");

        List<Titulo> listaDeTitulosLinked = new LinkedList<>();
        listaDeTitulosLinked.add(Titulo1);
        listaDeTitulosLinked.add(Titulo2);
        listaDeTitulosLinked.add(Titulo3);
        System.out.println(listaDeTitulosLinked);
        System.out.println("");

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
