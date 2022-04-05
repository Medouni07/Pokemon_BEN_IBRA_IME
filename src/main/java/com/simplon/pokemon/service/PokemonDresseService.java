package com.simplon.pokemon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplon.pokemon.model.PokemonDresse;
import com.simplon.pokemon.repository.PokemonDresseRepository;

@Service
public class PokemonDresseService {
	
	private final PokemonDresseRepository pokemonDresseRepository;
	
	
	@Autowired
	public PokemonDresseService(PokemonDresseRepository pokemonDresseRepository){
		
		 this.pokemonDresseRepository = pokemonDresseRepository;
	}
	

	
	//Methode a faire ici
	
	
	//Find All
	
	public List<PokemonDresse> getAllPokemonDresse(){
		return pokemonDresseRepository.findAll();
	}
	
	//FindById
	
	
	
	//FIndByName
	
	
	
	
	//FindByDresseur
	
	
	//FindByType

}
