package com.simplon.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplon.pokemon.model.Dresseur;



@Repository
public interface DresseurRepository extends JpaRepository<Dresseur, Long> {

}
