package com.simplon.pokemon.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pokemon_dresse database table.
 * 
 */
@Embeddable
public class PokemonDressePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="pokemon_id")
	private long pokemonId;

	@Column(name="dresseur_id")
	private long dresseurId;

	public PokemonDressePK() {
	}
	public long getPokemonId() {
		return this.pokemonId;
	}
	public void setPokemonId(long pokemonId) {
		this.pokemonId = pokemonId;
	}
	public long getDresseurId() {
		return this.dresseurId;
	}
	public void setDresseurId(long dresseurId) {
		this.dresseurId = dresseurId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PokemonDressePK)) {
			return false;
		}
		PokemonDressePK castOther = (PokemonDressePK)other;
		return 
			(this.pokemonId == castOther.pokemonId)
			&& (this.dresseurId == castOther.dresseurId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.pokemonId ^ (this.pokemonId >>> 32)));
		hash = hash * prime + ((int) (this.dresseurId ^ (this.dresseurId >>> 32)));
		
		return hash;
	}
}