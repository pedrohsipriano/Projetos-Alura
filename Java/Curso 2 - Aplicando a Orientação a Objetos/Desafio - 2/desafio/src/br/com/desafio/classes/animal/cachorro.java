package br.com.desafio.classes.animal;

public class cachorro extends animal{

    @Override
    public void emitirSom() {
        System.out.println("au-au");
        super.emitirSom();
    }
    public void AbanarORabo(){
        System.out.println("Abanar o rabo");
    }
    
}
