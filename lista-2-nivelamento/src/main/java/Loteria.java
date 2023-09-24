import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        Integer numero_escolhido = 5;
        Integer numero_aleatorio;
        Integer qtd_vezes = 0;
        do{

            qtd_vezes = qtd_vezes + 1;
            numero_aleatorio= ThreadLocalRandom.current().nextInt(0 , 11);
            System.out.println(numero_aleatorio);


        }while(!(numero_escolhido.equals(numero_aleatorio)));

        if(qtd_vezes <= 3){
            System.out.println("Você é MUITO sortudo");
        }
        else if(qtd_vezes >=4 && qtd_vezes <=10){
            System.out.println( "Você é sortudo");
        }
        else{
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}
