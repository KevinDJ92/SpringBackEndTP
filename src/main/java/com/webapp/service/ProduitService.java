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
        updateProduit.setNom_produit(monProduit.getNom_produit());
        updateProduit.setImage(monProduit.getImage());
        updateProduit.setCategorie(monProduit.getCategorie());
        updateProduit.setCode_unit(monProduit.getCode_unit());
        updateProduit.setPrix_vendant(monProduit.getPrix_vendant());
        updateProduit.setPrix_achat(monProduit.getPrix_achat());
        updateProduit.setQuantite(monProduit.getQuantite());
        updateProduit.setDescription(monProduit.getDescription());

        return produitRepository.save(updateProduit);
    }
    
    @Override
    public Produit doAdd(Produit monProduit) {


        Produit addProduit = new Produit();


        addProduit.setUpc(monProduit.getUpc());
        addProduit.setNom_produit(monProduit.getNom_produit());
        addProduit.setImage(monProduit.getImage());
        addProduit.setCategorie(monProduit.getCategorie());
        addProduit.setCode_unit(monProduit.getCode_unit());
        addProduit.setPrix_vendant(monProduit.getPrix_vendant());
        addProduit.setPrix_achat(monProduit.getPrix_achat());
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