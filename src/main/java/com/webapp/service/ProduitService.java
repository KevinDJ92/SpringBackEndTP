package com.webapp.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.dao.IProduitDAO;
import com.webapp.dao.IProduitDAO.ProduitRepository;
import com.webapp.entity.Produit;


@Service
public class ProduitService implements IProduitService {

    @Autowired
    IProduitDAO produitDAO;

    @Autowired
    ProduitRepository produitRepository;

    @Override
    public List<Produit> getAllProduit() {
        List<Produit> list = new ArrayList<Produit>();
        for (Produit item : produitRepository.findAll()) {
            list.add(item);
        }
        return list;
    }

    @Override
    public Produit getProduitById(int codeProduit) {
        Produit prod = produitDAO.getProduitById(codeProduit);
        return prod;
    }

    @Override
    public synchronized boolean createProduit(Produit produit) {
        if (produitDAO.produitExist(produit.getUpc(), produit.getNomProduit(), produit.getImage(), produit.getCategorie(), produit.getTypeUnite(), produit.getPrixVendant())) {
            return false;
        } else {
            produitDAO.createProduit(produit);
            return true;
        }
    }

//	@Override
//	public synchronized boolean createProduitCourt(Produit produit) {
//		if(produitDAO.produitExistCourt(produit.getUpc(), produit.getNomProduit())) {
//			return false;
//		} else {
//			produitDAO.createProduitCourt(produit);
//			return true;
//		}
//	}

    @Override
    public void updateProduit(Produit produit) {
        produitDAO.updateProduit(produit);
    }

    @Override

    public void deleteProduit(int codeProduit) {
        produitDAO.deleteProduit(codeProduit);
    }

}