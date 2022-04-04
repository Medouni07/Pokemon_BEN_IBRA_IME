package com.simplon.pokemon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplon.pokemon.models.Dresseur;
import com.simplon.pokemon.models.Pokemon;


@Repository
public interface TestRepo extends JpaRepository<Pokemon, Long> {

}
