package com.simplon.pokemon.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.simplon.pokemon.model.Dresseur;



@Repository
public interface DresseurRepository extends JpaRepository<Dresseur, Long> {

	
	Optional<Dresseur> findDresseurByName(@Param("name_") String name);

	Optional<Dresseur> findPokemonByDresseur(String name);



}
