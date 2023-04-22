package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/home")
public class HomeController {
	@GetMapping("/hello")
	public String msg() {
		
		return "Hi Rayudu";
	}

	public ResponseEntity<String> message(){
		
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}
	
}
