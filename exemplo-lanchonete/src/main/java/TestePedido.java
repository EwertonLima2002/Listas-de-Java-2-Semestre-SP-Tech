public class TestePedido {
    public static void main(String[] args) {
        Pedido pedido01 = new Pedido(496 , "67" , 25.0 , "Dogão" , "Proibida" );
        Pedido pedido02 = new Pedido(499 , "69" , 10.0 , "Bolo de Laranja" ,
                "Heineck" );
        pedido01.exibirPedido();
        pedido02.exibirPedido();

        Lanchonete lanchonete = new Lanchonete("Lanchonete Feliz");

        lanchonete.exibirRelatorio();

        lanchonete.prepararPedido(pedido02);

    }
}
