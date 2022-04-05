package com.simplon.pokemon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplon.pokemon.repository.TypePokemonRepository;

@Service
public class TypePokemonService {

	private final TypePokemonRepository typePokemonRepository;
	
	@Autowired
	public TypePokemonService(TypePokemonRepository typePokemonRepository) {
		this.typePokemonRepository = typePokemonRepository;
	}
	
	
	
	//Methode a faire ici
	
	
	//Find All
	
	
	
	//FindById
	
	
	
	//FIndByName
	
	
	
	
	//FindByDresseur
}
