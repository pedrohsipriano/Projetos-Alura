package desafio.produtos.classes;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public boolean lancarCompra(Compra compra) {
        if (saldo >= compra.getValor()) {
            saldo -= compra.getValor();
            compras.add(compra);
            return true;
        }
        return false;
    }
}
