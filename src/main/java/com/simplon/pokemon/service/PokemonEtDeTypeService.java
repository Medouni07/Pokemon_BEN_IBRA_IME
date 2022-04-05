package com.simplon.pokemon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplon.pokemon.model.PokemonEstDeType;
import com.simplon.pokemon.repository.PokemonEstDeTypeRepository;

@Service
public class PokemonEtDeTypeService {
	
	private final PokemonEstDeTypeRepository pokemonEstDeTypeRepository;
	
	@Autowired
	public PokemonEtDeTypeService(PokemonEstDeTypeRepository pokemonEstDeTypeRepository) {
		this.pokemonEstDeTypeRepository = pokemonEstDeTypeRepository;
		
	}
	
	//Methode a faire ici
	
	
	//Find All
	
//	public List<PokemonEstDeType> getAllPokemonEstDeType(){
//		return PokemonEstDeType.findAll();
//	}
	
	//FindById
	
	
	
	//FIndByName
	
	
	
	
	//FindByDresseur

}
