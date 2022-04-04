package com.simplon.pokemon.dresseur;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplon.pokemon.models.Dresseur;

public interface DresseurRepo extends JpaRepository<Dresseur, Long> {

}
