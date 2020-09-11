package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class baseController {
	
	
	/*
	public Map<String, Object> init() { 
		//demo
	Map<String, Object> params = new HashMap<>();
	params.put("nombre", "Larry");
	params.put("apellido","Caichihua");	
	
	return params ;} */
	@RequestMapping(value = "/")
	public String hola() {
		
		return "hola mundi ";
	}

}
