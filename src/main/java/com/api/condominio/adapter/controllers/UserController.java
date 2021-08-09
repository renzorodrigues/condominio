package com.api.condominio.adapter.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.condominio.core.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
	public ResponseEntity<User> get() {
		
		var obj = new User();
		obj.name = "John";

	    return ResponseEntity.ok().body(obj);
	}
    
}
