package com.api.condominio.adapter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
	public ResponseEntity<String> get() {
		
		var obj = new JSONObject().put("name", "John");

	    return ResponseEntity.ok().body(obj.toString());
	}
    
}
