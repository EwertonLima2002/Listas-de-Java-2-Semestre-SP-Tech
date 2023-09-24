public class MetotoSimulador {

    String texto_bem_vindo(){
       String mensagem = "--------------------------------------------------" +
                           "\nSpTech      Investimentos\n" +
                          "--------------------------------------------------" +
                "\n Olá o que deseja fazer " +

"\n--------------------------------------------------" +
               "\n1- Depositar" +
               "\n2- Sacar" +
               "\n3- Simular rendimentos" +
               "\n0 - Sair" ;

        return mensagem;
    }

    String mensagem_saque(){
        String mensagem_valor = "Digite o valor do déposito";

        return mensagem_valor;
    }
}
