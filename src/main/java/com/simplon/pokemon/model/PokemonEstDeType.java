package com.simplon.pokemon.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pokemon_est_de_type database table.
 * 
 */
@Entity
@Table(name="pokemon_est_de_type")
@NamedQuery(name="PokemonEstDeType.findAll", query="SELECT p FROM PokemonEstDeType p")
public class PokemonEstDeType implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PokemonEstDeTypePK id;

	public PokemonEstDeType() {
	}

	public PokemonEstDeTypePK getId() {
		return this.id;
	}

	public void setId(PokemonEstDeTypePK id) {
		this.id = id;
	}

}