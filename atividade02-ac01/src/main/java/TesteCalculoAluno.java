import java.util.Scanner;

public class TesteCalculoAluno {
    public static void main(String[] args) {
        Exercicio02 calculo_nota = new Exercicio02();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua primeira nota:");
        Double primeira_nota = leitor.nextDouble();
        System.out.println("Digite sua segunda nota:");
        Double segunda_nota = leitor.nextDouble();

       Double total = calculo_nota.somar_notas(primeira_nota , segunda_nota);

        String mensagem = """
                A nota total que você teve foi de %s
                """.formatted(total);

        System.out.println(mensagem);

    }
}
