package com.webapp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webapp.entity.Commande;

@Repository
public interface CommandeRepository extends CrudRepository<Commande, Integer> {

	List<Commande> findAll();
	Commande findId(Integer commandeId);
	List<Commande> findIdUtilisateur(Integer idUtilisateur);
	List<Commande> findIdClient(Integer idClient);
	<S extends Commande> S save(Commande maCommande);
    void delete(Commande commande);
	
}
