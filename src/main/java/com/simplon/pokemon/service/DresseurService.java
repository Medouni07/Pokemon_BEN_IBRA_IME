package com.simplon.pokemon.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplon.pokemon.model.Dresseur;
import com.simplon.pokemon.repository.DresseurRepository;



@Service
public class DresseurService {
	
	private final DresseurRepository dresseurRepository;
	
	@Autowired
	public DresseurService(DresseurRepository dresseurRepository) {
		
		this.dresseurRepository = dresseurRepository;
	}
	
	
	
	//Methode a faire ici
	
	
	//Find All
	
	public List<Dresseur> getAllDresseur(){
		return dresseurRepository.findAll();
	}
	
	//FindById
	



    public Optional <Dresseur> findDresseurById(Long id) {
        return dresseurRepository.findById(id);
    }

	

	//FIndByName
    
    
    public Optional <Dresseur> findDresseurByName(String name) {
        return dresseurRepository.findDresseurByName(name);
    }
	

	

}
