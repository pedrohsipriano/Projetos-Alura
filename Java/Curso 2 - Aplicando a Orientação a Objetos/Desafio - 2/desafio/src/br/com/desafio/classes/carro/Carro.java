package br.com.desafio.classes.carro;

public class Carro {
    private String modelo;
    private float preco1;
    private float preco2;
    private float preco3;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco1() {
        return preco1;
    }

    public void setPreco1(float preco1) {
        this.preco1 = preco1;
    }

    public float getPreco2() {
        return preco2;
    }

    public void setPreco2(float preco2) {
        this.preco2 = preco2;
    }

    public float getPreco3() {
        return preco3;
    }

    public void setPreco3(float preco3) {
        this.preco3 = preco3;
    }

    public void imprimirPrecoMaiorPreco() {
        if (preco1 > preco2 && preco1 > preco3) {
            System.out.println("O carro mais caro é o modelo " + getModelo() + " e custa R$ " + getPreco1());
        } else if (preco2 > preco1 && preco2 > preco3) {
            System.out.println("O carro mais caro é o modelo " + getModelo() + " e custa R$ " + getPreco2());
        } else if (preco3 > preco1 && preco3 > preco2) {
            System.out.println("O carro mais caro é o modelo " + getModelo() + " e custa R$ " + getPreco3());
        }
    }

    public void imprimirPrecoMenorPreco() {
        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("O carro mais barato é o modelo " + getModelo() + " e custa R$ " + getPreco1());
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("O carro mais barato é o modelo " + getModelo() + " e custa R$ " + getPreco2());
        } else if (preco3 < preco1 && preco3 < preco2) {
            System.out.println("O carro mais barato é o modelo " + getModelo() + " e custa R$ " + getPreco3());
        }
    }
}
