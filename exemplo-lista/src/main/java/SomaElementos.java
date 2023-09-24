import java.util.ArrayList;
import java.util.List;

public class SomaElementos {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList();

        valores.add(12);
        valores.add(15);
        valores.add(22);
        valores.add(52);
        valores.add(92);
        valores.add(12);
        valores.add(102);
        valores.add(12);

        Integer soma = 0;

        for(int i = 0; i<valores.size();i++){
            soma+= valores.get(i);
        }
        System.out.println(soma);
    }
}
