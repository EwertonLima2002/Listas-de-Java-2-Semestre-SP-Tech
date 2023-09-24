package empresa;

public class Empresa {

    String nome;

    String cargo;

    Double salario;


    Double reajustarSalario(Double salario_usuario ,Integer porcentagemReajuste){
        salario = salario_usuario;
        return salario + (salario * Double.valueOf(porcentagemReajuste) / 100);
    }
}
