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
	private Integer idItem;
	
	@Column(name = "id_commande")
	private Integer idCommande;
	
	@Column(name = "code_produit")
	private Integer codeProduit;
	
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

	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	public Integer getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Integer idCommande) {
		this.idCommande = idCommande;
	}

	public Integer getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(Integer codeProduit) {
		this.codeProduit = codeProduit;
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
