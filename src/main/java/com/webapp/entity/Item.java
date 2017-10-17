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
	private Integer id_Item;
	
	@Column(name = "id_commande")
	private Integer id_Commande;
	
	@Column(name = "code_produit")
	private Integer code_Produit;
	
	@Column(name = "upc")
	private String upc;
	
	@Column(name = "quantite")
	private Integer quantite;
	
	@Column(name = "prix_achat")
	private Double prixAchat;
	
	@Column(name = "prix_vendant")
	private Double prixVendant;
	
	@Column(name = "prix_ajuste")
	private Double prixAjuste;

	
	public Integer getId_Item() {
		return id_Item;
	}

	public void setId_Item(Integer id_Item) {
		this.id_Item = id_Item;
	}

	public Integer getId_Commande() {
		return id_Commande;
	}

	public void setId_Commande(Integer id_Commande) {
		this.id_Commande = id_Commande;
	}

	public Integer getCode_Produit() {
		return code_Produit;
	}

	public void setCode_Produit(Integer code_Produit) {
		this.code_Produit = code_Produit;
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

	public Double getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(Double prixAchat) {
		this.prixAchat = prixAchat;
	}

	public Double getPrixVendant() {
		return prixVendant;
	}

	public void setPrixVendant(Double prixVendant) {
		this.prixVendant = prixVendant;
	}

	public Double getPrixAjuste() {
		return prixAjuste;
	}

	public void setPrixAjuste(Double prixAjuste) {
		this.prixAjuste = prixAjuste;
	}
	
	
}
