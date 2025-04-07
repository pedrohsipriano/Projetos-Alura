import br.com.desafio.classes.carro.Carro;
import br.com.desafio.classes.carro.modeloCarro;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[J");

        modeloCarro carro1 = new modeloCarro();
        carro1.setModelo("Corsa");
        carro1.setPreco1(10000);
        carro1.setPreco2(20000);
        carro1.setPreco3(30000);
        carro1.setCor("Vermelho");
        carro1.setAno(2010);
        carro1.setQuantidadePortas(4);
        
        carro1.imprimirPrecoMaiorPreco();
        carro1.imprimirPrecoMenorPreco();

        Carro carro2 = new Carro("Fusca", 10000, 20000, 30000);
        carro2.imprimirPrecoMaiorPreco();
        carro1.imprimirPrecoMenorPreco();

    }
}
