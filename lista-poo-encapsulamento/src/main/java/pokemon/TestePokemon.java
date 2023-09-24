package pokemon;

public class TestePokemon {
    public static void main(String[] args) {
        Pokemon pokemon01 = new Pokemon("Pikachu" , "Elétrico" , 70 , 51);
        Pokemon pokemon02 = new Pokemon("planta", "Planta", 65, 301);
        TreinadorPokemon treinar = new TreinadorPokemon("Ash Ketchum" , 30);


        for(int i = 1; i <=5;i++){
            treinar.treinarPokemon(pokemon02);
        }
        treinar.evoluirPokemon(pokemon01 , "Raichu");

        for(int i = 1; i <=2; i++){
            treinar.treinarPokemon(pokemon01);
        }
       pokemon02.exibir_relatorio_pokemon();

        treinar.evoluirPokemon(pokemon01 , "Gorochu");

        treinar.exibirStatus();
    }
}
