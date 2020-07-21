package com.opvx.BasicBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
	
	@RequestMapping("/")
	public String index() {
		return "Olá Vitor";
	}

}
