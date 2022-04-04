package com.simplon.pokemon.pokemonDresseur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.pokemon.models.PokemonDresse;

@RestController
@RequestMapping("/api/ben")
public class PokemonDresseurControlleur {
	
	private final PokemonDresseurService pokemonDresseurService;
	
	@Autowired
	public PokemonDresseurControlleur(PokemonDresseurService pokemonDresseurService) {
		this.pokemonDresseurService = pokemonDresseurService;
	}
	
	
	@GetMapping
	@CrossOrigin(allowedHeaders = "http://localhost:8090/api/ben")
	public List<PokemonDresse> getAllDress() {
		return pokemonDresseurService.getAllDress();
	}
	
	@GetMapping
	public Optional<PokemonDresse> getById(Long id) {
		return pokemonDresseurService.getById(id);
	}

}
