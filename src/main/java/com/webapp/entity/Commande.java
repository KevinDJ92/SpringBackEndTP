package com.webapp.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Commande")
public class Commande {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_commande")
    private Integer idCommande;
	
	@Column(name = "id_client")
    private Integer idClient;
	
	@Column(name = "id_utilisateur")
	private Integer idUtilisateur;

	@Column(name = "vente_ideal")
	private Double venteIdeal;

	@Column(name = "vente_total")
	private Double venteTotal;

	@Column(name = "commission_type")
	private String commissionType;

	@Column(name = "commision_montant")
	private Double commisionMontant;

	@Column(name = "adresse")
	private String adresse;
	
	@Column(name = "date_vente")
	private Date dateVente;
		
	@Column(name = "date_commission")
	private Date dateCommission;

	public Integer getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Integer idCommande) {
		this.idCommande = idCommande;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public Double getVenteIdeal() {
		return venteIdeal;
	}

	public void setVenteIdeal(Double venteIdeal) {
		this.venteIdeal = venteIdeal;
	}

	public Double getVenteTotal() {
		return venteTotal;
	}

	public void setVenteTotal(Double venteTotal) {
		this.venteTotal = venteTotal;
	}

	public String getCommissionType() {
		return commissionType;
	}

	public void setCommissionType(String commissionType) {
		this.commissionType = commissionType;
	}

	public Double getCommisionMontant() {
		return commisionMontant;
	}

	public void setCommisionMontant(Double commisionMontant) {
		this.commisionMontant = commisionMontant;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateVente() {
		return dateVente;
	}

	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}

	public Date getDateCommission() {
		return dateCommission;
	}

	public void setDateCommission(Date dateCommission) {
		this.dateCommission = dateCommission;
	}
}
