package termometro;

import java.util.Scanner;

public class TesteTermometro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Termometro temperatura = new Termometro();

        System.out.println(
                String.format("Vamos brincar com a temperatura" +
                        "\nVamos lá, vamos fazer um range\n" +
                        "digite a temperatura mínima")
        );
        Double minimo = leitor.nextDouble();

        System.out.println("Agora me diz uma tempera máxima");
        Double maximo = leitor.nextDouble();

        System.out.println("Pronto digite a opção que vc quer você quer\n" +
                "1-)Aumentar\n" +
                "2-)Diminuir");
        Integer aumentar_ou_diminuir = leitor.nextInt();

        if(aumentar_ou_diminuir.equals(1)){
            System.out.println("Certo então vc quer aumentar a temperatura, quantos graus?");
            Double qtd_aumento = leitor.nextDouble();
            temperatura.aumentar_temperatura(qtd_aumento , maximo , minimo);
        }
        else{
            System.out.println("Eitaaaaa estou sentindo o inverno chegando blz vc quer diminuir\n" +
                    "é quantos graus vc quer diminuir?");
            Double qtd_diminuir = leitor.nextDouble();

            temperatura.diminuiTemperatura(qtd_diminuir , maximo , minimo);
            temperatura.exibeFahreinheit();
        }



    }
}
