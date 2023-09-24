import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String simbolo = "";
        Integer opcao = 1;

        System.out.println("Tabuada");
        do {
            System.out.println("  Digite o número correspondente a operação desejada:\n" +
                    "1 - Soma\n" +
                    "2 - Multiplicação\n" +
                    "3 - Divisão\n" +
                    "4 - Subtração\n" +
                    "0 - Sair\n" +
                    "");
            opcao = teclado.nextInt();
        }
        while(opcao > 4 || opcao < 0);

        if(opcao >=0 && opcao <=4) {

            if(opcao.equals(0)){
                System.out.println("Saindo... :(");
            }
            else{
            System.out.println("Digite um número inteiro:");
            Integer valor_escolhido = teclado.nextInt();
            Integer total = 0;



            for (int i = 0; i <= 10; i++) {
                if (opcao.equals(1)) {
                    total = valor_escolhido + i;
                    simbolo = "+";
                } else if (opcao.equals(2)) {
                    total = valor_escolhido * i;
                    simbolo = "*";
                } else if (opcao.equals(3)) {
                    if (i != 0) {
                        total = valor_escolhido / i;
                        simbolo = "/";
                    } else {
                        System.out.println("Resto 0");
                    }
                } else if (opcao.equals(4)) {
                    total = valor_escolhido - i;
                    simbolo = "-";
                }


                String mensagem = """
                        %d %s %s = %s
                                            
                        """.formatted(valor_escolhido, simbolo, i, total);
                System.out.println(mensagem);
            }
            }

            teclado.close();
        }
    }
}