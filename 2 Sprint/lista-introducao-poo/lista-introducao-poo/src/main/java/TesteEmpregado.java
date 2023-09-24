public class TesteEmpregado {
    public static void main(String[] args) {

        Empregado empregado1 = new Empregado("João", "Analista de Sistemas", 5400.00);


        empregado1.reajustarSalario(15);


        System.out.println("Nome: " + empregado1.Nome());
        System.out.println("Cargo: " + empregado1.Cargo());
        System.out.println("Salário reajustado: R$" + empregado1.salario());


        Empregado empregado2 = new Empregado("Maria", "Gerente de Vendas", 7000.00);


        empregado2.reajustarSalario(10);


        System.out.println("\nNome: " + empregado2.Nome());
        System.out.println("Cargo: " + empregado2.Cargo());
        System.out.println("Salário reajustado: R$" + empregado2.salario());
    }
}

