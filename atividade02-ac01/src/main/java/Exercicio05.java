public class Exercicio05 {

    Double calculo_salario(Double salario) {
        return salario / 1045;
    }

    String classe_social(Double salario) {
        calculo_salario(salario);
        String classe;

        if (salario < 2090.0) {
            classe = "E";
        } else if (salario >= 2090.01 && salario <= 4180.0) {
            classe = "D";
        } else if (salario >= 4180.01 && salario <= 10450.0) {
            classe = "C";
        } else if (salario >= 10450.01 && salario <= 20900.0) {
            classe = "B";
        } else {
            classe = "A";
        }
     return classe;
    }

}