import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer opcao;


        do{
            System.out.println("""
                    Escolha um opção
                    1-) Somar 
                    2-) Subtrair
                    3-) Exibir Histórico
                    4-) Sair
                    """);
           opcao = leitor.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Fazendo a opção 1");
                    System.out.println("Ola");
                }
                case 2 -> System.out.println("Fazendo a opção 2");
                case 3 -> System.out.println("Fazemdp a opção 3");
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Opção Inválida");
            }
        }while (opcao != 0);
    }
}
