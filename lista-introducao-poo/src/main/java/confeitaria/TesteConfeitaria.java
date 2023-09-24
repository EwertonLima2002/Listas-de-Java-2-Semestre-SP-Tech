package confeitaria;

import confeitaria.Confeitaria;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteConfeitaria {
    public static void main(String[] args) {
        Confeitaria conf = new Confeitaria("Chocolate" , 50.0);
        Scanner leitor = new Scanner(System.in);


        conf.setSabor("Chocolate");

        Integer qtd_vezes_digitados = 0;
        String sabor = "";
        Integer qtd = 0;
        Map<String, Integer> saboresQuantidade = new HashMap<>();


        do {
            System.out.println("""
                    Vamos comprar bolo
                    Me diga qual sabor você quer?
                    """);
           sabor = leitor.nextLine();


            conf.setSabor(sabor);

            System.out.println(
                    String.format("""
                            Agora me diz quantos bolos de %s vc quer?
                            """, conf.getSabor()));
        qtd  = leitor.nextInt();
            leitor.nextLine();

            conf.comprar_bolo(sabor, qtd);
            qtd_vezes_digitados ++;
        }while (qtd_vezes_digitados < 5);





    }
}
