package com.webapp.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.entity.Produit;



@Transactional
@Repository
public class ProduitDAO implements IProduitDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Produit> getAllProduit() {
		String requete = "FROM Produit ORDER BY codeProduit DESC";
		return (List<Produit>) entityManager.createQuery(requete).getResultList();
	}
	
	@Override
	public Produit getProduitById(int codeProduit) {
		return entityManager.find(Produit.class, codeProduit);
	}
	
	@Override
	public void createProduit(Produit produit) {
		entityManager.persist(produit);
	}
	
//	@Override
//	public void createProduitCourt(Produit produit) {
//		entityManager.persist(produit);
//	}
//	
	@Override
	public void updateProduit(Produit produit) {
		Produit p = getProduitById(produit.getCodeProduit());
		p.setUpc(produit.getUpc());
		p.setNomProduit(produit.getNomProduit());
		p.setImage(produit.getImage());
		p.setCategorie(produit.getCategorie());
		p.setTypeUnite(produit.getTypeUnite());
		p.setPrixVendant(produit.getPrixVendant());
		
		entityManager.flush();
	}
	
	@Override
	public void deleteProduit(int codeProduit) {
		entityManager.remove(getProduitById(codeProduit));
	}
	
	@Override
	public boolean produitExist(String upc, String nomProduit, int image, String categorie, String typeUnite, double prixVendant) {
		String requete1 = "FROM produit WHERE upc = ?, nomProduit = ?, image = ?, categorie = ?, typeUnite = ? AND prixVendant = ?";
		int compte = entityManager.createQuery(requete1).setParameter(1, upc)
				.setParameter(2, nomProduit).setParameter(3, image).setParameter(4, categorie)
				.setParameter(5, typeUnite).setParameter(6, prixVendant).getResultList().size();
		
		return compte > 0 ? true : false;
		
	}
	
//	@Override
//	public boolean produitExistCourt(String upc, String nomProduit) {
//		String requete1 = "FROM produit WHERE upc = ? AND nomProduit = ?";
//		int compte = entityManager.createQuery(requete1).setParameter(1, upc)
//				.setParameter(2, nomProduit).getResultList().size();
//		
//		return compte > 0 ? true : false;
//		
//	}
}
