package empresa;

public class Empregado {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Empresa empregado01 = new Empresa();

        empresa.nome = "João";
        empresa.salario = 5400.00;
        empresa.cargo = "Analista de Sistemas";

        empregado01.nome = "Ewerton";
        empregado01.salario = 2050.00;
        empregado01.cargo = "Estágiario de desenvolvimento salesforce";

       Double reajuste = empresa.reajustarSalario(empresa.salario, 15);

        System.out.println(
                String.format("O funcionário %s tem o salário de R$%.2f e o cargo de %s,\n" +
                        "já o funcionário %s tem o salario de R$%.2f é o cargo atual é de %s\n" ,
                        empresa.nome , empresa.salario , empresa.cargo , empregado01.nome,
                empregado01.salario , empregado01.cargo)
        );
    }
}
