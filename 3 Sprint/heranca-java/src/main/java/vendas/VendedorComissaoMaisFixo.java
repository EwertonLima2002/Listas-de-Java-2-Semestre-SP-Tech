package vendas;

public class VendedorComissaoMaisFixo extends VendedorComissao{

    private Double salario_Fixo;

    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double vendas, Double taxa, Double salario_Fixo) {
        super(codigo, nome, vendas, taxa);
        this.salario_Fixo = salario_Fixo;
    }

    @Override
    public Double calcular_salario() {
        return super.calcular_salario() + salario_Fixo;
    }

    @Override
    public String toString() {
        return
                String.format("Comissão do Vendedor mais Fixo" +
                        "%s" +
                        "Salário Fixo: %.2f", super.toString(), this.salario_Fixo);

    }
}
