package com.simplon.pokemon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplon.pokemon.model.Pokemon;
import com.simplon.pokemon.repository.PokemonRepository;

@Service
public class PokemonService {

	private final PokemonRepository pokemonRepository;
	
	@Autowired
	public PokemonService(PokemonRepository pokemonRepository) {
		this.pokemonRepository = pokemonRepository;
		
	}
	
	
	//Methode a faire icis
	
	
	//Find All
	public List<Pokemon> getAllPokemon(){
		return pokemonRepository.findAll();
	}
	
	
	//FindById
	
	
	
	//FIndByName
	
	
	//FindByDresseur
	
}
