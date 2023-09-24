import java.util.Scanner;

public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        Exercicio04 descontos = new Exercicio04();

        Scanner leitor = new Scanner(System.in);

        descontos.exibir_mensagem_boas_vindas();
        System.out.println("Digite o valor unitário do produto:");
        Integer valor_produto = leitor.nextInt();
        System.out.println("Digite a Quantidade:");
        Integer qtd = leitor.nextInt();

       double valor_total = descontos.calcularDesconto(valor_produto , qtd);
        System.out.println(valor_produto);

        System.out.println(valor_total);
        System.out.println(descontos.exibirNotaFiscal(valor_produto , qtd));
    }
}
