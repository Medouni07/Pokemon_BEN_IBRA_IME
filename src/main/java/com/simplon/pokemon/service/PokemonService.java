package com.simplon.pokemon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplon.pokemon.repository.PokemonRepository;

@Service
public class PokemonService {

	private final PokemonRepository pokemonRepository;
	
	@Autowired
	public PokemonService(PokemonRepository pokemonRepository) {
		this.pokemonRepository = pokemonRepository;
		
	}
	
	
	//Methode a faire ici
	
	
	//Find All
	
	
	
	//FindById
	
	
	
	//FIndByName
	
	
	//FindByDresseur
	
}
