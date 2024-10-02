package br.com.comprar.modelos;

public class Produto extends Carrinho {

    public Produto(String descricao, double valor) {
        super(descricao, valor);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "Descricao='" + getDescricao() + '\'' +
                ", Valor=" + getValor() +
                '}';
    }
}
