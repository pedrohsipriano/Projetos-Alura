import br.com.desafio.classes.animal.cachorro;
import br.com.desafio.classes.animal.gato;
import br.com.desafio.classes.carro.modeloCarro;
import br.com.desafio.classes.contaBancaria.ContaCorrente;

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
        carro1.Descricao();
        System.out.println("--------------------------------------------------------------");
        cachorro cachorro1 = new cachorro();
        cachorro1.emitirSom();
        cachorro1.AbanarORabo();
        gato gato1 = new gato();
        gato1.emitirSom();
        gato1.ArranharAPorta();
        System.out.println("--------------------------------------------------------------");
        ContaCorrente conta1 = new ContaCorrente();
        conta1.setTitular("Joaquim");
        conta1.Extrato();
        conta1.Deposito(100);
        conta1.sacarComTarifa(50);
        System.out.println("--------------------------------------------------------------");

    }
}
