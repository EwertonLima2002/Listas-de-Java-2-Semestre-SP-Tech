public class Exercicio01 {
 Double calculo_salario(Double salario){
     return salario / 1045.00;
 }
  String classe_social(Double salario) {
     calculo_salario(salario);
      String classe;

     if(salario < 2090.0){
         classe = "E";
     }
     else if(salario >=2090.01 && salario <=4180.00){
         classe = "D";

     }
     else if(salario >=4180.01 && salario <=10450.00){
         classe = "C";

     }
     else if(salario >=10450.01 && salario <=20900.00){
         classe = "B";

     }
     else{
         classe = "A";

     }


      return classe;
  }
}
