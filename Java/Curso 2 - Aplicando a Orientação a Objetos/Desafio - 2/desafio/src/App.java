import br.com.desafio.classes.animal.animal;
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
        
        carro1.Descricao();


        animal animal1 = new animal();
        animal1.setSom(true);
        animal1.emitirSom();
    }
}
