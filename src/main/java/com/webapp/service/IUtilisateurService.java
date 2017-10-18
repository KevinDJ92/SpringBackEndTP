package com.webapp.service;

import java.util.List;

import com.webapp.entity.Utilisateur;

public interface IUtilisateurService {
	
	List<Utilisateur> getAllUtilisateur();
	Utilisateur getUtilisateurById(Integer utilisateurId);
	Utilisateur getUtilisateurByNom(String utilisateurNom);
	Utilisateur doUpdate(Utilisateur monUtilisateur);
	Utilisateur doAdd(Utilisateur monUtilisateur);
	void doDelete(Utilisateur Utilisateur);

}
