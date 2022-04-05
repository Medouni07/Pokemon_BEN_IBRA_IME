package com.simplon.pokemon.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.simplon.pokemon.model.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {


	//List<Pokemon> findByDresseur(Gettable dresseurService);
	
	Optional<Pokemon> findPokemonByName(@Param("name_") String name);

}
