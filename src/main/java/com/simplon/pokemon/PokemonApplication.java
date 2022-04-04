package com.simplon.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dresseur.DresseurService;

@SpringBootApplication
@RestController
public class PokemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonApplication.class, args);
	}
	@GetMapping
	public String helloworld(){
		return "hello world XXXX";
	}
	

	
}
