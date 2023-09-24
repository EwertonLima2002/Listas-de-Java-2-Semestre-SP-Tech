package confeitaria;

public class App {
    public static void main(String[] args) {
        Confeitaria bolos_confeitaria = new Confeitaria();
        Confeitaria bolos_confeitaria2 = new Confeitaria();
        Confeitaria bolos_confeitaria3 = new Confeitaria();


        System.out.println(
                String.format("|----------------------------------|\n" +
                                "         Relatório de Vendas\n" +
                                "|----------------------------------|\n" +
                                "1-) Bolo de %s Valor do bolo R$%.2f Total vendido %d\n" +
                                "2-) Bolo de %s Valor do bolo R$%.2f Total vendido %d\n" +
                                "3-) Bolo de %s Valor do bolo R$%.2f Total vendido %d\n",
                        bolos_confeitaria, bolos_confeitaria, bolos_confeitaria,
                        bolos_confeitaria2, bolos_confeitaria2, bolos_confeitaria2,
                        bolos_confeitaria3, bolos_confeitaria3, bolos_confeitaria3)
        );
    }
}
