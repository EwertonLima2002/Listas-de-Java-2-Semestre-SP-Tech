import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private String cliente;

    private List<Produto> produtos;


    public Carrinho(String cliente) {
        this.cliente = cliente;
        produtos = new ArrayList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    Integer getQuantidade(){
        Integer total = 0;
        for(int i = 0; i < produtos.size();i++){
           total = i +1;
        }
        return total;
    }

    public void adicionar(Produto p){
        produtos.add(p);
    }
    Boolean existePorNome(String nome){
        Boolean existe = false;

        for(int i = 0; i< produtos.size();i++){
            if(produtos.get(i).getNome().equals(nome)){
                existe = true;
            }
        }
        return existe;
    }
     Integer getQuatidadePorCategoria(String nome){
        Integer qtd_categoria = 0;

        for(int i = 0; i < produtos.size();i++){
         if(produtos.get(i).getCategoria().equals(nome)){
             qtd_categoria++;
         }
        }
        return qtd_categoria;
    }
    public void limpar(){

      produtos.clear();

    }



    public void removerPorNome(String nome){
        for(int i = 0; i < produtos.size();i++){
            if(nome.equals(produtos.get(i).getNome())){
             produtos.remove(i);
                i--;
            }
        }

    }
    public Produto getPorNome(String nome){
        for(int i = 0; i < produtos.size();i++){
            if(produtos.get(i).getNome().equals(nome)){
                System.out.println("Existe o produto no carrinho");
                return produtos.get(i);
            }
            else {
                System.out.println("Não existe o produto no carrinho");
            }
        }
        return null;
    }
     Double getValorTotal(){
        Double soma = 0.0;

        for(int i = 0; i < produtos.size();i++){
           Double valores_produtos = produtos.get(i).getPreco();
           soma+= valores_produtos;
        }
          return soma;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "cliente='" + cliente + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
