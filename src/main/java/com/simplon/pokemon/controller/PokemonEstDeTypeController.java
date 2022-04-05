package com.simplon.pokemon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.pokemon.service.PokemonEtDeTypeService;

@RestController
@RequestMapping("/api/pokemonEstDeType")
public class PokemonEstDeTypeController {

	
	private final PokemonEtDeTypeService pokemonEtDeTypeService;
	
	
	@Autowired
	public PokemonEstDeTypeController(PokemonEtDeTypeService pokemonEtDeTypeService) {
		this.pokemonEtDeTypeService = pokemonEtDeTypeService;
		
	}
	
	@GetMapping
	public String hello() {
		return "This is pokemonEstDeType";
	}
}
