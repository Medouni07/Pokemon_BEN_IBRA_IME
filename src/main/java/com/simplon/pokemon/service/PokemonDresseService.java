package com.simplon.pokemon.service;

import org.springframework.stereotype.Service;

import com.simplon.pokemon.repository.PokemonDresseRepository;

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
