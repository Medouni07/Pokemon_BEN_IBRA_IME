package com.simplon.pokemon.pokemonType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.pokemon.models.TypePokemon;

@RestController
@RequestMapping("/api/ibo")
public class TypePokemonControleur {
	
	
	private final TypePokemonService typePokemonService;
	
	@Autowired
	public TypePokemonControleur(TypePokemonService typePokemonService) {
		
		this.typePokemonService = typePokemonService;
	}
	
	@GetMapping
	public List<TypePokemon> getAllPokemon(){	
		return typePokemonService.getAllPokemon();
	} 
	

}
