package com.simplon.pokemon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplon.pokemon.model.TypePokemon;
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
	public List<TypePokemon> getAlltypePokemon(){
		return typePokemonRepository.findAll();
	}
	
	
	//FindById
	
	
	
	//FIndByName
	
	
	
	
	//FindByDresseur
}
