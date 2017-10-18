package com.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Produit")
public class Produit {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_produit")
    private Integer idProduit;

    @Column(name = "upc")
    private String upc;

    @Column(name = "nom_produit")
    private String nomProduit;
    
    @Column(name = "image")
    private String image;

    @Column(name = "categorie")
    private String categorie;

    @Column(name = "code_unit")
    private Integer codeUnit;

    @Column(name = "prix_vendant")
    private Double prixVendant;

    @Column(name = "prix_achat")
    private Double prixAchat;
	
	@Column(name = "quantite")
	private Integer quantite;
	
	@Column(name = "description")
	private String description;

	public Integer getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public Integer getCodeUnit() {
		return codeUnit;
	}

	public void setCodeUnit(Integer codeUnit) {
		this.codeUnit = codeUnit;
	}

	public Double getPrixVendant() {
		return prixVendant;
	}

	public void setPrixVendant(Double prixVendant) {
		this.prixVendant = prixVendant;
	}

	public Double getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(Double prixAchat) {
		this.prixAchat = prixAchat;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
