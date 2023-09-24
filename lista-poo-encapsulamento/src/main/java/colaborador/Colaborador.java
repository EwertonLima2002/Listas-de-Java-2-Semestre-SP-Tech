package colaborador;

public class Colaborador {

    private String nome;

    private String cargo;

    private Double salario;

    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    void exibir_relatorio(){
        System.out.println(
                String.format("Colabodor\n " +
                        "\nNome: %s\n" +
                        "\nCargo: %s\n" +
                        "\nSalário %.2f\n" , getNome() , getCargo() , getSalario())
        );
    }
}
