package livraria;

public class Livros {

    private String nome_livro;

    private Double valor_livro;

    public Livros() {

    }
    public Livros(String nome_livro, Double valor_livro) {
        this.nome_livro = nome_livro;
        this.valor_livro = valor_livro;
    }

    public String getNome_livro() {
        return nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public Double getValor_livro() {
        return valor_livro;
    }

    public void setValor_livro(Double valor_livro) {
        this.valor_livro = valor_livro;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome_livro='" + nome_livro + '\'' +
                ", valor_livro=" + valor_livro +
                '}';
    }
}
