package com.example.FirstSpringSecurity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		return new ResponseEntity<String>("Welcome to masai app Security", HttpStatus.ACCEPTED);
	}
	@GetMapping("/welcomep")
   public ResponseEntity<String> welcomep(){

		return new ResponseEntity<>("Welcome to masai app with security",HttpStatus.ACCEPTED);
   }
   @GetMapping("/admin")
   public ResponseEntity<String>  admin(){
		return new ResponseEntity<>("welcome to masai app for admin", HttpStatus.ACCEPTED);
   }
}
