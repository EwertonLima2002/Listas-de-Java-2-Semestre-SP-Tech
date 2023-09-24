package colaborador;

import colaborador.Colaborador;

public class RecursosHumanos {

    private Integer totalPromovidos;
    private Integer totalSalariosReajustados;

    public RecursosHumanos() {
        this.totalPromovidos = 0;
        this.totalSalariosReajustados = 0;
    }

    public void reajustarSalario(Colaborador colaborador, Double valorReajuste) {
        Double salario_reajustado = colaborador.getSalario() + valorReajuste;
        colaborador.setSalario(salario_reajustado);
        totalSalariosReajustados++;
    }

    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario) {
        Double salario_atual = colaborador.getSalario();

        if (novoSalario <= salario_atual) {
            System.out.println("Operação Inválida");
        } else {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            totalSalariosReajustados++;
            totalPromovidos++;
        }
    }
    public void exibirTotalPromovidos() {
        System.out.println(String.format("Total promovidos: %d", totalPromovidos));
    }

    public void exibirTotalReajustados() {
        System.out.println(String.format("Total Reajustados: %d", totalSalariosReajustados));
    }
    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public void setTotalPromovidos(Integer totalPromovidos) {
        this.totalPromovidos = totalPromovidos;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

    public void setTotalSalariosReajustados(Integer totalSalariosReajustados) {
        this.totalSalariosReajustados = totalSalariosReajustados;
    }


}
