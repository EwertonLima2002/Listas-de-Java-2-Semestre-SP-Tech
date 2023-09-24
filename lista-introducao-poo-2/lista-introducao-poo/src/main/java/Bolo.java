public class Bolo {
    String sabor;
    double valor;
    int quantidadeVendida;

    public Bolo(String sabor, double valor) {
        this.sabor = sabor;
        this.valor = valor;
        quantidadeVendida = 0;
    }

    public void comprarBolo(int quantidadeDesejada) {
        if (quantidadeDesejada > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        } else {
            quantidadeVendida += quantidadeDesejada;
        }
    }

    public void exibirRelatorio() {
        double totalVendido = quantidadeVendida * valor;
        System.out.println("O bolo sabor " + sabor + " foi comprado " + quantidadeVendida +
                " vezes hoje, totalizando R$" + totalVendido);
    }
}


