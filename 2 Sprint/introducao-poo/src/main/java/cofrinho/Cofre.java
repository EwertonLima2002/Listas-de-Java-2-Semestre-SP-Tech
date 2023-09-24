package cofrinho;

public class Cofre {

    Double valor_cofre;
    Boolean quebrar_cofre;

    Double balacar_cofrinho;

    void guardar_cofre(Double valor_a_guardar){


        if(quebrar_cofre == true){
            System.out.println("Não é possivel depositar no cofrinho , pois ele está quebrado");
        }
        else {
            valor_cofre += valor_a_guardar;

            System.out.println(
                    String.format("""
                        Valor atual do cofrinha: %.2f
                        """, valor_cofre)
            );
        }
        }

        void fazer_quebra_cofre(String sim_ou_nao){


        if(sim_ou_nao == "Sim"){
            quebrar_cofre = true;
        }
        else{
            quebrar_cofre = false;
        }
        }
        void fazer_quebrar_cofre(){

        if(quebrar_cofre == true){
            System.out.println("Não é possível agitar o cofre");
        }
        else{
            for(int i = 0; i <=4; i++){
                System.out.println("Balançando o cofriho");
            }
            System.out.println("Valor total do cofre " + valor_cofre);
        }
        }

    }




