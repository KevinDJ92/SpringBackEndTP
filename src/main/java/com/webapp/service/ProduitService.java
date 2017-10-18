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


        Produit updateProduit = produitRepository.findOne(monProduit.getIdProduit());


        updateProduit.setUpc(monProduit.getUpc());
        updateProduit.setNomProduit(monProduit.getNomProduit());
        updateProduit.setImage(monProduit.getImage());
        updateProduit.setCategorie(monProduit.getCategorie());
        updateProduit.setCodeUnit(monProduit.getCodeUnit());
        updateProduit.setPrixVendant(monProduit.getPrixVendant());
        updateProduit.setPrixAchat(monProduit.getPrixAchat());
        updateProduit.setQuantite(monProduit.getQuantite());
        updateProduit.setDescription(monProduit.getDescription());

        return produitRepository.save(updateProduit);
    }
    
    @Override
    public Produit doAdd(Produit monProduit) {


        Produit addProduit = new Produit();


        addProduit.setUpc(monProduit.getUpc());
        addProduit.setNomProduit(monProduit.getNomProduit());
        addProduit.setImage(monProduit.getImage());
        addProduit.setCategorie(monProduit.getCategorie());
        addProduit.setCodeUnit(monProduit.getCodeUnit());
        addProduit.setPrixVendant(monProduit.getPrixVendant());
        addProduit.setPrixAchat(monProduit.getPrixAchat());
        addProduit.setQuantite(monProduit.getQuantite());
        addProduit.setDescription(monProduit.getDescription());

        return produitRepository.save(addProduit);
    }
    
    @Override
    public void doDelete(Produit monProduit) {


    	Produit deleteProduit = produitRepository.findOne(monProduit.getIdProduit());

         produitRepository.delete(deleteProduit);
    }
    
    @Override
    public void doDeleteByUpc(Produit monProduit) {


    	Produit deleteProduitByUpc = produitRepository.findByUpc(monProduit.getUpc());

         produitRepository.delete(deleteProduitByUpc);
    }
}