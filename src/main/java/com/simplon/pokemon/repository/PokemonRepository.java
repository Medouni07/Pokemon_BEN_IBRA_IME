package com.simplon.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplon.pokemon.model.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

}
