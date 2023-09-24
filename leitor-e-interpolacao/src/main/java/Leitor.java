import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome por favor ");
        String nome = leitor.nextLine();
        System.out.println("Seu nome " + nome);

        System.out.println("Digite sua idade por favor ");
        Integer idade = leitor.nextInt();
        System.out.println("Sua idade " + idade);

        System.out.println("Digite sua altura por favor ");
        Double altura = leitor.nextDouble();
        System.out.println("Sua altura " + altura);

        System.out.println("Você é aluno ?");
        Boolean aluno = leitor.nextBoolean();
        System.out.println("É aluno ? " + aluno);

    }
}
