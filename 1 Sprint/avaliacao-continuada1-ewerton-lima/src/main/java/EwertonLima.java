import java.util.Scanner;

public class EwertonLima {
    public static void main(String[] args) {
      MetodoCafeteria metodos_cafeteria = new MetodoCafeteria();
        Scanner leitor = new Scanner(System.in);
        metodos_cafeteria.texto();
        Integer opcao;
        Integer total_pontos = 0;
        Integer total = 0;
        Integer qtd_cafes = 0;
        Integer total_por_cafe = 0;


        do{
         metodos_cafeteria.opcao();
         opcao = leitor.nextInt();

         switch (opcao){
             case 1:

                 System.out.println("Quantos pontos deseja registar:");
                 total_pontos = leitor.nextInt();

                 if(total_pontos < 0){
                     System.out.println("Valor Inválido");
                 }
                 else {
                     total += total_pontos;
                     System.out.println("Recarga efetuada! Quantidade atual de pontos: " + total);
                     break;
                 }
             case 2:
                 System.out.println("Informe a quantidade de cafés desejada:");
                 qtd_cafes = leitor.nextInt();
                 if(qtd_cafes > 0 && qtd_cafes * 10 <= total){
                     total -= qtd_cafes * 10;
                     System.out.println("""
                             Preparando café! Saldo atual de pontos : %s
                             """.formatted(total));
                 }
                 else if(qtd_cafes < 0){
                     System.out.println("Valor Inválido, utilize valores maior que 0");
                 }
                 else{
                     System.out.println("""
                             Pontos Insuficientes para comprar %s cafés
                             Pontos necessários: %s
                             Saldo atual de pontos: %s
                             
                             """.formatted(qtd_cafes ,qtd_cafes * 10, total ));
                 }


              break;
             case 3:
                 System.out.println("Informe a quantidade mensal de pontos: ");
                 Integer pontos_mensal = leitor.nextInt();
                 System.out.println("por quantos meses deseja realizar essa recarga?");
                 Integer meses_pontos = leitor.nextInt();
                 Integer total_simulado = (pontos_mensal);
                 Integer total_simulado_de_cafe;
                 Integer cafes_simulados = 0;
                 System.out.println("Saldo atual de pontos " + total);

                 if(pontos_mensal <0 || meses_pontos <0){
                     System.out.println("Valor inválido, aceito apenas valores ou meses maiores que 0");
                 }
                 else {
                     for (int i = 1; i <= meses_pontos; i++) {

                       cafes_simulados = total_simulado_de_cafe = (total_simulado * i) + total;
                         System.out.println("""
                                 *---------------------------------*
                                 saldo no %sº Mês = %s
                                 *---------------------------------*
                                 """.formatted(i, cafes_simulados));
                     }
                     System.out.println("com esse saldo você consegue tomar " + cafes_simulados / 10 + " cafés");
                 }
             default:
                 System.out.println("");
                 break;

         }
        } while(!opcao.equals(4));
    }
}
