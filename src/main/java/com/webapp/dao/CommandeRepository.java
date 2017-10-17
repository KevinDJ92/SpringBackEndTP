package com.webapp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webapp.entity.Commande;

@Repository
public interface CommandeRepository extends CrudRepository<Commande, Integer> {

	List<Commande> findAll();
	Commande findOne(Integer monId);
	<S extends Commande> S save(Commande maCommande);
    void delete(Commande commande);
	
}
