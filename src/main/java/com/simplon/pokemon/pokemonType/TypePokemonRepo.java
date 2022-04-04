package com.simplon.pokemon.pokemonType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplon.pokemon.models.TypePokemon;
@Repository
public interface TypePokemonRepo extends JpaRepository<TypePokemon, Long> {

}