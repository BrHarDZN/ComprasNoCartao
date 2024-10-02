package br.com.comprar.modelos;

import java.util.Comparator;
import java.util.List;

public class Carrinho {
    private String descricao;
    private double valor;

    public Carrinho(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void listarInformacoesCarrinho(List<Carrinho> lista) {
        System.out.println("-=-=-=-=-=-=-=-=-=-Carrinho-=-=-=-=-=-=-=-=-=-");
        for (Carrinho item : lista) {
            System.out.println(item);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-Carrinho-=-=-=-=-=-=-=-=-=-");
    }

    public void OrganizarCrescente(List<Carrinho> lista) {
        lista.sort(Comparator.comparing(Carrinho::getValor));
        System.out.println("Organizando itens por valor");
        listarInformacoesCarrinho(lista);
    }

    @Override
    public String toString() {
        return "Descricao='" + descricao + ", Valor=" + valor;
    }
}
