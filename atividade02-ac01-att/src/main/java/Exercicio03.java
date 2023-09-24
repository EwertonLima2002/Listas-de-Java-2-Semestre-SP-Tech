public class Exercicio03 {
    String idade(Integer idade_usuario){
        String faixa_etaria;

        if(idade_usuario > 0 && idade_usuario <=2){
            faixa_etaria = "Bebê";
        }
        else if(idade_usuario >=3 && idade_usuario <= 11){
            faixa_etaria = "Criança";
        }
        else if(idade_usuario >=12 && idade_usuario <=19){
           faixa_etaria = "Adolescente";
        }
        else if(idade_usuario >=20 && idade_usuario <=30){
            faixa_etaria = "Jovem";
        }
        else if(idade_usuario >=31 && idade_usuario <=60){
            faixa_etaria = "Adulto";
        }
        else{
            faixa_etaria = "Idoso";
        }
        return faixa_etaria;
    }
}
