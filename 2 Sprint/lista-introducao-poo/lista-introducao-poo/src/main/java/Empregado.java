public class Empregado {

    String nome;
    String cargo;
    double salario;


    public Empregado(String Nome, String Cargo, double Salario) {
        nome = Nome;
        cargo = Cargo;
        salario = Salario;
    }

    public void reajustarSalario(double percentualReajuste) {
        salario += salario * (percentualReajuste / 100);
    }
    public String Nome() {
        return nome;
    }

    public String Cargo() {
        return cargo;
    }

    public double salario() {
        return salario;
    }
}

