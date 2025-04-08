import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Epidosdio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");

        Filme meuFilme = new Filme();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(142);
        System.out.println("Duração do filme:" + meuFilme.getDuracaoEmMinutos());
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(9.0);
        meuFilme.avalia(9.5);
        meuFilme.avalia(10.0);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        System.out.println("");

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(24);
        lost.setMinutosPorEpisodio(45);
        System.out.println("Duração para maratonar:" + lost.getDuracaoEmMinutos());
        lost.exibeFichaTecnica();

        Filme outroFilme = new Filme();

        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);
        System.out.println("Duração do filme:" + outroFilme.getDuracaoEmMinutos());
        outroFilme.exibeFichaTecnica();


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Epidosdio epidosdio1 = new Epidosdio();
        epidosdio1.setNome("Morte");
        epidosdio1.setNumero(11);
        epidosdio1.setSerie(lost);
        epidosdio1.setTotalVisualizacoes(0);

        filtro.filtra(epidosdio1);
    }
} 