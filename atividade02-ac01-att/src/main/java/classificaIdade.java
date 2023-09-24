import java.util.Scanner;

public class classificaIdade {
    public static void main(String[] args) {
        Exercicio03 aluno = new Exercicio03();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        Integer idade_usuario = leitor.nextInt();

        String mensagem = """
                A sua faixa etária é de %s
                """.formatted(aluno.idade(idade_usuario));

        System.out.println(mensagem);

    }
}
