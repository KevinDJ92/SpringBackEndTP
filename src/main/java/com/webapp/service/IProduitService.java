package com.webapp.service;

import java.util.List;

import com.webapp.entity.Produit;

public interface IProduitService {

	List<Produit> getAllProduit();

	Produit getProduitById(Integer produitId);

	Produit getProduitByUpc(String monUpc);

	Produit doUpdate(Produit monProduit);

	Produit doAdd(Produit monProduit);

	void doDelete(Produit produit);

	void doDeleteByUpc(Produit produit);

	// void doDelete(int idProduit);
	//
	// void doDeleteByUpc(String upc);
}
