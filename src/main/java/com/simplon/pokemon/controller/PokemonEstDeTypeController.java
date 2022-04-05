package com.simplon.pokemon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.pokemon.service.PokemonEstDeTypeService;

@RestController
@RequestMapping("/api/pokemonEstDeType")
public class PokemonEstDeTypeController {

	
	private final PokemonEstDeTypeService pokemonEtDeTypeService;
	
	
	@Autowired
	public PokemonEstDeTypeController(PokemonEstDeTypeService pokemonEtDeTypeService) {
		this.pokemonEtDeTypeService = pokemonEtDeTypeService;
		
	}
	
	@GetMapping
	public String hello() {
		return "This is pokemonEstDeType";
	}
}
