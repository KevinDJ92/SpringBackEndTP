package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.entity.Vendeur;
import com.webapp.service.IVendeurService;

@Controller
@RequestMapping("/vendeurs")
@CrossOrigin(origins = {"*"})
public class VendeurController {

	@Autowired
	private IVendeurService vendeurService;
	
	@GetMapping("/all-vendeurs")
	public ResponseEntity<List<Vendeur>> getAllVendeur() {
		List<Vendeur> listeVendeurs = vendeurService.getAllVendeurs();
		
		return new ResponseEntity<List<Vendeur>>(listeVendeurs, HttpStatus.OK);
	}
	
	@GetMapping("/idVendeur/{id_vendeur}")
	public ResponseEntity<Vendeur> getVendeurById(@PathVariable("id_vendeur") Integer idVendeur) {
		Vendeur unVendeur = vendeurService.getVendeurById(idVendeur);
		
		return new ResponseEntity<Vendeur>(unVendeur, HttpStatus.OK);
	}
	
	@GetMapping("/idUtilisateur/{id_utilisateur}")
	public ResponseEntity<Vendeur> getVendeurByUtilisateur(@PathVariable("id_utilisateur") Integer idUtilisateur) {
		Vendeur listeUtilisateur = vendeurService.getUtilisateurById(idUtilisateur);
		
		return new ResponseEntity<Vendeur>(listeUtilisateur, HttpStatus.OK);
	}

	@PostMapping("/add-vendeur" )
	public ResponseEntity<Vendeur> add(@RequestBody Vendeur vendeur) {
		
		Vendeur reponseServiceVendeur = vendeurService.doAdd(vendeur);
		
		return new ResponseEntity<>(reponseServiceVendeur,HttpStatus.OK);
	}
	
	@PutMapping("/update-vendeur")
	public ResponseEntity update(@RequestBody Vendeur vendeur) {
		Vendeur reponseServiceVendeur = vendeurService.doUpdate(vendeur);
		
		return new ResponseEntity<>(reponseServiceVendeur,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete-vendeur")
	public ResponseEntity delete(@RequestBody Vendeur vendeur) {
		vendeurService.doDelete(vendeur);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	
}
