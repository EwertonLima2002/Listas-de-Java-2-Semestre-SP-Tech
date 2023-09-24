public class App {
    public static void main(String[] args) {
        Bolo boloChocolate = new Bolo("chocolate", 40.00);
        Bolo boloMorango = new Bolo("morango", 45.00);
        Bolo boloAbacaxi = new Bolo("abacaxi", 35.00);


        boloChocolate.comprarBolo(5);
        boloMorango.comprarBolo(7);
        boloAbacaxi.comprarBolo(8);


        boloChocolate.exibirRelatorio();
        boloMorango.exibirRelatorio();
        boloAbacaxi.exibirRelatorio();
    }
}
