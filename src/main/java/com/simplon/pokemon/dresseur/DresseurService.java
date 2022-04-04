package com.simplon.pokemon.dresseur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplon.pokemon.models.Dresseur;

@Service
public class DresseurService {

	private final DresseurRepo dresseurRepo;
	
	@Autowired
	public DresseurService(DresseurRepo dresseurRepo) {
		this.dresseurRepo = dresseurRepo;
	}
	
	
	public List<Dresseur> getAllDresseur() {
		return dresseurRepo.findAll();
	}
}
