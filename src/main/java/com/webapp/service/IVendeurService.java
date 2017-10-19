package com.webapp.service;

import java.util.List;

import com.webapp.entity.Vendeur;

public interface IVendeurService {


	List<Vendeur> getAllVendeurs();
	Vendeur getVendeurById(Integer idVendeur);
	Vendeur getUtilisateurById(Integer idUtilisateur);
	Vendeur doAdd(Vendeur monVendeur);
	Vendeur doUpdate(Vendeur monVendeur);
	void doDelete(Vendeur vendeur);
	
	
}
