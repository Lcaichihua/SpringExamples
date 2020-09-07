package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/base/api")
public class baseController {
	
	public Map<String, Object> init() {
	Map<String, Object> params = new HashMap<>();
	params.put("nombre", "Larry");
	params.put("apellido","Caichihua");	
	
	return params ;}

}
