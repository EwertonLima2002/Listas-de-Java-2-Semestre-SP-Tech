package livraria;

public class Livro {
    private Integer codigo;

    private String titulo;

    private String autor;

    private Double preco;

    private Integer quantidadeVendida;

    private Integer quantidadeEstoque;

    public Livro(Integer codigo, String titulo, String autor, Double preco, Integer quantidadeVendida, Integer quantidadeEstoque) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidadeVendida = 0;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Integer quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }



    public void venderLivro(){

        if(getQuantidadeEstoque() > 0){
            quantidadeVendida += 1;
            quantidadeEstoque -= 1;

            System.out.println(
                    String.format(  "Livro vendido \n" +
                            "Quantidade vendida: %d \n" +
                            "Quantidade disponível no estoque agora é de %d", quantidadeVendida , quantidadeEstoque)

            );
        }
        else{
            System.out.println("Livro não vendido pois o valor em estoque é menor que 0");
        }

    }

    public Integer venderLivro(Integer quantidade){

        if(getQuantidadeVendida() >= 0 && quantidade < quantidadeEstoque){
            quantidadeVendida+= quantidade;
            quantidadeEstoque-=quantidade;
        }
        else{
            System.out.println("Estoque muito baixo");
        }
        return quantidadeVendida;
    }

    public Double calcularTotalVendas(){

        Double total_vendido = getQuantidadeVendida() * getPreco();

        return total_vendido;
    }
    public Integer aumentarEstoque(Integer quantidade_aumentar){
        if(quantidade_aumentar >0){
            quantidadeEstoque+=quantidade_aumentar;
        }
        else {
            System.out.println("Quantidade informada menor que 0");
        }
        return quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                ", quantidadeVendida=" + quantidadeVendida +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}
