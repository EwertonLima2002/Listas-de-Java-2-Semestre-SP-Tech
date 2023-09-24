import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Calculadora de média");
        System.out.println("Vamos Lá");
        System.out.println("Digite a primeira nota:");
        Double nota_1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota:");
        Double nota_2 = teclado.nextDouble();
        Double media = ((nota_1 * 0.4) + (nota_2 * 0.6));

        String mensagem = """
               Olá meu amigo,
               a sua média foi de %s,
               fico muito feliz por ter usado meu programa
                """.formatted(media);

        System.out.println(mensagem);

        teclado.close();
    }
}
