package desafio.classes.animal;

public class Animal {
    private String raca;
    private int idade;
    private String som;

    public void Som() {
        System.out.println("au au");
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Animal: " + getRaca() + " (" + getIdade() + ")";
    }
}