package com.simplon.pokemon.service;


import java.util.List;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplon.pokemon.model.PokemonEstDeType;
import com.simplon.pokemon.repository.PokemonEstDeTypeRepository;

@Service
public class PokemonEstDeTypeService {
	
	private final PokemonEstDeTypeRepository pokemonEstDeTypeRepository;
	
	@Autowired
	public PokemonEstDeTypeService(PokemonEstDeTypeRepository pokemonEstDeTypeRepository) {
		this.pokemonEstDeTypeRepository = pokemonEstDeTypeRepository;
		
	}
	
	//Methode a faire ici
	
	
	//Find All
	

	
	
	//FindById
	
	public Optional <PokemonEstDeType> findPokemonEstDeTypeById(Long id) {
		return pokemonEstDeTypeRepository.findById(id);
    }
	

	
	
	//FIndByName
	
	
	
	
	//FindByDresseur

}
