package pokemon;

public abstract class AbstractPokemon implements PokemonInterface{

	public void createPokemon() {
		System.out.println("Crear Pokemon");
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		System.out.println("Info del Pokemon");
		return null;
	}
}
