package com.webapp.service;

import java.util.List;

import javax.xml.ws.WebServiceClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.dao.VendeurRepository;
import com.webapp.entity.Vendeur;

@Service
public class VendeurService implements IVendeurService {

	@Autowired
	VendeurRepository vendeurRepository;

	@Override
	public List<Vendeur> getAllVendeurs() {
		return vendeurRepository.findAll();
		
	}
	
	@Override
	public Vendeur getVendeurById(Integer idVendeur) {
		return vendeurRepository.findOne(idVendeur);
	}

	@Override
	public Vendeur getUtilisateurById(Integer idUtilisateur) {
		return vendeurRepository.findByIdUtilisateur(idUtilisateur);
	}

	@Override
	public Vendeur doAdd(Vendeur monVendeur) {
		Vendeur addVendeur = new Vendeur();
		addVendeur.setIdVendeur(monVendeur.getIdVendeur());
		addVendeur.setIdUtilisateur(monVendeur.getIdUtilisateur());
		addVendeur.setTaux(monVendeur.getTaux());
		addVendeur.setTypeCommission(monVendeur.getTypeCommission());
		addVendeur.setMinVentes(monVendeur.getMinVentes());
		return vendeurRepository.save(addVendeur);
		
	}

	@Override
	public Vendeur doUpdate(Vendeur monVendeur) {
	
		Vendeur updateVendeur = new Vendeur();
		
		updateVendeur.setIdVendeur(monVendeur.getIdVendeur());
		updateVendeur.setIdUtilisateur(monVendeur.getIdUtilisateur());
		updateVendeur.setTaux(monVendeur.getTaux());
		updateVendeur.setTypeCommission(monVendeur.getTypeCommission());
		updateVendeur.setMinVentes(monVendeur.getMinVentes());
		return vendeurRepository.save(updateVendeur);
		
	}

	@Override
	public void doDelete(Vendeur vendeur) {
		Vendeur deleteVendeur = vendeurRepository.findOne(vendeur.getIdVendeur());

        vendeurRepository.delete(vendeur);
	}

	
}
