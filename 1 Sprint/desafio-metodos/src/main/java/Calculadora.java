import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        MetodosCalculadora calc = new MetodosCalculadora();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        Integer numero01 = leitor.nextInt();

        System.out.println("Digite o segundo número");
        Integer numero02 = leitor.nextInt();


        Integer resultado_soma = calc.somar(numero01 , numero02);
        Integer resultado_subtracao = calc.subtrair(numero01 , numero02);
        Integer resultado_divisao = calc.dividir(numero01 , numero02);
        Integer resultado_multiplicacao = calc.multiplicacao(numero01 , numero02);

        String mensagem = """
                O resultado da soma é de %d,
                O resultado da subtração é de
                 %d,
                O resultado da divisão é de %d,
                O resultado da multiplicação é de %d,
                """.formatted(resultado_soma , resultado_subtracao , resultado_divisao , resultado_multiplicacao);

        System.out.println(mensagem);

        leitor.close();
    }
}
