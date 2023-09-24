public class Exercicio04 {
    Double calcularDesconto(Integer valor_produto , Integer qtd_produto){
   ;
   Integer valor_total;
   Double desconto_variavel;
   Double total_com_desconto = 0.0;

     if(qtd_produto.equals(1)){
         desconto_variavel = 0.90;
         valor_total = (valor_produto * qtd_produto);
         double valor_total_variavel = (double) valor_total;
         total_com_desconto = valor_total_variavel * desconto_variavel;
     }
     else if(qtd_produto.equals(2)){
         desconto_variavel = 0.80;
         valor_total = (valor_produto * qtd_produto);
         double valor_total_variavel = (double) valor_total;
         total_com_desconto = valor_total_variavel * desconto_variavel;
     }
     else{
         desconto_variavel = 0.70;
         valor_total = (valor_produto * qtd_produto);
         double valor_total_variavel = (double) valor_total;
         total_com_desconto = valor_total_variavel * desconto_variavel;
     }

     return total_com_desconto;
    }

    Double exibirNotaFiscal(Integer valor_produto, Integer qtd_produto) {

        calcularDesconto(valor_produto , qtd_produto);


        System.out.println("----------------------------------------------------");
        System.out.println("Valor do produto: R$" + valor_produto);
        System.out.println("Quantidade: " + qtd_produto);
        System.out.println("----------------------------------------------------");
        System.out.println("Valor com desconto: R$" + calcularDesconto(valor_produto , qtd_produto));
        return calcularDesconto(valor_produto , qtd_produto);
    }
    void exibir_mensagem_boas_vindas(){
        System.out.println("Bem vindo ao sistema de desconto progressivo!");
        System.out.print("");
    }
}
