package vendas;

public class TesteVenda {
    public static void main(String[] args) {
        VendedorComissao venda01 = new VendedorComissao(01 , "Mario" , 200.0 , 5.6);
        VendedorComissaoMaisFixo venda_02= new VendedorComissaoMaisFixo(02 , "Lucas" , 3.0 , 5.0, 50.0);

        System.out.println(venda01.calcular_salario());
        System.out.println(venda_02.calcular_salario());

        System.out.println("Vendedor com comissão\n" + venda01);
        System.out.println("Vendedor com comissão mais fixo \n" + venda_02);
    }
}
