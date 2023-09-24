import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        MetodoValidacao validar = new MetodoValidacao();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu email:");
        String email = leitor.nextLine();
        System.out.println("Digite sua senha:");
        Integer senha = leitor.nextInt();

        String validacao = validar.validar_sistema(email , senha);

        System.out.println(validacao);

    }
}
