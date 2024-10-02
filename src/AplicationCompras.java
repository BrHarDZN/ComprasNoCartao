import br.com.comprar.modelos.Carrinho;
import br.com.comprar.modelos.CartaoCredito;
import br.com.comprar.modelos.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicationCompras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o titular do cartão");
        String titular = scanner.nextLine();

        System.out.println("Digite o Limite do cartão");
        double limite = scanner.nextDouble();

        CartaoCredito cartao = new CartaoCredito(titular, limite);

        List<Carrinho> lista = new ArrayList<>();

        lista.add(cartao);

        int continuarAplicacao = 1;

        Carrinho produto = null;
        while (continuarAplicacao == 1) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Digite a descriçao do produto");
            String descricao = scanner2.nextLine();

            System.out.println("Digite o valor da compra");
            double valor = scanner2.nextDouble();

            produto = new Produto(descricao, valor);

            if (cartao.descontaValor(produto.getValor())) {
                lista.add(produto);
            }

            System.out.println();
            System.out.println("deseja Continuar comprando se sim digite 1, se não digite 0");
            continuarAplicacao = scanner.nextInt();
        }

        Carrinho carrinho = produto;
        carrinho.listarInformacoesCarrinho(lista);
        carrinho.OrganizarCrescente(lista);

        System.out.println(cartao.getValor());

    }
}