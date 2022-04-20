package test;

import pokemon.Pokedex;
import pokemon.Pokemon;

public class pruebas {

	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon("pikachu", 0, "electrico");
		pokemon.attackPokemon(pokemon);
        Pokedex pokedex = new Pokedex();
        pokedex.listPokemon();
	}

}
