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

import com.webapp.entity.Utilisateur;
import com.webapp.service.IUtilisateurService;

@Controller
@RequestMapping("/utilisateurs")
@CrossOrigin(origins = {"http://localhost:4200"})
public class UtilisateurController {
	
	@Autowired
	private IUtilisateurService utilisateurService;
	
	@GetMapping("/all-utilisateurs")
	public ResponseEntity<List<Utilisateur>> getAllUtilisateur() {
		List<Utilisateur> listeUtilisateur = utilisateurService.getAllUtilisateur();
		
		return new ResponseEntity<List<Utilisateur>>(listeUtilisateur, HttpStatus.OK);
	}
	
	@GetMapping("/id/{id_utilisateur}")
	public ResponseEntity<Utilisateur> getUtilisateurId(@PathVariable("id_utilisateur") Integer utilisateurId) {
		Utilisateur monUtilisateurId = utilisateurService.getUtilisateurById(utilisateurId);
		
		return new ResponseEntity<Utilisateur>(monUtilisateurId, HttpStatus.OK);
	}
	
	
	@GetMapping("/nomUtilisateur/{nom_utilisateur}")
	public ResponseEntity<Utilisateur> getUtilisateurByNom(@PathVariable("nom_utilisateur") String monNom) {
		Utilisateur monUtilisateurNom = utilisateurService.getUtilisateurByNom(monNom);
		
		return new ResponseEntity<Utilisateur>(monUtilisateurNom, HttpStatus.OK);
	}
	
	@PostMapping("/auth-utilisateur")
	public ResponseEntity<Utilisateur> authUtilisateur(@RequestBody Utilisateur utilisateur) {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("ENTERED /auth-utilisateur");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.print("utilisateur.getNomUtilisateur(): ");
		System.out.println(utilisateur.getNomUtilisateur());
		System.out.print("utilisateur.getMotPasse(): ");
		System.out.println(utilisateur.getMotPasse());
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		Utilisateur utilisateurNom = utilisateurService.getUtilisateurByNom(utilisateur.getNomUtilisateur());
		System.out.println("utilisateurNom: " + utilisateurNom.getNomUtilisateur());
		
		if (utilisateurNom != null) {
			System.out.println("PASSWORD: " + utilisateur.getMotPasse());
			
			if (utilisateurNom.getMotPasse().equals(utilisateur.getMotPasse())){
				System.out.println("ENTERED PASSWORD EQUALS!");
				return new ResponseEntity<Utilisateur>(utilisateurNom, HttpStatus.OK);
			}
		}
		
		return new ResponseEntity<Utilisateur>(HttpStatus.UNAUTHORIZED);
	}
	
	@PutMapping("/update-utilisateur")
	public ResponseEntity update(@RequestBody Utilisateur utilisateur) {

		Utilisateur reponseDuServiceProduit = utilisateurService.doUpdate(utilisateur);
		return new ResponseEntity<>(reponseDuServiceProduit, HttpStatus.OK);
	}
	
	/*@GetMapping("/update/{id_utilisateur}/{nom_utilisateur}/{mot_passe}/{droit_utilisation}")
    public ResponseEntity<Utilisateur> update(@PathVariable("id_utilisateur") final Integer idUtilisateur, @PathVariable("nom_utilisateur") final String nomUtilisateur, @PathVariable("mot_passe") final String motPasse,
                                         @PathVariable("droit_utilisation") final Boolean droitUtilisation)
                                         {


		Utilisateur monUtilisateurUpdate = new Utilisateur();
		monUtilisateurUpdate.setIdUtilisateur(idUtilisateur);
		monUtilisateurUpdate.setNomUtilisateur(nomUtilisateur);
		monUtilisateurUpdate.setMotPasse(motPasse);
		monUtilisateurUpdate.setDroitUtilisation(droitUtilisation);

		Utilisateur utilisateur = utilisateurService.doUpdate(monUtilisateurUpdate);

        return new ResponseEntity<>(utilisateur, HttpStatus.OK);

    }*/
	
	
	@PostMapping("/add-utilisateur") 
	public ResponseEntity<Utilisateur> add(@RequestBody Utilisateur utilisateur) {
		Utilisateur reponseDuServiceUtilisateur = utilisateurService.doAdd(utilisateur);
		return new ResponseEntity<>(reponseDuServiceUtilisateur, HttpStatus.OK);
	}

	
	
	/*@GetMapping("/add/{id_utilisateur}/{nom_utilisateur}/{mot_passe}/{droit_utilisation}")
    public ResponseEntity<Utilisateur> add(@PathVariable("id_utilisateur") final Integer idUtilisateur, @PathVariable("nom_utilisateur") final String nomUtilisateur, @PathVariable("mot_passe") final String motPasse,
                                          @PathVariable("droit_utilisation") final Boolean droitUtilisation) {

		Utilisateur monUtilisateurUpdate = new Utilisateur();
		monUtilisateurUpdate.setIdUtilisateur(idUtilisateur);
		monUtilisateurUpdate.setNomUtilisateur(nomUtilisateur);
		monUtilisateurUpdate.setMotPasse(motPasse);
		monUtilisateurUpdate.setDroitUtilisation(droitUtilisation);

		Utilisateur utilisateur = utilisateurService.doUpdate(monUtilisateurUpdate);

        return new ResponseEntity<>(utilisateur, HttpStatus.OK);
    }*/
	
	
	
	@DeleteMapping("/delete-utilisateur")
	public ResponseEntity delete(@RequestBody Utilisateur utilisateur) {
		utilisateurService.doDelete(utilisateur);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}	
	
	
	/*@GetMapping("/delete/id/{id_utilisateur}")
	public ResponseEntity delete(@PathVariable("id_utilisateur") final Integer idUtilisateur) {

		Utilisateur deleteUtilisateur = new Utilisateur();
		deleteUtilisateur.setIdUtilisateur(idUtilisateur);;
		
		utilisateurService.doDelete(deleteUtilisateur);

		return new ResponseEntity<>(HttpStatus.OK);

	}
	*/
	


}
