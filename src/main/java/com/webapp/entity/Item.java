package com.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_item")
	private Integer id_item;
	
	@Column(name = "id_commande")
	private Integer id_commande;
	
	@Column(name = "code_produit")
	private Integer code_produit;
	
	@Column(name = "upc")
	private String upc;
	
	@Column(name = "quantite")
	private Integer quantite;
	
	@Column(name = "prix_achat")
	private Double prix_achat;
	
	@Column(name = "prix_vendant")
	private Double prix_vendant;
	
	@Column(name = "prix_ajuste")
	private Double prix_ajuste;

	
	

	public Integer getId_item() {
		return id_item;
	}

	public void setId_item(Integer id_item) {
		this.id_item = id_item;
	}

	public Integer getId_commande() {
		return id_commande;
	}

	public void setId_commande(Integer id_commande) {
		this.id_commande = id_commande;
	}

	public Integer getCode_produit() {
		return code_produit;
	}

	public void setCode_produit(Integer code_produit) {
		this.code_produit = code_produit;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public Double getPrix_achat() {
		return prix_achat;
	}

	public void setPrix_achat(Double prix_achat) {
		this.prix_achat = prix_achat;
	}

	public Double getPrix_vendant() {
		return prix_vendant;
	}

	public void setPrix_vendant(Double prix_vendant) {
		this.prix_vendant = prix_vendant;
	}

	public Double getPrix_ajuste() {
		return prix_ajuste;
	}

	public void setPrix_ajuste(Double prix_ajuste) {
		this.prix_ajuste = prix_ajuste;
	}

	
	
}
