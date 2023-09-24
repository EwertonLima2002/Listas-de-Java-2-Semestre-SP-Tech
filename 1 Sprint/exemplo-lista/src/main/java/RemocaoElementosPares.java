import java.util.ArrayList;
import java.util.List;

public class RemocaoElementosPares {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList();

        valores.add(12);
        valores.add(15);
        valores.add(1);
        valores.add(52);
        valores.add(92);
        valores.add(22);
        valores.add(102);
        valores.add(47);

        for(int i =0; i< valores.size();i++){
            if(valores.get(i) % 2 == 0){
                valores.remove(i);
                i--;
            }
        }
        System.out.println(valores);
    }
}
