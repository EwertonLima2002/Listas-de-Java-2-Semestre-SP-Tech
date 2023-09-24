import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioNumeros {
    public static void main(String[] args) {
        Integer numeroDigitado = 0;
        List<Integer> listaNumeros = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        Integer soma = 0;
        Integer menor;
        Integer maior;

        do {
            System.out.println("Digite números inteiros");
            numeroDigitado = leitor.nextInt();

            listaNumeros.add(numeroDigitado);

            menor = listaNumeros.get(0);
            maior = listaNumeros.get(0);

            for (int i = 0; i < listaNumeros.size(); i++) {
                soma += listaNumeros.get(i);

                if (listaNumeros.get(i) < menor) {
                    menor = listaNumeros.get(i);
                }
                else if (listaNumeros.get(i) > maior) {
                    maior = listaNumeros.get(i);
                }
                if (listaNumeros.get(i) % 2 == 0) {
                    System.out.println("Números pares " + listaNumeros.get(i));
                }
                else if (listaNumeros.get(i) % 2 == 1) {
                    System.out.println("Números ímpares " + listaNumeros.get(i));
                }
            }
        } while (numeroDigitado != 0);

        String mensagem = """
        A soma de valores da lista é de %s,
        o menor valor da lista é %s,
        o maior valor da lista é %s.
        """.formatted(soma, menor, maior);

        System.out.println(mensagem);

        leitor.close();
    }
}