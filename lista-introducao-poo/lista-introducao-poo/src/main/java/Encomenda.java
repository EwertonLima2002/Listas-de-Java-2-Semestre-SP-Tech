public class Encomenda {
     char tamanho;
     String enderecoRemetente;
     String enderecoDestinatario;
    double distancia;
     double valorEncomenda;


    public Encomenda(char tamanho, String enderecoRemetente, String enderecoDestinatario, double distancia, double valorEncomenda) {
        tamanho = tamanho;
        enderecoRemetente = enderecoRemetente;
        enderecoDestinatario = enderecoDestinatario;
        distancia = distancia;
        valorEncomenda = valorEncomenda;
    }

    public double calcularFrete() {
        double frete = 0;

        switch (tamanho) {
            case 'P':
                frete = valorEncomenda * 0.01;
                break;
            case 'M':
                frete = valorEncomenda * 0.03;
                break;
            case 'G':
                frete = valorEncomenda * 0.05;
                break;
        }

        if (distancia <= 50) {
            frete += 3.0;
        } else if (distancia <= 200) {
            frete += 5.0;
        } else {
            frete += 7.0;
        }

        return frete;
    }

    public void emitirEtiqueta() {
        System.out.println("***** ETIQUETA PARA ENVIO *****");
        System.out.println("Endereço do remetente: " + enderecoRemetente);
        System.out.println("Endereço do destinatário: " + enderecoDestinatario);

        String tamanhoEncomenda;
        switch (tamanho) {
            case 'P':
                tamanhoEncomenda = "Pequeno";
                break;
            case 'M':
                tamanhoEncomenda = "Médio";
                break;
            case 'G':
                tamanhoEncomenda = "Grande";
                break;
            default:
                tamanhoEncomenda = "Desconhecido";
                break;
        }
        System.out.println("Tamanho: " + tamanhoEncomenda);

        System.out.println("--------------------------------------------------");
        System.out.println("Valor encomenda: R$ " + valorEncomenda);
        System.out.println("Valor frete: R$ " + calcularFrete());
        System.out.println("--------------------------------------------------");
        System.out.println("Valor total: R$ " + (valorEncomenda + calcularFrete()));
    }
}
