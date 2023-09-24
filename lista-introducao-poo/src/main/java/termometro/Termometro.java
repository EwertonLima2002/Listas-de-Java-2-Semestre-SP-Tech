package termometro;

public class Termometro {

    Double temperaturaAtual = 0.0;

    Double temperaturaMax = 0.0;

    Double temperaturaMin = 0.0;

    void aumentar_temperatura(Double qtd_graus , Double qtd_maxima , Double qtd_minimo){

        temperaturaMax = qtd_maxima;
        temperaturaMin = qtd_minimo;
        temperaturaAtual =  temperaturaMin + qtd_graus;

        if(temperaturaAtual > temperaturaMax){
           temperaturaAtual = temperaturaMax;
            System.out.println("A temperatura atual é de " +  temperaturaAtual +
                    "\npois a temperatura atual excedeu a máxima");
        }
        else{
            System.out.println("A temperatura atual é de " +  temperaturaAtual);
        }
           exibeFahreinheit();
    }

    void diminuiTemperatura(Double qtd_diminuir , Double qtd_maxima , Double qtd_minimo){
        temperaturaMax = qtd_maxima;
        temperaturaMin = qtd_minimo;
        temperaturaAtual =  temperaturaMax - qtd_diminuir;

        if(temperaturaAtual < temperaturaMin){
            temperaturaAtual = temperaturaMin;
            System.out.println("A temperatura atual é de " +  temperaturaAtual +
                    "\npois a temperatura atual excedeu a mínima");
        }
        else{
            System.out.println("A temperatura atual é de " +  temperaturaAtual);
        }
       exibeFahreinheit();
    }

    void exibeFahreinheit(){
        Double temperaturaFahrenheit = temperaturaAtual * 1.8 + 32;

        System.out.println("A temperatura em Fahrenheit é de " + temperaturaFahrenheit);
    }
}
