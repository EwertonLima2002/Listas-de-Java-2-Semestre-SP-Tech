package alunos;

public class Aluno {

    protected String ra;
    protected String nome;
    protected Double notaProva;
    protected Double notaEntrega;

    public Aluno(String ra, String nome, Double notaProva, Double notaEntrega) {
        this.ra = ra;
        this.nome = nome;
        this.notaProva = notaProva;
        this.notaEntrega = notaEntrega;
    }

    public Double calcularNotaFinal(){
        return this.notaProva + this.notaEntrega;
    }
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(Double notaProva) {
        this.notaProva = notaProva;
    }

    public Double getNotaEntrega() {
        return notaEntrega;
    }

    public void setNotaEntrega(Double notaEntrega) {
        this.notaEntrega = notaEntrega;
    }

    @Override
    public String toString() {
        return String.format(
                """
                        Ra: %s
                        Nome aluno: %s
                        Nota prova: %.2f
                        Nota de Entrega: %.2f
                        """, ra , nome , notaProva , notaEntrega
        );

    }
}
