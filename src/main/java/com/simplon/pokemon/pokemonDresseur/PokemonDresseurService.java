package com.simplon.pokemon.pokemonDresseur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplon.pokemon.models.PokemonDresse;

@Service
public class PokemonDresseurService {

	private final PokemonDresseurRepository pokemonDresseurRepository;
	
	@Autowired
	public PokemonDresseurService(PokemonDresseurRepository pokemonDresseurRepository) {
		this.pokemonDresseurRepository = pokemonDresseurRepository;
	}
	
	public List<PokemonDresse> getAllDress() {
		return pokemonDresseurRepository.findAll();
		
	}
	
	public Optional<PokemonDresse> getById(Long id) {
		return pokemonDresseurRepository.findById(id);
	}
}
