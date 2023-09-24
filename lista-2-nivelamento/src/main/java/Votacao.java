import java.util.concurrent.ThreadLocalRandom;

public class Votacao {
    public static void main(String[] args) {


        Integer sorteio = 0;
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatro_queijos = 0;

        for (int i = 1; i <= 10; i++) {
            sorteio = ThreadLocalRandom.current().nextInt(1, 4);
            if(sorteio == 1){
                mussarela+= 1;
            }
            else if(sorteio == 2){
             calabresa += 1;
            }
            else if(sorteio == 3){
            quatro_queijos += 1;
            }


        }



        System.out.println("Quantidade de votos de mussarela " +  mussarela);
        System.out.println("Quantidade de votos de calabresa " + calabresa);
        System.out.println("Quantidade de votos de quatro queijos " + quatro_queijos);

        if(mussarela >calabresa && mussarela > quatro_queijos){
            System.out.println("Mussarela obteve mais votos");
        }
        else if(calabresa > mussarela && calabresa > quatro_queijos){
            System.out.println("Calabresa obteve maior quantidade de votos");
        }
        else{
            System.out.println("Quatro queijos obteve maior quantidade de votos");
        }
    }
}
