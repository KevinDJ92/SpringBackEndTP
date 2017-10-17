package com.webapp.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Commande {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_commande")
    private Integer id_commande;
	
	@Column(name = "id_client")
    private Integer id_client;
	
	@Column(name = "id_utilisateur")
	    private Integer id_utilisateur;

	@Column(name = "vente_ideal")
	    private Double vente_ideal;

	@Column(name = "vente_total")
	    private Double vente_total;

	@Column(name = "commission_type")
	    private String commission_type;

	@Column(name = "commision_montant")
	    private Double commision_montant;

	@Column(name = "adresse")
	    private String adresse;
	
	@Column(name = "date_vente")
		private LocalDateTime date_vente;
		
	@Column(name = "date_commission")
		private LocalDateTime date_commission;

	public Integer getId_commande() {
		return id_commande;
	}

	public void setId_commande(Integer id_commande) {
		this.id_commande = id_commande;
	}

	public Integer getId_client() {
		return id_client;
	}

	public void setId_client(Integer id_client) {
		this.id_client = id_client;
	}

	public Integer getId_utilisateur() {
		return id_utilisateur;
	}

	public void setId_utilisateur(Integer id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}

	public Double getVente_ideal() {
		return vente_ideal;
	}

	public void setVente_ideal(Double vente_ideal) {
		this.vente_ideal = vente_ideal;
	}

	public Double getVente_total() {
		return vente_total;
	}

	public void setVente_total(Double vente_total) {
		this.vente_total = vente_total;
	}

	public String getCommission_type() {
		return commission_type;
	}

	public void setCommission_type(String commission_type) {
		this.commission_type = commission_type;
	}

	public Double getCommision_montant() {
		return commision_montant;
	}

	public void setCommision_montant(Double commision_montant) {
		this.commision_montant = commision_montant;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public LocalDateTime getDate_vente() {
		return date_vente;
	}

	public void setDate_vente(LocalDateTime date_vente) {
		this.date_vente = date_vente;
	}

	public LocalDateTime getDate_commission() {
		return date_commission;
	}

	public void setDate_commission(LocalDateTime date_commission) {
		this.date_commission = date_commission;
	}

	
	
}
