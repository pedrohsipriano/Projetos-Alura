package br.com.desafio.classes.animal;

public class gato extends animal{

    @Override
    public void emitirSom() {
        System.out.println("Miau");
        super.emitirSom();
    }
    
    public void ArranharAPorta(){
        System.out.println("Arranhar a porta");
    }
}
