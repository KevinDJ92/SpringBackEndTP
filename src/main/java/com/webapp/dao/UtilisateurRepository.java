package com.webapp.dao;

import com.webapp.entity.Utilisateur;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer> {
	List<Utilisateur> findAll();

	Utilisateur findOne(Integer UtilisateurId);

	Utilisateur findByNomUtilisateur(String monNom);

	<S extends Utilisateur> S save(Utilisateur monUtilisateur);

	void delete(Utilisateur Utilisateur);
}
