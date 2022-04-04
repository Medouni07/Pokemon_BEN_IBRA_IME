package com.simplon.pokemon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplon.pokemon.models.Pokemon;

@RestController
@RequestMapping( path = "/api/imen")
public class testController {
	
	
	private final TestService testService;
	@Autowired
	public testController(TestService testService) {
		this.testService = testService;
		
	}
	
	@CrossOrigin(allowedHeaders = "http://localhost:8090/api/imen")
	@GetMapping
	public List<Pokemon> gethello() {
		return testService.gethello();
	}
	
}
