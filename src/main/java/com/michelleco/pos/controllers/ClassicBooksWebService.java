package com.michelleco.pos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michelleco.pos.services.SpringClassicBookService;

@RestController
public class ClassicBooksWebService {
	
	@Autowired 
	private SpringClassicBookService classicBookService; 
	
	@GetMapping("/classicbooks")
	public String getMessage() {
		return classicBookService.nameClassicBooks();
	}

}
