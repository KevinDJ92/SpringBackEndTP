package com.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_utilisateur")
	private Integer idUtilisateur;

	@Column(name = "nom_utilisateur")
	private String nomUtilisateur;

	@Column(name = "mot_passe")
	private String motPasse;

	@Column(name = "droit_utilisation")
	private Boolean droitUtilisation;

	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getMotPasse() {
		return motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}

	public Boolean getDroitUtilisation() {
		return droitUtilisation;
	}

	public void setDroitUtilisation(Boolean droitUtilisation) {
		this.droitUtilisation = droitUtilisation;
	}
}
