package com.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.dao.CommandeRepository;
import com.webapp.entity.Commande;

@Service
public class CommandeService implements ICommandeService {

	
	@Autowired
    CommandeRepository commandeRepository;
	
	
	@Override
	public List<Commande> getAllCommande() {
		return commandeRepository.findAll();
	}

	
	@Override
	public Commande getCommandeById(Integer commandeId) {
		
		return commandeRepository.findOne(commandeId);
		
	}

	@Override
	public Commande getCommandeByVendeur(Integer idVendeur) {
		return commandeRepository.findOne(idVendeur);
	}

	@Override
	public Commande getCommandeByClient(Integer idClient) {
		return commandeRepository.findOne(idClient);
	}

	@Override
	public Commande doAdd(Commande maCommande) {
		Commande addCommande = new Commande();

System.out.println("Dans le service de commande dans add");
		addCommande.setIdCommande(maCommande.getIdCommande());
		addCommande.setIdClient(maCommande.getIdClient());
		addCommande.setIdUtilisateur(maCommande.getIdUtilisateur());
	    addCommande.setVenteIdeal(maCommande.getVenteIdeal());
	    addCommande.setVenteTotal(maCommande.getVenteTotal());
	    addCommande.setCommissionType(maCommande.getCommissionType());
	    addCommande.setCommisionMontant(maCommande.getCommisionMontant());
	    addCommande.setAdresse(maCommande.getAdresse());
	    addCommande.setDateVente(maCommande.getDateVente());
	    addCommande.setDateCommission(maCommande.getDateCommission());

	   return commandeRepository.save(addCommande);
	}

	@Override
	public Commande doUpdate(Commande maCommande) {
		Commande updateCommande = new Commande();


		updateCommande.setIdCommande(maCommande.getIdCommande());
		updateCommande.setIdClient(maCommande.getIdClient());
		updateCommande.setIdUtilisateur(maCommande.getIdUtilisateur());
		updateCommande.setVenteIdeal(maCommande.getVenteIdeal());
		updateCommande.setVenteTotal(maCommande.getVenteTotal());
		updateCommande.setCommissionType(maCommande.getCommissionType());
		updateCommande.setCommisionMontant(maCommande.getCommisionMontant());
		updateCommande.setAdresse(maCommande.getAdresse());
		updateCommande.setDateVente(maCommande.getDateVente());
		updateCommande.setDateCommission(maCommande.getDateCommission());

	   return commandeRepository.save(updateCommande);
	}

	@Override
	public void doDelete(Commande commande) {
		Commande deleteCommande = commandeRepository.findOne(commande.getIdCommande());

        commandeRepository.delete(deleteCommande);
		
	}
	
}
