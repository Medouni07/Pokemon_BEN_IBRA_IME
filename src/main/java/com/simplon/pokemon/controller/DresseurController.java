package com.simplon.pokemon.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.pokemon.model.Dresseur;
import com.simplon.pokemon.service.DresseurService;


@RestController
@RequestMapping("/api/dresseur")
public class DresseurController {
	
	private final DresseurService dresseurService;
	
	@Autowired
	public DresseurController(DresseurService dresseurService) {
		
		this.dresseurService = dresseurService;
	}
	

	
//	@GetMapping
//	public String hello() {
//		return "This is dresseur";
//	}
	@GetMapping
	public List<Dresseur> getAllDresseur(){
		return dresseurService.getAllDresseur();
	}
	
	
    @GetMapping(path = "/{id}")
    public Optional<Dresseur> findDresseurById1(@PathVariable Long id) {
        return dresseurService.findDresseurById(id);
    }
	
	

   
   @GetMapping(path = "/name/{name}")
   public Optional <Dresseur> findDresseurByName(@PathVariable String name) {
       return dresseurService.findDresseurByName(name);
   }
   
   @GetMapping(path = "/name/{name}")
   public Optional <Dresseur> findPokemonByDresseur(@PathVariable String name) {
       return dresseurService.findPokemonByDresseur(name);
   }

}
