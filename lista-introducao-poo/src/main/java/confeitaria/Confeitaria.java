package confeitaria;

import java.util.HashMap;
import java.util.Map;


public class Confeitaria {

  private String sabor;

  private Double valor;

  private String sabor_digitado;

  private Integer quantidadeVendida;

  private Integer qtd_vezes;

  public Confeitaria(String saborBolo , Double valor){
      this.sabor = saborBolo;
      this.valor = valor;
      this.quantidadeVendida = 0;
  }

    public Confeitaria(Double valor){
        this.valor = 25.0;
        this.quantidadeVendida = 0;
    }

    public void setSabor(String sabor){
      this.sabor = sabor;
   }

   public String getSabor(){
       return sabor;
   }

    Map<String, Integer> saboresQuantidade = new HashMap<>();
    Double valorTotal = 0.0;

    void comprar_bolo(String sabor, Integer qtdDesejada) {
        Double valorUnitario = 45.00;

        if (!saboresQuantidade.containsKey(sabor)) {
            saboresQuantidade.put(sabor, qtdDesejada);
        } else {
            saboresQuantidade.put(sabor, saboresQuantidade.get(sabor) + qtdDesejada);
        }

        Double valorCompra = valorUnitario * qtdDesejada;

        quantidadeVendida += qtdDesejada;

        if (quantidadeVendida > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        }
        else if (valorCompra < 30.00 && valorCompra > 50.00) {
            System.out.println("Valor inválido");

        }
        else {
            System.out.println(
                    String.format("""
                            O bolo sabor %s, foi comprado %s vezes hoje, totalizando R$ %.2f
                            """, sabor, saboresQuantidade.get(sabor), valorTotal)
            );
        }
    }


}
