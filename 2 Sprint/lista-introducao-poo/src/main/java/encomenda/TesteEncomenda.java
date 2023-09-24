package encomenda;

import java.util.Scanner;

public class TesteEncomenda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Encomenda fretes = new Encomenda();
        System.out.println(
                String.format("---------------------------" +
                        "Frete Irmão Unidos" +
                        "----------------------------")
        );
        System.out.println("Vou precisar de algumas informações OK?");
        System.out.println("Me diz o nome do endereco do rementente");
        String enderecoRemetente = leitor.nextLine();
        System.out.println("Agora me diz o nome do endereco do destinatário");
        String enderecoDestinatario = leitor.nextLine();
        System.out.println("Digite o Tamanho da sua encomenda(P , M ou G ):");
        String tamanho = leitor.nextLine();
        System.out.println("Agora me diz o valor da sua encomenda");
        Double valor_encomenda = leitor.nextDouble();
        System.out.println("e pra finalizar me diz a distancia da sua encomenda(em km OK?)");
        Double distancia = leitor.nextDouble();

        fretes.calcular_distancia(distancia);
        fretes.calcularFrete(enderecoRemetente, enderecoDestinatario ,tamanho , valor_encomenda);
    }
}
