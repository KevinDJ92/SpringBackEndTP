package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.entity.Client;
import com.webapp.service.IClientService;

@Controller
@RequestMapping("/clients")
@CrossOrigin(origins = {"http://localhost:4200"})

public class ClientController {

	@Autowired
	private IClientService clientService;
	
	@GetMapping("/all-clients")
	public ResponseEntity<List<Client>> getAllClient() {
		List<Client> listeClient = clientService.getAllClient();
		
		return new ResponseEntity<List<Client>>(listeClient, HttpStatus.OK);
	}
}
