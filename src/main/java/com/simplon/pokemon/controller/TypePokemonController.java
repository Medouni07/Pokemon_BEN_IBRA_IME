package com.simplon.pokemon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.pokemon.service.TypePokemonService;

@RestController
@RequestMapping("/api/typePokemon")
public class TypePokemonController {

	
	private final TypePokemonService typePokemonService;
	
	@Autowired
	public TypePokemonController(TypePokemonService typePokemonService) {
		this.typePokemonService = typePokemonService;
		
	}
	
	@GetMapping
	public String hello() {
		return "This is typePokemon";
	}
	
	
}
