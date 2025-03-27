import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");

        Filme meuFilme = new Filme();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(142);
        meuFilme.exibeFichaTecnica();

        

        meuFilme.avalia(9.0);
        meuFilme.avalia(9.5);
        meuFilme.avalia(10.0);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        System.out.println("");
    }
} 