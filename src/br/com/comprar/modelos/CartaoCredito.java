package br.com.comprar.modelos;

public class CartaoCredito extends Carrinho {

    public CartaoCredito(String descricao, double valor) {
        super(descricao, valor);
    }

    public Boolean descontaValor(double valorCompra) {
        double LimiteCartao = this.getValor() - valorCompra;
        if (LimiteCartao >= 0) {
            setValor(LimiteCartao);
            System.out.println("Compra Realizada com sucesso");
            System.out.println("Limite atual: " + getValor());
            System.out.println("item adicionado no carrinho");
            return true;
        } else {
            System.out.println("Limite do cartão estourado");
            System.out.println("Limite atual: " + getValor());
            System.out.println("item não adicionado no carrinho");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cartão{" +
                "Titular='" + getDescricao() + '\'' +
                ",Limite=" + getValor() +
                '}';
    }
}
