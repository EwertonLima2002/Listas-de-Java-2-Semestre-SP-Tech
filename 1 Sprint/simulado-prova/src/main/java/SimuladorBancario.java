import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimuladorBancario {
    public static void main(String[] args) {

        MetotoSimulador simulador = new MetotoSimulador();
        Integer opcao = 0;

        Integer qtd_vezes = 0;
        Scanner leitor = new Scanner(System.in);



        Double saldo_bancario = 0.0;


        do{
            qtd_vezes += 1;
            System.out.println("--------------------------------------------------" +
                    "\nSpTech      Investimentos\n" +
                    "--------------------------------------------------" +
                    "\n Olá o que deseja fazer " +

                    "\n--------------------------------------------------" +
                    "\n1- Depositar" +
                    "\n2- Sacar" +
                    "\n3- Simular rendimentos" +
                    "\n0 - Sair" );

            opcao = leitor.nextInt();
         if(opcao == 0){
             System.out.println("Saindo...");
             break;
         }
         else {
             if (opcao.equals(1)){
                 System.out.println("Digite o valor do déposito");
                 Double valor_guardado = leitor.nextDouble();

                 if(valor_guardado > 0){


                     Double valor_somado = 0.0;

                    saldo_bancario += valor_guardado;

                     System.out.println("Depósito realizado  -- Saldo Atual: R$ " + saldo_bancario);
                 }
                 else{
                     System.out.println("Valor inválido");
                 }
             }
             else if(opcao.equals(2)){
                 System.out.println("Digite o valor do saque");
                 Double saque = leitor.nextDouble();
                 Double saldo = 0.0;
                 Double total = 0.0;
                 total = saldo_bancario - saque;
                 if(saque > 0){
                     System.out.println("Saque realizado - Saldo atual " + total);

                 }
                 else{
                     System.out.println("Valor inválido");
                 }
             }
             else{
                 Double total_investimentos = 0.0;
                 Double valor_conta = 0.0;

                 System.out.println(valor_conta);

                 if(valor_conta < 0){
                     System.out.println("Saldo Zerado, opção inválida.");
                 }
                 else {
                     for (int e = 1; e <= 12; e++) {
                         total_investimentos = (saldo_bancario * e) * 1.10;

                         System.out.println("Mês " +  e +" Saldo: " + total_investimentos);
                     }
                 }
             }
         }

        }while (opcao >=0);


    }
}
