package com.simplon.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
