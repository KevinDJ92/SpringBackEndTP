package com.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.dao.SystemeRepository;
import com.webapp.entity.Produit;
import com.webapp.entity.Systeme;

@Service
public class SystemeService implements ISystemeService {

	@Autowired
	SystemeRepository systemeRepository;

	@Override
	public List<Systeme> getAllSysteme() {
		return systemeRepository.findAll();
	}

	@Override
	public Systeme getSystemeById(Integer systemeId) {
		return systemeRepository.findOne(systemeId);
	}

	@Override
	public Systeme getSystemeByNom(String nomSysteme) {
		return systemeRepository.findByNom(nomSysteme);
	}

	@Override
	public Systeme doUpdate(Systeme monSysteme) {

		Systeme updateSysteme = systemeRepository.findOne(monSysteme.getIdSysteme());

		updateSysteme.setNom(monSysteme.getNom());
		updateSysteme.setAdresse(monSysteme.getAdresse());
		updateSysteme.setLogo(monSysteme.getLogo());
		updateSysteme.setDroitUtilisation(monSysteme.getDroitUtilisation());

		return systemeRepository.save(updateSysteme);
	}

	@Override
	public Systeme doAdd(Systeme monSysteme) {

		Systeme addSysteme = new Systeme();

		addSysteme.setNom(monSysteme.getNom());
		addSysteme.setAdresse(monSysteme.getAdresse());
		addSysteme.setLogo(monSysteme.getLogo());
		addSysteme.setDroitUtilisation(monSysteme.getDroitUtilisation());

		return systemeRepository.save(addSysteme);
	}

	@Override
	public void doDelete(Systeme monSysteme) {

		Systeme deleteSysteme = systemeRepository.findOne(monSysteme.getIdSysteme());

		systemeRepository.delete(deleteSysteme);
	}

	@Override
	public void doDeleteByNom(Systeme monSysteme) {

		Systeme deleteProduitByNom = systemeRepository.findByNom(monSysteme.getNom());

		systemeRepository.delete(deleteProduitByNom);
	}

}
