package br.com.desafio.classes.animal;

public class animal {
    private boolean som;

    public boolean isSom() {
        return som;
    }

    public void setSom(boolean som) {
        this.som = som;
    }

    public void emitirSom() {
        if (som == true) {
            System.out.println("Animal emite som");
        }
    }
}


