package com.simplon.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplon.pokemon.model.TypePokemon;

@Repository
public interface TypePokemonRepository extends JpaRepository<TypePokemon, Long> {

}
