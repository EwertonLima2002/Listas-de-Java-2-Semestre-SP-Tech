import java.util.Scanner;

public class TesteClasseSocia {
    public static void main(String[] args) {
        Exercicio01 ex01 = new Exercicio01();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua renda");
        Double salario_user = leitor.nextDouble();

        Double total = ex01.calculo_salario(salario_user);
        String classe_social = ex01.classe_social(salario_user);

       String mensagem = """
               Você recebe aproximadamente %.2f salários-mínimos.
               Você pertence a classe social: %s.
               """.formatted(total , classe_social);


        System.out.println(mensagem);



    }
}
