package com.simplon.pokemon.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.pokemon.model.Pokemon;
import com.simplon.pokemon.service.PokemonService;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

	
	private final PokemonService pokemonService;
	
	@Autowired
	public PokemonController(PokemonService pokemonService) {
		this.pokemonService = pokemonService;
		
	}
	
	@GetMapping
	public String hello() {
		return "This is pokemon";
	}
	
	
//	@GetMapping(path= "/name/{name}")
//	public Optional<Pokemon> findPokemonByName(@PathVariable String name){
//		return pokemonService.findPokemonByName(name);
//	}
}
