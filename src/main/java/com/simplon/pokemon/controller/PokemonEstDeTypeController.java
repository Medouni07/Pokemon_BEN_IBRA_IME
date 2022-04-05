package com.simplon.pokemon.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.simplon.pokemon.model.PokemonEstDeType;
import com.simplon.pokemon.service.PokemonEstDeTypeService;

@RestController
@RequestMapping("/api/pokemonEstDeType")
public class PokemonEstDeTypeController {

	

	private final PokemonEstDeTypeService pokemonEstDeTypeService;
	
	
	@Autowired
	public PokemonEstDeTypeController(PokemonEstDeTypeService pokemonEstDeTypeService) {
		this.pokemonEstDeTypeService = pokemonEstDeTypeService;
		
	}
	
	@GetMapping
	public String hello() {
		return "This is pokemonEstDeType";
	}
	
	 @GetMapping(path = "/{id}")
	    public Optional<PokemonEstDeType> findPokemonEstDeTypeById(@PathVariable Long id) {
	        return pokemonEstDeTypeService.findPokemonEstDeTypeById(id);
	    }
	 
		
}
