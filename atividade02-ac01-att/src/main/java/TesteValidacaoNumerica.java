import java.util.Scanner;

public class TesteValidacaoNumerica {
    public static void main(String[] args) {
        verificarPrimo numeros_primos = new verificarPrimo();
        Scanner leitor = new Scanner(System.in);
        Integer numeros_digitados = 0;
        do{
            System.out.println("Digite um número inteiro positivo para verificar se ele é primo:");
            numeros_digitados = leitor.nextInt();
            if(numeros_digitados < 0){
                System.out.println("Numero Inválido");
                break;
            }
            else {

                String resultado = numeros_primos.verificar_se_o_numero_e_primo(numeros_digitados);
                System.out.println(resultado);
            }
        }while(numeros_digitados >=0);

    }
}
