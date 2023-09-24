import java.util.Scanner;

public class TesteCalculoNutricao {
    public static void main(String[] args) {
        Exercicio05 calculo_imc = new Exercicio05();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        Double altura = leitor.nextDouble();
        System.out.println("Digite seu peso:");
        Double peso = leitor.nextDouble();

       String resultado = calculo_imc.calcular_imc(altura , peso);

        System.out.println(resultado);
    }
}
