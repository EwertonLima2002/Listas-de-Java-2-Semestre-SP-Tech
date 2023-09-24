package encomenda;

public class Encomenda {
    String tamanho;

    String enderecoRementente;

    String enderecoDestinatario;

    Double distancia = 0.0;

    Double valorEncomenda;


    void calcular_distancia(Double distanciaEncomenda) {
        if (distanciaEncomenda <= 50) {
            distancia += 3.00;
        } else if (distanciaEncomenda >= 51 && distanciaEncomenda <= 200) {
            distancia += 5.00;
        } else {
            distancia += 7.00;
        }
    }

    void calcularFrete(String enderecoRemententeU, String enderecoDestinatarioU,
            String tamanhoEncomenda , Double valorEncomenda){
        enderecoRementente = enderecoRemententeU;
        enderecoDestinatario = enderecoDestinatarioU;
        Double valor_total;
Double valor_frete;
        if(tamanhoEncomenda.equals("P") || tamanhoEncomenda.equals("p")){
            tamanho = "Pequeno";
            valor_frete = (valorEncomenda * 0.1 + distancia);
            valor_total = valorEncomenda + (valorEncomenda * 0.1 + distancia);
            System.out.println(valorEncomenda);
        }
        else if(tamanhoEncomenda.equals("M") || tamanhoEncomenda.equals("m")){
            tamanho = "Médio";
            valor_frete = (valorEncomenda * 0.3 + distancia);
            valor_total = valorEncomenda + (valorEncomenda * 0.3 + distancia);
            System.out.println(valorEncomenda);
        }
        else{
            tamanho = "Grande";
            valor_frete = (valorEncomenda * 0.7) + distancia;
            valor_total = valorEncomenda + (valorEncomenda * 0.5 + distancia);

        }
        System.out.println(
                String.format(
                        "***** ETIQUETA PARA ENVIO *****\n" +
                                "Endereço do remetente: %s\n" +
                                "Endereço do destinatário: %s\n" +
                                "Tamanho: %s" +
                                "--------------------------------------------------\n" +
                                "Valor encomenda: R$ %.2f\n" +
                                "Valor frete: R$ %.2f\n" +
                                "--------------------------------------------------\n" +
                                "Valor total: R$ %.2f\n",
               enderecoRementente , enderecoDestinatario ,
                        tamanho, valorEncomenda , valor_frete, valor_total)
        );

    }


}


