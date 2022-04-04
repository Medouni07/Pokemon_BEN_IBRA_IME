package com.simplon.pokemon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplon.pokemon.models.Dresseur;
import com.simplon.pokemon.models.Pokemon;


@Service
public class TestService {
	private final TestRepo testRepo;
	
	@Autowired
	public TestService(TestRepo testRepo){
		this.testRepo = testRepo;
		
	}
	public List<Pokemon> gethello() {
		return testRepo.findAll();
	}

}
