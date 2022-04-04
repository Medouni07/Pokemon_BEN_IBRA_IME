package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pokemon_est_de_type database table.
 * 
 */
@Embeddable
public class PokemonEstDeTypePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="pokemon_id", insertable=false, updatable=false)
	private long pokemonId;

	@Column(name="type_id", insertable=false, updatable=false)
	private long typeId;

	public PokemonEstDeTypePK() {
	}
	public long getPokemonId() {
		return this.pokemonId;
	}
	public void setPokemonId(long pokemonId) {
		this.pokemonId = pokemonId;
	}
	public long getTypeId() {
		return this.typeId;
	}
	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PokemonEstDeTypePK)) {
			return false;
		}
		PokemonEstDeTypePK castOther = (PokemonEstDeTypePK)other;
		return 
			(this.pokemonId == castOther.pokemonId)
			&& (this.typeId == castOther.typeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.pokemonId ^ (this.pokemonId >>> 32)));
		hash = hash * prime + ((int) (this.typeId ^ (this.typeId >>> 32)));
		
		return hash;
	}
}