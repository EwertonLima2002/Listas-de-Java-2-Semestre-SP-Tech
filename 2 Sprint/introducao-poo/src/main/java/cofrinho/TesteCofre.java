package cofrinho;

import java.util.Scanner;

public class TesteCofre {
    public static void main(String[] args) {
        Cofre cofre_usuario = new Cofre();
        Scanner leitor = new Scanner(System.in);
        Integer opcao = 0;
        cofre_usuario.valor_cofre = 0.0;

        System.out.println("""
                Ola Temos Três opções diposníveis
                1-) Depositar Cofre
                2-) Quebrar Cofre
                3-) Balançar Cofre
                """);
        opcao = leitor.nextInt();

        switch (opcao){
            case 1:{
                System.out.println("Insira o valor a guardar");
                Double valor = leitor.nextDouble();
                cofre_usuario.guardar_cofre(valor);

            }
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + opcao);
        }

    }
}
