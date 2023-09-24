package colaborador;

import colaborador.Colaborador;
import colaborador.RecursosHumanos;

public class TesteColaborador {
    public static void main(String[] args) {
        Colaborador colaborador01 = new Colaborador("Ewerton", "Estagiário Desenvolvimento Salesforce", 500.00);
        Colaborador colaborador02 = new Colaborador("Lucas Arantes", "Desenvolvedor Pleno", 7050.00);

        RecursosHumanos recursosHumanos = new RecursosHumanos();



        colaborador01.exibir_relatorio();
        colaborador02.exibir_relatorio();


        recursosHumanos.promoverColaborador(colaborador02, "Desenvolvedor Senior", 12000.00);
        recursosHumanos.promoverColaborador(colaborador01 , "Desenvolvedor Júnior" , 100.00);

        recursosHumanos.reajustarSalario(colaborador01 , 500.00);

        colaborador01.exibir_relatorio();
        colaborador02.exibir_relatorio();

        recursosHumanos.exibirTotalPromovidos();
        recursosHumanos.exibirTotalReajustados();


    }
}