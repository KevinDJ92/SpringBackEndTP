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
    private String nom_produit;

    @Column(name = "image")
    private String image;

    @Column(name = "categorie")
    private String categorie;

    @Column(name = "code_unit")
    private Integer code_unit;

    @Column(name = "prix_vendant")
    private Double prix_vendant;

    @Column(name = "prix_achat")
    private Double prix_achat;
	
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

	public String getNom_produit() {
		return nom_produit;
	}

	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
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

	public Integer getCode_unit() {
		return code_unit;
	}

	public void setCode_unit(Integer code_unit) {
		this.code_unit = code_unit;
	}

	public Double getPrix_vendant() {
		return prix_vendant;
	}

	public void setPrix_vendant(Double prix_vendant) {
		this.prix_vendant = prix_vendant;
	}

	public Double getPrix_achat() {
		return prix_achat;
	}

	public void setPrix_achat(Double prix_achat) {
		this.prix_achat = prix_achat;
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
