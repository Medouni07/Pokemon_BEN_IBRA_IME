package com.simplon.pokemon.controller;


import java.util.List;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.simplon.pokemon.model.Pokemon;
import com.simplon.pokemon.model.PokemonDresse;
import com.simplon.pokemon.service.PokemonDresseService;

@RestController
@RequestMapping("/api/pokemonDresse")
public class PokemonDresseController {
	
	private final PokemonDresseService pokemonDresseService;
	
	
	@Autowired
	public PokemonDresseController(PokemonDresseService pokemonDresseService) {
		this.pokemonDresseService = pokemonDresseService;
		
	}
	
//	@GetMapping
//	public String hello() {
//		return "This is pokemonDresse";
//	}
	
	@GetMapping
	public List<PokemonDresse> getAllPokemonDresse(){
		return pokemonDresseService.getAllPokemonDresse();
	}

	
	
	  @GetMapping(path = "/{id}")
	    public Optional<PokemonDresse> findPokemonDresseById(@PathVariable Long id) {
	        return pokemonDresseService.findPokemonDresseById(id);
	    }

}
