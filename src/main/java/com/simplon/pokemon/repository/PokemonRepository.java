package com.simplon.pokemon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable;
import com.simplon.pokemon.model.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

//	List<Pokemon> findByDresseur(Gettable dresseurService);

}
