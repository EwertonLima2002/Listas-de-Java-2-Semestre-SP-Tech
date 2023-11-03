package consultoria;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {

    private String nome;

    private Integer vagas;

    private List<Dev> dev;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.dev = new ArrayList<>();
    }

    public Boolean existePorNome(String nome){
        for(Dev desenvolvedores : dev){
            if(desenvolvedores.getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }

    public void contratar_dev(Dev desenvolvedor){
        dev.add(desenvolvedor);
    }
    public Integer getQuantidadeDevs(){
       Integer quantidade_de_devs = dev.size();

       return quantidade_de_devs;
    }

    public Integer getQuantidadeDevsMobile(){

        Integer qtd_dev_mobile = 0;
        for (int i = 0; i < dev.size(); i++) {
            Dev devdaVez = dev.get(i);

            if(devdaVez instanceof DevMobile){
                qtd_dev_mobile +=1;
            }
        }
         return qtd_dev_mobile;
    }

    public Double getTotalSalarios(){
        Double salario = 0.0;

        for(int i = 0 ; i < dev.size();i++){
            salario += dev.get(i).getSalario();
        }
        return salario;
    }

    public Dev DevPorNome(String nome){

        Dev developer = null;

        for (int i = 0; i < dev.size(); i++) {
            if(dev.get(i).getNome().equals(nome)){
                developer = dev.get(i);
            }
        }


        return developer;
    }

    @Override
    public String toString() {
        return "Consultoria{" +
                "nome='" + nome + '\'' +
                ", vagas=" + vagas +
                ", dev=" + dev +
                '}';
    }
}
