package com.webapp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webapp.entity.Produit;

public interface IProduitDAO {
	
	List<Produit> getAllProduit();
	Produit getProduitById(int codeProduit);
	void createProduit(Produit produit);
//	void createProduitCourt(Produit produit);
	void updateProduit(Produit produit);
	void deleteProduit(int codeProduit);
	
	@Repository
	public interface ProduitRepository extends CrudRepository<Produit, Integer> {
	    
	}
	
	
	boolean produitExist(String upc, String nomProduit, int image, String categorie, String typeUnite, double prixVendant);
//	boolean produitExistCourt(String upc, String nomProduit);

}
