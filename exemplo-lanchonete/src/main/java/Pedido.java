public class Pedido {

    // atributo
    // construtor
    // metodos
    // get set
    //toString
    private Integer numero;

    private String mesa;

    private Double  valor;

    private String lache;

    private String bebida;

    public Pedido(Integer numero, String mesa, Double valor, String lache, String bebida) {
        this.numero = numero;
        this.mesa = mesa;
        this.valor = valor;
        this.lache = lache;
        this.bebida = bebida;
    }

    public void exibirPedido(){
        System.out.println(
                String.format(
                        "Pedido" +
                                "\n=========================================" +
                        "\nNumero %d" +
                                "\nMesa %s" +
                                "\nLache %s" +
                        "\nBebida %s\\" +
                        "\nvalor %.2f", numero , mesa , lache , bebida, valor )
        );
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getLache() {
        return lache;
    }

    public void setLache(String lache) {
        this.lache = lache;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
}
