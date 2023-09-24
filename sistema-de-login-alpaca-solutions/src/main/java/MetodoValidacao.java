import java.util.ArrayList;
import java.util.List;

public class MetodoValidacao {
    String validar_sistema(String email , Integer senha){
        String validacao = "";

        List<String> email_usuario = new ArrayList();
        List<Integer> senha_usuario = new ArrayList();

        email_usuario.add("joão@admin.com");
        email_usuario.add("anabeatriz@admin.com");
        email_usuario.add("lucas@gmail.com");
        email_usuario.add("gabriele@outlook.com");
        senha_usuario.add(460820);
        senha_usuario.add(38816638);
        senha_usuario.add(182897366);
        senha_usuario.add(387278372);




        int i = 0;
        while(i < email_usuario.size()){
            if(email_usuario.get(i).equals(email) && senha_usuario.get(i).equals(senha)){
                validacao = "credenciais validas, seja bem vindo ao sistema de monitoramento alpaca solutions";
                break;
            }
            else{
                validacao = "email/senha incorretas";
            }
            i++;


        }

        return validacao;

    }
}