package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Login;
import com.user.entity.Messages;
import com.user.entity.ResponsePage;
import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/userservice")
@CrossOrigin("http://localhost:4200/")
public class UserRestController {

	@Autowired
	private UserService userService;

	@Autowired
	private RestTemplate restTemplate;

	private String base_URI = "http://PROPERTY-SERVICE/propertyservice";

	@GetMapping("/properties")
	public List getAllProperties() {
		String uri = base_URI + "/properties";	
		return restTemplate.getForObject(uri, List.class);
	}

	@GetMapping("/properties/{owner_ownerid}")
	public List getAllPropertiesByOwnerId(@PathVariable(required = true) int owner_ownerid) {
		String uri = base_URI + "/properties/" + owner_ownerid;	
		return restTemplate.getForObject(uri, List.class);
	}


	@PostMapping("/authenticate")
	public ResponseEntity<?> userLogin(@RequestBody Login login) {
		System.out.println(login);
		if(this.userService.validateUser(login)) {
			return ResponseEntity.ok().body(new ResponsePage(Messages.SUCCESS,"Login Success"));
		}
		else {
			return ResponseEntity.badRequest().body(new ResponsePage(Messages.FAILURE,"Login Failed"));
		}
	}

	@GetMapping("/users")
	public ResponseEntity<?> getAllUsers(){
		if(this.userService.getAllUsers() != null) {
			return ResponseEntity.ok().body(HttpStatus.OK);
		}
		return ResponseEntity.badRequest().body(new ResponsePage(Messages.FAILURE,"User fetch failed"));
	}

	@GetMapping("/user/{email}")
	public ResponseEntity<?> getUserByEmail(@PathVariable String email) {
		try {
			User user = this.userService.getUserByEmail(email);
			System.out.println(user);
			return ResponseEntity.ok().body(user);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(new ResponsePage(Messages.FAILURE,"User fetch failed by email"));
		}
	}

	@PutMapping("/user")
	public ResponseEntity<?> updateUser(@RequestBody User user){
		if(this.userService.updateUser(user)) {
			return ResponseEntity.ok().body(HttpStatus.OK);
		}
		else {
			return ResponseEntity.badRequest().body(new ResponsePage(Messages.FAILURE,"User update failed"));
		}
	}

	@PostMapping("/user")
	public ResponseEntity<?> registerNewUser(@RequestBody User user) {
		if(this.userService.insertUser(user)) {
			System.out.println(user);
			return ResponseEntity.ok().body(new ResponsePage(Messages.SUCCESS,"Registration successfull"));
		}
		else {
			return ResponseEntity.badRequest().body(new ResponsePage(Messages.FAILURE,"Registration failed"));
		}
	}

	@DeleteMapping("/user/{email}")
	public ResponseEntity<?> deleteUser(@PathVariable String email) throws Exception{
		if(this.userService.deleteByEmail(email)) {
			return ResponseEntity.ok().body(HttpStatus.OK);
		}
		return ResponseEntity.badRequest().body(new ResponsePage(Messages.FAILURE,"Registration failed"));
	}
}

