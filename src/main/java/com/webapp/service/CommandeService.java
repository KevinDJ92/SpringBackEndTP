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
		addCommande.setId_commande(maCommande.getId_commande());
		addCommande.setId_client(maCommande.getId_client());
		addCommande.setId_utilisateur(maCommande.getId_utilisateur());
	    addCommande.setVente_ideal(maCommande.getVente_ideal());
	    addCommande.setVente_total(maCommande.getVente_total());
	    addCommande.setCommission_type(maCommande.getCommission_type());
	    addCommande.setCommision_montant(maCommande.getCommision_montant());
	    addCommande.setAdresse(maCommande.getAdresse());
	    addCommande.setDate_vente(maCommande.getDate_vente());
	    addCommande.setDate_commission(maCommande.getDate_commission());

	   return commandeRepository.save(addCommande);
	}

	@Override
	public Commande doUpdate(Commande maCommande) {
		Commande updateCommande = new Commande();


		updateCommande.setId_commande(maCommande.getId_commande());
		updateCommande.setId_client(maCommande.getId_client());
		updateCommande.setId_utilisateur(maCommande.getId_utilisateur());
		updateCommande.setVente_ideal(maCommande.getVente_ideal());
		updateCommande.setVente_total(maCommande.getVente_total());
		updateCommande.setCommission_type(maCommande.getCommission_type());
		updateCommande.setCommision_montant(maCommande.getCommision_montant());
		updateCommande.setAdresse(maCommande.getAdresse());
		updateCommande.setDate_vente(maCommande.getDate_vente());
		updateCommande.setDate_commission(maCommande.getDate_commission());

	   return commandeRepository.save(updateCommande);
	}

	@Override
	public void doDelete(Commande commande) {
		Commande deleteCommande = commandeRepository.findOne(commande.getId_commande());

        commandeRepository.delete(deleteCommande);
		
	}
	
}
