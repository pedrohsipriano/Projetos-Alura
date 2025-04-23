package desafio.classes;

public class Numeros {
    private int numeros;

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public Numeros(int numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Numero [" + numeros + "]";
    }
}
