public class TesteProdutos {
    public static void main(String[] args) {


        Produto produto01 = new Produto("S10 Lite" , "Telefonia" , 1600.40);
        Produto produto02 = new Produto("Arroz" , "Alimentação" , 21.50);



        Carrinho carrinho01 = new Carrinho("Ewerton");


        carrinho01.adicionar(produto01);
        carrinho01.adicionar(produto02);

        System.out.println(carrinho01.getQuantidade());
        System.out.println(carrinho01.existePorNome("S10 Lite"));
        System.out.println(carrinho01.getValorTotal());
        System.out.println(carrinho01.getProdutos());
        System.out.println(carrinho01.getQuatidadePorCategoria("Alimentação"));
        carrinho01.getPorNome("S10 Lite");
        carrinho01.getPorNome("Feijão");
        carrinho01.removerPorNome("S10 Lite");
        System.out.println(carrinho01.getProdutos());
        System.out.println("Limpando o carrinho");
        carrinho01.limpar();
        System.out.println("Lista atualizada de Compras");
        System.out.println(carrinho01.getProdutos());




    }
}
