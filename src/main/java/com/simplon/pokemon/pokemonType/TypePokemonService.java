package com.simplon.pokemon.pokemonType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplon.pokemon.models.TypePokemon;

@Service
public class TypePokemonService {
	
	private final TypePokemonRepo typePokemonRepo;
	
	@Autowired
	public TypePokemonService(TypePokemonRepo typePokemonRepo) {
		this.typePokemonRepo = typePokemonRepo;
	}
	
	
	public List<TypePokemon> getAllPokemon(){
		return  typePokemonRepo.findAll();
	}

}
