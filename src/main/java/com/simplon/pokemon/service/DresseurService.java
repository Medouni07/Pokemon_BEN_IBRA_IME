package com.simplon.pokemon.service;

import org.springframework.stereotype.Service;

import com.simplon.pokemon.repository.DresseurRepository;



@Service
public class DresseurService {
	
	private final DresseurRepository dresseurRepository;
	
	public DresseurService(DresseurRepository dresseurRepository) {
		
		this.dresseurRepository = dresseurRepository;
	}
	
//	public List<Dresseur> gethello(){
//		
//	return dresseurRepository.finAll();
//	}
	
	

}
