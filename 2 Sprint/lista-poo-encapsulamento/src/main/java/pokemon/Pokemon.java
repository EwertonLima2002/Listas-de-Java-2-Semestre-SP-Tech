package pokemon;

public class Pokemon {

    private String nome;
    private String tipo;
    private Integer forca;
    private Integer doces;

    public Pokemon(String nome, String tipo, Integer forca, Integer doces) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        this.doces = doces;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getDoces() {
        return doces;
    }

    public void setDoces(Integer doces) {
        this.doces = doces;
    }

    public void exibir_relatorio_pokemon(){

        System.out.println(
                String.format(
                        "Status do Pokemon\n" +
                                "Nome: %s\n" +
                                "Tipo: %s\n" +
                                "Força: %d\n" +
                                "Doces: %d" , getNome() , getTipo() , getForca() , getDoces())

        );
    }
}
