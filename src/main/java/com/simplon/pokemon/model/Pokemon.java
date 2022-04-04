package com.simplon.pokemon.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the pokemon database table.
 * 
 */
@Entity
@NamedQuery(name="Pokemon.findAll", query="SELECT p FROM Pokemon p")
public class Pokemon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private BigInteger evolution;

	@Column(name="health_points")
	private int healthPoints;

	@Column(name="name_")
	private String name;

	@Column(name="number_")
	private int number;

	public Pokemon() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigInteger getEvolution() {
		return this.evolution;
	}

	public void setEvolution(BigInteger evolution) {
		this.evolution = evolution;
	}

	public int getHealthPoints() {
		return this.healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}