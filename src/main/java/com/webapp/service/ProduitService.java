package com.webapp.service;
import com.webapp.dao.ProduitRepository;
import com.webapp.entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProduitService implements IProduitService {

   
    @Autowired
    ProduitRepository produitRepository;

    @Override
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    }

 
    @Override
    public Produit getProduitById(Integer produitId) {
    	return produitRepository.findOne(produitId);
    }
    
    @Override
    public Produit getProduitByUpc(String monUpc) {
    	return produitRepository.findByUpc(monUpc);
    }

    @Override 
    public Produit doUpdate(Produit monProduit) {
    	return produitRepository.save(monProduit);
    }
    
}