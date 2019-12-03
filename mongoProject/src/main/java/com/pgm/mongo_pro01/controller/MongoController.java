package com.pgm.mongo_pro01.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.pgm.mongo_pro01.service.MongoService;

@Controller
public class MongoController {
	@Inject
	MongoService service;
	
	@GetMapping("/input")
	public String input() {
		return "input";
	}
	
	
}
