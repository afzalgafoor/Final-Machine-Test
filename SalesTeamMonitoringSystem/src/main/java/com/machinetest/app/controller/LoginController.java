package com.machinetest.app.controller;

import java.util.List;
import java.util.Optional;

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

import com.machinetest.app.model.Login;
import com.machinetest.app.service.ILoginService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	private ILoginService loginService;
	
	@GetMapping("/logins")
	public List<Login> getAllUsers() {
		return (List<Login>) loginService.getAllUsers();
	}

	@GetMapping("/logins/{id}")
	public Optional<Login> getUserById(@PathVariable Integer id) {
		return loginService.getUserById(id);
	}

	@PostMapping("/logins")
	public void addUser(@RequestBody Login user) {
		loginService.addUser(user);

	}

	@PutMapping("/logins")
	public void updateUser(@RequestBody Login user) {
		loginService.updateUser(user);

	}

	@DeleteMapping("/logins/{id}")
	public void deleteUser(@PathVariable Integer id) {
		loginService.deleteUser(id);

	}

	@GetMapping("/login/{username}&{password}")
	public  ResponseEntity<Login> getUserByUserNameAndPassword(@PathVariable String username,@PathVariable String password) {
		
		ResponseEntity<Login> response=null;
		
		Login login=loginService.getUserByUserNameAndPassword(username, password);
		
		if(login==null) {
			response=new ResponseEntity<>(login,HttpStatus.NOT_FOUND);
		}
		else {
			response=new ResponseEntity<>(login,HttpStatus.OK);
		}
		return response;
	}


}