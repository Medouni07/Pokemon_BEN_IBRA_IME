package com.simplon.pokemon.service;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable;
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
	
	
	//Methode a faire icis
	
	
	//Find All
	public List<Pokemon> getAllPokemon(){
		return pokemonRepository.findAll();
	}
	
	
	//FindById
	
      public Optional <Pokemon> findPokemonById(Long id) {
		return pokemonRepository.findById(id);
    }
	
	
	
	//FIndByName
	
	public Optional<Pokemon> findPokemonByName(String name){
		return pokemonRepository.findPokemonByName(name);
	}
	
	//FindByDresseur
      public List<Pokemon> findByDresseur(Gettable DresseurService ){
  		return pokemonRepository.findByDresseur(DresseurService);
  	}
      
//	FindByType
      
}
