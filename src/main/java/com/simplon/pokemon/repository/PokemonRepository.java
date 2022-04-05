package com.simplon.pokemon.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable;
import com.simplon.pokemon.model.Dresseur;
import com.simplon.pokemon.model.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

	List<Pokemon> findByDresseur(Gettable dresseurService);
	
	Optional<Pokemon> findPokemonByName(@Param("name_") String name);

}
