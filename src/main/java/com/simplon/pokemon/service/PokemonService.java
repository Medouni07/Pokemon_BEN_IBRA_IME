package com.simplon.pokemon.service;

import java.util.Optional;

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
	
	
	//Methode a faire ici
	
	
	//Find All
	
	
	
	//FindById
	
      public Optional <Pokemon> findPokemonById(Long id) {
		return pokemonRepository.findById(id);
    }
	
	
	
	//FIndByName
	
	public Optional<Pokemon> findPokemonByName(String name){
		return pokemonRepository.findPokemonByName(name);
	}
	
	//FindByDresseur
	
}
