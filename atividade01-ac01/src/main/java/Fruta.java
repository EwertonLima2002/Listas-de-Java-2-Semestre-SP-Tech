import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Fruta {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String fruta_digitada;

        List<String> lista_frutas = new ArrayList<>();
        lista_frutas.add("banana");
        lista_frutas.add("maca");
        lista_frutas.add("tangerina");
        lista_frutas.add("manga");
        lista_frutas.add("uva");
        lista_frutas.add("laranja");


        System.out.print("Digite o nome da fruta para verificar se existe na nossa lista:");
        fruta_digitada = teclado.nextLine();

        boolean frutaEncontrada = false;

        for (int i = 0; i < lista_frutas.size(); i++) {
            if (fruta_digitada.equals(lista_frutas.get(i))) {
                frutaEncontrada = true;
                break;
            }
        }

        if (frutaEncontrada) {
            String mensagem = """
            A fruta %s existe em nossa lista
            """.formatted(fruta_digitada);
            System.out.println(mensagem);
        }
        else{
            String mensagemErro = """
            A fruta %s não existe em nossa lista
            """.formatted(fruta_digitada);
            System.out.println(mensagemErro);
        }

        teclado.close();
    }
}