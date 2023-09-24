import java.util.Scanner;

public class Interpolacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome por favor ");
        String nome = leitor.nextLine();


        System.out.println("Digite sua idade por favor ");
        Integer idade = leitor.nextInt();


        System.out.println("Digite sua altura por favor ");
        Double altura = leitor.nextDouble();


        System.out.println("Você é aluno ?");
        Boolean aluno = leitor.nextBoolean();

        String textoAluno =  aluno ? "é aluno" : "não é aluno";

        String mensagem = String.format("Seu nome é %s\n você tem %d anos de vida" +
                "\n sua altura é %.2f e voce %b  aluno " , nome, idade , altura , aluno) ;

        String mensagem_nova = """
                Seu nome é %s,
                você tem %d anos de vida,
                sua altura é %.2f
                e voce %s aluno. 
                """.formatted(nome, idade , altura , textoAluno);
        System.out.println(mensagem);
        System.out.println(mensagem_nova);
    }
}
