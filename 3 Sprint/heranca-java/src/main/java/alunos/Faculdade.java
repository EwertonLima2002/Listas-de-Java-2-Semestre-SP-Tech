package alunos;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;

    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void matricular(Aluno aluno){
        alunos.add(aluno);
    }

    public void exibir_alunos(){
        for (Aluno alunodavez : alunos) {
            System.out.println(alunodavez);
        }
    }

    public void exibirSomenteAlunosPos(){
        for (Aluno alunodavez : alunos) {
            if (alunodavez instanceof AlunoPosGraducao) {
                System.out.println(alunodavez);
            }
        }
    }
}
