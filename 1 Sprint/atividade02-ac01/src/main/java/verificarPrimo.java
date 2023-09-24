public class verificarPrimo {


    Integer verificar_se_o_numero_e_primo(Integer numero) {

        if(numero == 1){
            return 0;
        }
        if(numero < 0){
            return 0;
        }
        for(int i = 2; i < numero ; i++){
            if(numero % i == 0){
                return 0;
            }
        }
        return 1;
//        String primo_ou_nao = "";
//        int i;
//
//        for (i = 2; i * i <= numero; i++) {
//
////            if(numero % i == 0){
////                primo_ou_nao = "falso";
////            }
////        }
////
////        if (numero == 1) {
////            primo_ou_nao = "falso";
////        }
////
////        if (primo_ou_nao == "") {
////            primo_ou_nao = "Verdadeiro";
////        }
//
//        return primo_ou_nao;
    }

}