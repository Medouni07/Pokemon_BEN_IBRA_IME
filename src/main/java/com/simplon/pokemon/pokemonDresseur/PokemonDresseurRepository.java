package com.simplon.pokemon.pokemonDresseur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplon.pokemon.models.PokemonDresse;


@Repository
public interface PokemonDresseurRepository extends JpaRepository<PokemonDresse, Long> {

}
