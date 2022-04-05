package com.simplon.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplon.pokemon.model.PokemonEstDeType;

@Repository
public interface PokemonEstDeTypeRepository extends JpaRepository<PokemonEstDeType, Long> {

}
