package bilhete;

public class TesteBilhete {
    public static void main(String[] args) {
        // instaciar = criar um objeto

        BilheteUnico bilhete01 = new BilheteUnico();
        bilhete01.nome_titular = "Ewerton";
        bilhete01.saldo = 0.0;

        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.saldo = 0.0;
        bilhete02.nome_titular = "Xampson";

        bilhete02.carregar(10.0);
        bilhete01.carregar(42.0);



    }
}
