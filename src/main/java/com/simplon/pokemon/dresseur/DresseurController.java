package com.simplon.pokemon.dresseur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.pokemon.models.Dresseur;

@RestController
@RequestMapping("/api/dress")
public class DresseurController {

	
	private final DresseurService dresseurService;
	
	@Autowired
	public DresseurController(DresseurService dresseurService) {
		this.dresseurService = dresseurService;
	}
	
	@GetMapping
	public List<Dresseur> getAllDresseur() {
		return dresseurService.getAllDresseur();
	}
}
