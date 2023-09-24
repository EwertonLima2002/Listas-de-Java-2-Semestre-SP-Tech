import java.security.PublicKey;

public class Utilitaria {
    // um metodo possui:
    // Retorno : void (esse não possui retorno)
    // Nome: exibirLinha
    // Argumentos: esse não tem fica dentro dos parenteses
    // Corpo: esse faz um print sempre dentro das chaves

    void exibirLinha(){
        System.out.println("*-----------*----------*");
    }
    void exibirNome(String nome){
        System.out.println("Olá " + nome);
    }

    // podemos chamar metodos dent  ro de metodos
    void exibirNomeFormatado(String nome) {
        this.exibirLinha();
        this.exibirNome(nome);
    }


}
