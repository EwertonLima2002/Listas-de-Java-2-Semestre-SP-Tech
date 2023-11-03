package alunos;

import alunos.Aluno;

public class AlunoPosGraducao  extends Aluno {

    protected Double notaArtigo;


    public AlunoPosGraducao(String ra, String nome, Double notaProva, Double notaEntrega, Double notaArtigo) {
        super(ra, nome, notaProva, notaEntrega);
        this.notaArtigo = notaArtigo;
    }

    @Override
    public Double calcularNotaFinal() {
        return super.calcularNotaFinal() + notaArtigo;
    }

    @Override
    public String toString() {
        return  String.format("""
                %sNota Artigo: %.2f
                """, super.toString(), this.notaEntrega);
    }
}
