package vendas;

public class VendedorComissao {

    protected Integer codigo;

    protected String nome;

    protected Double vendas;

    protected Double taxa;

    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }

    public Double calcular_salario(){
        return (vendas * taxa) / 100;
    }
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {


        return  String.format("Comissão do Vendedor" +
                "Codigo: %d\n" +
                "Nome: %s\n" +
                "Vendas: %.2f\n" +
                "Taxa da Venda: %.2f", codigo , nome , vendas , taxa);
    }
}
