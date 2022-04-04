package com.simplon.pokemon.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the type_pokemon database table.
 * 
 */
@Entity
@Table(name="type_pokemon")
@NamedQuery(name="TypePokemon.findAll", query="SELECT t FROM TypePokemon t")
public class TypePokemon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private String label;

	public TypePokemon() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}