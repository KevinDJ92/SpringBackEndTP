package com.webapp.dao;

import com.webapp.entity.Produit;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Integer> {

	List<Produit> findAll();

	Produit findOne(Integer produitId);

	Produit findByUpc(String monUpc);

	<S extends Produit> S save(Produit monProduit);

	void delete(Produit produit);

}