package com.bandtec.projeto.lista.desafio3;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;



    public Faculdade(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    /*
            Deve verificar se existe um aluno com o nome informado, caso não exista,
            retorne false;
        */
    public Boolean existsAlunoPorNome(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome(). equals(nome)) {
                return true;
            }
        }

        return false;
    }


    /*
        Deve matricular um aluno na faculdade (inserir na lista), se a lista já
        possuir um aluno com o nome informado, não deve matricular;
    */
    public void matricularAluno(Aluno aluno) {
        boolean alunoJaMatriculado = false;

        for (Aluno alunoExistente : alunos) {
            if (alunoExistente.equals(aluno)) {
                alunoJaMatriculado = true;
                break;
            }
        }
        if (!alunoJaMatriculado) {
            alunos.add(aluno);
        }

    }



    /*
        Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não existir
        um aluno com o RA informado, não faça nada.
    */
    public void cancelarMatricula(String ra) {

        for (Aluno aluno : alunos) {
            if (aluno.getRa().equals(ra)) {
                aluno.setAtivo(false);
                return;
            }
        }
    }

    /*
        Deve retornar a quantidade de alunos contidos na lista (matriculados);
    */
    public Integer getQuantidadeAlunos() {

        int quantidadeAlunos = 0;

        for (Aluno aluno : alunos) {
            if (aluno.isAtivo()) {
                quantidadeAlunos++;
            }
        }

        return quantidadeAlunos;
    }
    /*
        Deve retornar a quantidade de alunos matriculados (contidos na lista)
        que estão no semestre informado;
    */
    public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {

        int quantidadeAlunosPorSemestre = 0;

        for (Aluno aluno : alunos) {
            if (aluno.isAtivo() && aluno.getSemestre().equals(semestre)) {
                quantidadeAlunosPorSemestre++;
            }
        }

        return quantidadeAlunosPorSemestre;
    }
    /*
        Deve retornar a quantidade de alunos com matricula cancelada (contidos na lista);
    */
    public Integer getQuantidadeAlunosComMatriculaCancelada() {
        int quantidadeAlunosComMatriculaCancelada = 0;

        for (Aluno aluno : alunos) {
            if (!aluno.isAtivo()) {
                quantidadeAlunosComMatriculaCancelada++;
            }
        }

        return quantidadeAlunosComMatriculaCancelada;
    }
    public String getNome() {
        return null;
    }
}
