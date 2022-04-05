package com.simplon.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplon.pokemon.model.PokemonDresse;

@Repository
public interface PokemonDresseRepository extends JpaRepository<PokemonDresse, Long> {

}
