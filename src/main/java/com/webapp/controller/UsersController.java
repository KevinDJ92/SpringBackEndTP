package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

import com.webapp.entity.Users;
import com.webapp.service.IUsersService;

@Controller
@RequestMapping("users")
@CrossOrigin(origins = {"http://localhost:4200"})
public class UsersController {
	
	@Autowired
	private IUsersService usersService;
	
	@GetMapping("user")
	public ResponseEntity<Users> getUserById(@RequestParam("id") String id) {
		Users users = usersService.getUserById(Integer.parseInt(id));
		
		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}
	
	@GetMapping("all-users")
	public ResponseEntity<List<Users>> getAllUsers() {
		List<Users> listUsers = usersService.getAllUsers();
		
		return new ResponseEntity<List<Users>>(listUsers, HttpStatus.OK);
	}
	
	@PostMapping("user")
	public ResponseEntity<Void> createArticle(@RequestBody Users user, UriComponentsBuilder builder) {
		boolean flag = usersService.createUser(user);
		if (flag == false) {
		     return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/user?id={id}").buildAndExpand(user.getId_user()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@PutMapping("user")
	public ResponseEntity<Users> updateUser(@RequestBody Users user) {
		usersService.updateUser(user);
		return new ResponseEntity<Users>(user, HttpStatus.OK);
	}
	
	@DeleteMapping("user")
	public ResponseEntity<Void> deleteUser(@RequestParam("id") String id) {
		usersService.deleteUser(Integer.parseInt(id)); 
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	
}
