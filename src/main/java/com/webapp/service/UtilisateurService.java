package com.webapp.service;
import com.webapp.dao.ProduitRepository;
import com.webapp.dao.UtilisateurRepository;
import com.webapp.entity.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UtilisateurService implements IUtilisateurService{
	
	@Autowired
	UtilisateurRepository utilisateurRepository; 
	
	
	@Override
	public List<Utilisateur> getAllUtilisateur() {
		return utilisateurRepository.findAll();
		
	}

	@Override
	public Utilisateur getUtilisateurById(Integer utilisateurId) {
		return utilisateurRepository.findOne(utilisateurId);
	}

	@Override
	public Utilisateur getUtilisateurByNom(String nomUtilisateur) {
		System.out.println("nomUtilisateur: " + nomUtilisateur);
		
		return utilisateurRepository.findByNomUtilisateur(nomUtilisateur);
	}

	@Override
	public Utilisateur doUpdate(Utilisateur monUtilisateur) {
		Utilisateur updateUtilisateur = utilisateurRepository.findOne(monUtilisateur.getIdUtilisateur());
		
		updateUtilisateur.setNomUtilisateur(monUtilisateur.getNomUtilisateur());
		updateUtilisateur.setMotPasse(monUtilisateur.getMotPasse());
		updateUtilisateur.setDroitUtilisation(monUtilisateur.getDroitUtilisation());
		
		 return utilisateurRepository.save(updateUtilisateur);
				
	}

	@Override
	public Utilisateur doAdd(Utilisateur monUtilisateur) {
		Utilisateur addUtilisateur = new Utilisateur() ;
		
		addUtilisateur.setNomUtilisateur(monUtilisateur.getNomUtilisateur());
		addUtilisateur.setMotPasse(monUtilisateur.getMotPasse());
		addUtilisateur.setDroitUtilisation(monUtilisateur.getDroitUtilisation());
				
		return utilisateurRepository.save(addUtilisateur);
	}

	@Override
	public void doDelete(Utilisateur Utilisateur) {
		Utilisateur deleteUtilisateur = utilisateurRepository.findOne(Utilisateur.getIdUtilisateur());
		
		utilisateurRepository.delete(deleteUtilisateur);
	
	}
	
	
	

}
