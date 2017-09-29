package com.webapp.service;

import java.util.List;

import com.webapp.entity.Produit;

public interface IProduitService {

	List<Produit> getAllProduit();
	Produit getProduitById(int idProduit);
	boolean createProduit(Produit produit);
//	boolean createProduitCourt(Produit produit);
	void updateProduit(Produit produit);
	void deleteProduit(int idProduit);
	
}
