package com.webapp.service;

import java.util.List;

import com.webapp.entity.Commande;

public interface ICommandeService {

	List<Commande> getAllCommande();
	Commande getCommandeById(Integer commandeId);
	Commande getCommandeByVendeur(Integer idUtilisateur);
	Commande getCommandeByClient(Integer idClient);
	Commande doAdd(Commande monCommande);
	Commande doUpdate(Commande monCommande);
	void doDelete(Commande commandeId);
	
}
