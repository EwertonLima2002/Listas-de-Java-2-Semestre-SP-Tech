public class Filme {

    private Integer id;

    private String nome;

    private Integer anoLancamento;

    private Boolean assitindo;

    public Filme(Integer id, String nome, Integer anoLancamento) {
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.assitindo = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        String ja_assistiu = assitindo ? "Já assistiu" : "Não Assistiu";

        String resultado = String.format(("'Filme  " +
                        "\nid %d\n" +
                        "\nNome %s \n  " +
                        "\nAno de Lancamento %d\n  " +
                        "\nJá Assitiu? %b").formatted(id , nome, anoLancamento, ja_assistiu));

        return resultado;
    }
}
