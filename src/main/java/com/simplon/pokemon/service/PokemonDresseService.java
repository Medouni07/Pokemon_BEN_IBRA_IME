package com.simplon.pokemon.service;

import org.springframework.stereotype.Service;

import com.simplon.pokemon.model.PokemonDresse;
import com.simplon.pokemon.repository.PokemonDresseRepository;

import antlr.collections.List;

@Service
public class PokemonDresseService {
	
	private final PokemonDresseRepository pokemonDresseRepository;
	
	public PokemonDresseService(PokemonDresseRepository pokemonDresseRepository){
		
		 this.pokemonDresseRepository = pokemonDresseRepository;
	}
	
//	public List<PokemonDresse> gethello(){
//		
//		return pokemonDresseRepository.finAll();
//	}
//	 
	
	

}
