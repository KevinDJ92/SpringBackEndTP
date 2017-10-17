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

import com.webapp.entity.Commande;
import com.webapp.service.ICommandeService;

@Controller
@RequestMapping("/commandes")
@CrossOrigin(origins = {"http://localhost:8080"})
public class CommandeController {

	@Autowired
	private ICommandeService commandeService;
	
	@GetMapping("/all-commandes")
	public ResponseEntity<List<Commande>> getAllCommande() {
		List<Commande> listeCommandes = commandeService.getAllCommande();
		
		return new ResponseEntity<List<Commande>>(listeCommandes, HttpStatus.OK);
	}
	
	
	@GetMapping("/idCommande/{id_commande}")
	public ResponseEntity<Commande> getCommandeId(@PathVariable("id_commande") Integer idCommande) {
		Commande monIdCommande = commandeService.getCommandeById(idCommande);
		
		return new ResponseEntity<Commande>(monIdCommande,HttpStatus.OK);
	}
	
	@GetMapping("/idUtilisateur/{id_utilisateur}")
	public ResponseEntity<List<Commande>> getCommandeByUtilisateur(@PathVariable("id_utilisateur") Integer idUtilisateur) {
		List<Commande> listeVentesUtilisateur = commandeService.getCommandeByVendeur(idUtilisateur);
		
		return new ResponseEntity<List<Commande>>(listeVentesUtilisateur, HttpStatus.OK);
	}
	
	@GetMapping("idClient/{id_client}")
	public ResponseEntity<List<Commande>> getCommandeByClient(@PathVariable("id_client") Integer idClient) {
		List<Commande> maCommandeClient = commandeService.getCommandeByClient(idClient);
		
		return new ResponseEntity<List<Commande>>(maCommandeClient,HttpStatus.OK);
	}
	
	@PutMapping("/update-commande")
	public ResponseEntity update(@RequestBody Commande commande) {
		Commande reponseServiceCommande = commandeService.doUpdate(commande);
		
		return new ResponseEntity<>(reponseServiceCommande,HttpStatus.OK);
	}

	@PostMapping("/add-commande")
	public ResponseEntity<Commande> add(@RequestBody Commande commande) {
		Commande reponseServiceCommande = commandeService.doAdd(commande);
		
		return new ResponseEntity<>(reponseServiceCommande,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete-commande")
	public ResponseEntity delete(@RequestBody Commande commande) {
		commandeService.doDelete(commande);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
