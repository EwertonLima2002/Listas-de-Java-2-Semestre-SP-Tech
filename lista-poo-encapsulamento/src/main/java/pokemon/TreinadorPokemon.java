package pokemon;

public class TreinadorPokemon {

    private String nome;

    private Integer nivel;


    public TreinadorPokemon(String nome , Integer nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void treinarPokemon(Pokemon pokemon) {
        pokemon.setForca((int) (pokemon.getForca() * 1.10));
        pokemon.setDoces(pokemon.getDoces() + 10);
        nivel += 2;
    }
    public void evoluirPokemon(Pokemon pokemon, String nome_evolucao) {
        String nome_anterior = pokemon.getNome();
        Integer total_doces = pokemon.getDoces();

        if (total_doces >= 50) {
            pokemon.setNome(nome_evolucao);
            pokemon.setDoces(total_doces -=50);
            System.out.println(total_doces);
            nivel+= 10;
            System.out.println(
                    String.format("Pokémon %s evoluiu para -> %s", nome_anterior, pokemon.getNome())
            );
        } else {
            System.out.println("Não foi possível " +
                    "realizar operação");
        }
    }

    public void exibirStatus() {
        System.out.println("Status do Treinador:");
        System.out.println("Nome do Treinador: " + nome);
        System.out.println("Nível do Treinador: " + nivel);
    }



}
