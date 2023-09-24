import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {

        Integer numero_aleatorio;
        Integer acumulador = 0;
        do{
            numero_aleatorio= ThreadLocalRandom.current().nextInt(0 , 11);
            acumulador+=numero_aleatorio;
            System.out.println(numero_aleatorio);
        } while(!numero_aleatorio.equals(0));

        System.out.println("A soma dos números é " + acumulador);
    }
}