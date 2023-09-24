import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        // Não é uma simples variavel e sim um objetos e criamos os objetos com new

        List lista_estranha = new ArrayList();

        lista_estranha.add("Xampson");
        lista_estranha.add(21);
        lista_estranha.add(true);
        lista_estranha.add(21.1);

        System.out.println(lista_estranha);

        // lista definindo o tipo

        List<String> nomes = new ArrayList();


        nomes.add("Ewerton");
        nomes.add("Maria");
        nomes.add("Lucas");
        nomes.add("Eduardo");

        System.out.println(nomes);

        String segundo_nome = nomes.get(1);

        System.out.println("O segundo nome é " + segundo_nome);

        //
        for (int i=0; i< nomes.size();i++) {

            System.out.println(i + "-" +  nomes.get(i));
        }

        // removendo o item da lista

        nomes.remove(2);

        String remover_nome = "Eduardo";

        for(int i = 0; i< nomes.size();i++){
            if(nomes.get(i).equals(remover_nome)){
                nomes.remove(i);
            }


        }
        System.out.println("Nomes após a remoção " + nomes);

        // limpa a lista toda
        nomes.clear();
        nomes.set(1 , "Lulu");
        nomes.add(0 , "Paçoca");
    }
}
