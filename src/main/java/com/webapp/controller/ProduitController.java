package com.webapp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.dao.ProduitRepository;
import com.webapp.entity.Produit;
import com.webapp.service.IProduitService;



@Controller
@RequestMapping("/produits")
@CrossOrigin(origins = {"http://localhost:4200"})

public class ProduitController {
	
	@Autowired
	private IProduitService produitService;
	
//	@GetMapping("/produit")
//	public ResponseEntity<Produit> getProduitById(@RequestParam("codeProduit") String codeProduit) {
//		Produit produit = produitService.getProduitById(Integer.parseInt(codeProduit));
//		
//		return new ResponseEntity<Produit>(produit,HttpStatus.OK);
//	}
	
	
	@GetMapping("/all-produits")
	public ResponseEntity<List<Produit>> getAllProduit() {
		List<Produit> listeProduit = produitService.getAllProduit();
		
		return new ResponseEntity<List<Produit>>(listeProduit, HttpStatus.OK);
		
	}
	
	@GetMapping("/id/{id_produit}")
	public ResponseEntity<Produit> getProduitId(@PathVariable("id_produit") Integer produitId) {
		Produit monProduitId = produitService.getProduitById(produitId);
		
		return new ResponseEntity<Produit>(monProduitId, HttpStatus.OK);
	}
	
	@GetMapping("/upc/{upc}")
	public ResponseEntity<Produit> getProduitUpc(@PathVariable("upc") String monUpc) {
		Produit monProduitUpc = produitService.getProduitByUpc(monUpc);
		
		return new ResponseEntity<Produit>(monProduitUpc, HttpStatus.OK);
	}
	
	@GetMapping("/update/{id_produit}/{upc}/{nom_produit}/{image}/{categorie}/{code_unit}/{prix_vendant}/{prix_achat}/{quantite}/{description}")
    public ResponseEntity<Produit> update(@PathVariable("id_produit") final Integer idProduit, @PathVariable("upc") final String monUpc, @PathVariable("nom_produit") final String nomProduit,
                                          @PathVariable("image") final String monImage, @PathVariable("categorie") final String maCategorie, @PathVariable("code_unit") final Integer monCodeUnit,
                                          @PathVariable("prix_vendant") final Double monPrixVendant, @PathVariable("prix_achat") final Double monPrixAchat, @PathVariable("quantite") final Integer maQuantite,
                                          @PathVariable("description") final String maDescription) {


        Produit monProduitUpdate = new Produit();
        monProduitUpdate.setIdProduit(idProduit);
        monProduitUpdate.setUpc(monUpc);
        monProduitUpdate.setNomProduit(nomProduit);
        monProduitUpdate.setImage(monImage);
        monProduitUpdate.setCategorie(maCategorie);
        monProduitUpdate.setCodeUnit(monCodeUnit);
        monProduitUpdate.setPrixVendant(monPrixVendant);
        monProduitUpdate.setPrix_achat(monPrixAchat);
        monProduitUpdate.setQuantite(maQuantite);
        monProduitUpdate.setDescription(maDescription);

        Produit produit = produitService.doUpdate(monProduitUpdate);

        return new ResponseEntity<>(produit, HttpStatus.OK);

    }
	
	@GetMapping("/add/{id_produit}/{upc}/{nom_produit}/{image}/{categorie}/{code_unit}/{prix_vendant}/{prix_achat}/{quantite}/{description}")
    public ResponseEntity<Produit> add(@PathVariable("id_produit") final Integer idProduit, @PathVariable("upc") final String monUpc, @PathVariable("nom_produit") final String nomProduit,
                                          @PathVariable("image") final String monImage, @PathVariable("categorie") final String maCategorie, @PathVariable("code_unit") final Integer monCodeUnit,
                                          @PathVariable("prix_vendant") final Double monPrixVendant, @PathVariable("prix_achat") final Double monPrixAchat, @PathVariable("quantite") final Integer maQuantite,
                                          @PathVariable("description") final String maDescription) {


        Produit monProduitAdd = new Produit();
        monProduitAdd.setIdProduit(idProduit);
        monProduitAdd.setUpc(monUpc);
        monProduitAdd.setNomProduit(nomProduit);
        monProduitAdd.setImage(monImage);
        monProduitAdd.setCategorie(maCategorie);
        monProduitAdd.setCodeUnit(monCodeUnit);
        monProduitAdd.setPrixVendant(monPrixVendant);
        monProduitAdd.setPrix_achat(monPrixAchat);
        monProduitAdd.setQuantite(maQuantite);
        monProduitAdd.setDescription(maDescription);

        Produit produit = produitService.doAdd(monProduitAdd);

        return new ResponseEntity<>(produit, HttpStatus.OK);

    }
	
	@GetMapping("/delete/id/{id_produit}")
	public ResponseEntity delete(@PathVariable("id_produit") final Integer idProduit) {

		Produit deleteProduit = new Produit();
		deleteProduit.setIdProduit(idProduit);
		
		produitService.doDelete(deleteProduit);

		return new ResponseEntity<>(HttpStatus.OK);

	}
	
	@GetMapping("/delete/upc/{upc}")
	public ResponseEntity deleteByUpc(@PathVariable("upc") final String monUpc) {

		Produit deleteProduitUpc = new Produit();
		deleteProduitUpc.setUpc(monUpc);
		
		produitService.doDeleteByUpc(deleteProduitUpc);

		return new ResponseEntity<>(HttpStatus.OK);

	}
	
//	public List<Produit> getId(@PathVariable("id") final Integer produitId) {
//		return produitService.getProduitById(produitId);
	
	
//	@PostMapping("/create")
//	public ResponseEntity<Void> createArticle(@RequestBody Produit produit, UriComponentsBuilder builder) {
//		boolean flag = produitService.createProduit(produit);
//		if(flag == false) {
//			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//		}
//		HttpHeaders headers = new HttpHeaders();
//		headers.setLocation(builder.path("/produit?codeProduit={codeProduit}").buildAndExpand(produit.getCodeProduit()).toUri());
//		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
//	}
////	
////	@PostMapping("/produit")
////	public ResponseEntity<Void> createArticleCourt(@RequestBody Produit produit, UriComponentsBuilder builder) {
////		boolean flag = produitService.createProduitCourt(produit);
////		if(flag == false) {
////			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
////		}
////		HttpHeaders headers = new HttpHeaders();
////		headers.setLocation(builder.path("/produit?codeProduit={codeProduit}").buildAndExpand(produit.getCodeProduit()).toUri());
////		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
////	}
//	 
//	@PutMapping("/update") 
//	public ResponseEntity<Produit> updateProduit(@RequestBody Produit produit) {
//		produitService.updateProduit(produit);
//		return new ResponseEntity<Produit>(produit, HttpStatus.OK);
//	}
//	
//	@DeleteMapping("/delete")
//	public ResponseEntity<Void> deleteProduit(@RequestParam("codeProduit") String codeProduit) {
//		produitService.deleteProduit(Integer.parseInt(codeProduit));
//		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//	}
	}
