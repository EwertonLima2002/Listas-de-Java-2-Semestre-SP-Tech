import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Integer numero_sorteado = 2;
        Integer numero_aleatorio;
        Integer qtd_pares = 0;
        Integer qtd_impares = 0;
        Integer posicao = 0;

        for(int i = 1; i<=200;i++){
            numero_aleatorio= ThreadLocalRandom.current().nextInt(1 , 101);

            if(numero_aleatorio % 2 == 0){
                qtd_pares = qtd_pares + 1;
            }
            if(numero_sorteado.equals(numero_aleatorio)){
                posicao = i;
            }
            else if(numero_aleatorio % 2 == 1){
                qtd_impares = qtd_impares + 1;
            }

            System.out.println(numero_aleatorio);

        }
        System.out.println("Quantidade de Números Ímpares:" + qtd_impares);
        System.out.println("Quantidade de Números Pares:" + qtd_pares);
        System.out.println("A Primeira Posição do Número Sorteado:" + posicao);
    }
}
