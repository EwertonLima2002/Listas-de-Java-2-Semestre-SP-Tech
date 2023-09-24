public class TesteEncomenda {
    public static void main(String[] args) {

        Encomenda encomenda1 = new Encomenda('M', "Rua Santos da Glória, 18", "Av Dr. Pedro, 255", 42.2, 87.50);


        encomenda1.emitirEtiqueta();
    }
}
