package com.simplon.pokemon.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pokemon_dresse database table.
 * 
 */
@Entity
@Table(name="pokemon_dresse")
@NamedQuery(name="PokemonDresse.findAll", query="SELECT p FROM PokemonDresse p")
public class PokemonDresse implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PokemonDressePK id;

	private String nickname;

	public PokemonDresse() {
	}

	public PokemonDressePK getId() {
		return this.id;
	}

	public void setId(PokemonDressePK id) {
		this.id = id;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}