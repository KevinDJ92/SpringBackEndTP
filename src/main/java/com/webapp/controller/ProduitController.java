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

import com.webapp.entity.Produit;
import com.webapp.service.IProduitService;



@Controller
@RequestMapping("/produits")
@CrossOrigin(origins = {"http://localhost:4200"})

public class ProduitController {
	
	@Autowired
	private IProduitService produitService;
	
	@GetMapping("/produit")
	public ResponseEntity<Produit> getProduitById(@RequestParam("codeProduit") String codeProduit) {
		Produit produit = produitService.getProduitById(Integer.parseInt(codeProduit));
		
		return new ResponseEntity<Produit>(produit,HttpStatus.OK);
	}
	
	
	@GetMapping("/all-produits")
	public ResponseEntity<List<Produit>> getAllProduit() {
		List<Produit> listeProduit = produitService.getAllProduit();
		
		return new ResponseEntity<List<Produit>>(listeProduit, HttpStatus.OK);
		
	}
	
	@PostMapping("/create")
	public ResponseEntity<Void> createArticle(@RequestBody Produit produit, UriComponentsBuilder builder) {
		boolean flag = produitService.createProduit(produit);
		if(flag == false) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/produit?codeProduit={codeProduit}").buildAndExpand(produit.getCodeProduit()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
//	
//	@PostMapping("/produit")
//	public ResponseEntity<Void> createArticleCourt(@RequestBody Produit produit, UriComponentsBuilder builder) {
//		boolean flag = produitService.createProduitCourt(produit);
//		if(flag == false) {
//			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//		}
//		HttpHeaders headers = new HttpHeaders();
//		headers.setLocation(builder.path("/produit?codeProduit={codeProduit}").buildAndExpand(produit.getCodeProduit()).toUri());
//		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
//	}
	 
	@PutMapping("/update") 
	public ResponseEntity<Produit> updateProduit(@RequestBody Produit produit) {
		produitService.updateProduit(produit);
		return new ResponseEntity<Produit>(produit, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Void> deleteProduit(@RequestParam("codeProduit") String codeProduit) {
		produitService.deleteProduit(Integer.parseInt(codeProduit));
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	}
