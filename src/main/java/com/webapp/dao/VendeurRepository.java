package com.webapp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webapp.entity.Vendeur;

@Repository
public interface VendeurRepository extends CrudRepository<Vendeur, Integer> {


	List<Vendeur> findAll();
	Vendeur findOne(Integer monId);
	Vendeur findByIdUtilisateur(Integer monId);
	<S extends Vendeur> S save(Vendeur maCommande);
    void delete(Vendeur commande);
	
}
