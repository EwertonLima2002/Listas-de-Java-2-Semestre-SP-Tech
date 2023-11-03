package alunos;

import alunos.Aluno;
import alunos.AlunoPosGraducao;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("01231049" , "Ewerton Lima" , 9.33 , 10.0);


        System.out.println("Nota final do aluno " + aluno01.calcularNotaFinal());

        AlunoPosGraducao aluno02 = new AlunoPosGraducao("01231049" , "José" , 3.0 , 2.0 , 4.0);

        System.out.println("Nota final do aluno de pós " + aluno02.calcularNotaFinal());


        System.out.println("Exibindo os Alunos");
        System.out.println(aluno01);
        System.out.println(aluno02);

        Faculdade faculdade01 = new Faculdade("SPTech");

        faculdade01.matricular(aluno01);
        faculdade01.matricular(aluno02);

        System.out.println("Exibindo os Alunos da Faculdade");
        faculdade01.exibir_alunos();

        System.out.println("Alunos de Pós");
        faculdade01.exibirSomenteAlunosPos();
    }
}
