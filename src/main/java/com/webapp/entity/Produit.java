package com.webapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="produit")

public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="codeProduit")
	private int codeProduit;
	
	@Column(name="upc")
	private String upc;
	
	@Column(name="nomProduit")
	private String nomProduit;

	@Column(name="image")
	private int image;
	
	@Column(name="categorie")
	private String categorie;
	
	@Column(name="typeUnite")
	private String typeUnite;
	
	@Column(name="prixVendant")
	private double prixVendant;

	public int getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(int codeProduit) {
		this.codeProduit = codeProduit;
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

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getTypeUnite() {
		return typeUnite;
	}

	public void setTypeUnite(String typeUnite) {
		this.typeUnite = typeUnite;
	}

	public double getPrixVendant() {
		return prixVendant;
	}

	public void setPrixVendant(double prixVendant) {
		this.prixVendant = prixVendant;
	}

	
	
	
	
}
