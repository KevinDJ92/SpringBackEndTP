package com.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Systeme {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_systeme")
	private Integer idSysteme;

	@Column(name = "nom")
	private String nom;
	
	@Column(name = "adresse")
	private String adresse;

	@Column(name = "logo")
	private String logo;

	@Column(name = "droit_utilisation")
	private Integer droitUtilisation;

	public Integer getIdSysteme() {
		return idSysteme;
	}

	public void setIdSysteme(Integer idSysteme) {
		this.idSysteme = idSysteme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Integer getDroitUtilisation() {
		return droitUtilisation;
	}

	public void setDroitUtilisation(Integer droitUtilisation) {
		this.droitUtilisation = droitUtilisation;
	}

	
	
}
