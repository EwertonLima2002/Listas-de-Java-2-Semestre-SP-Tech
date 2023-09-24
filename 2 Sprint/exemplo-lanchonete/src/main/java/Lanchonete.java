public class Lanchonete {

    private String nome;

    private Integer quantidadeVendido;

    private Double totalVendido;

    public Lanchonete(String nome) {
        this.nome = nome;
        this.quantidadeVendido = 0;
        this.totalVendido = 0.0;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeVendido() {
        return quantidadeVendido;
    }

    public Double getTotalVendido() {
        return totalVendido;
    }

    public void exibirRelatorio(){
        System.out.println("===============================" +
                "                     %s          " +
                "\nQuantidade de Pedidos feitos %d\n" +
                "\n-------------------------------\n" +
                "\n-------------------------------\n" +
                "\nTotal vendido: R$%.2f\n" +
                "===============================".formatted(nome , quantidadeVendido , totalVendido)
        );
    }

    public void prepararPedido(Pedido pedido){
        System.out.println("Preparando Pedido");
        pedido.exibirPedido();
        quantidadeVendido++;
        totalVendido = totalVendido + pedido.getValor();
    }




}
