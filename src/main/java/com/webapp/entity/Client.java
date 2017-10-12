package com.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_client")
	private Integer idClient;
	
	@Column(name = "client")
	private String client;
	
	@Column(name = "telephone")
	private String telephone;
	
	@Column(name = "contact")
	private String contact;
	
	@Column(name = "addresse")
	private String adresse;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "code_utilisateur")
	private Integer codeUtilisateur;

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getContact() {
		return contact;
	}
	
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCodeUtilisateur() {
		return codeUtilisateur;
	}

	public void setCodeUtilisateur(Integer codeUtilisateur) {
		this.codeUtilisateur = codeUtilisateur;
	}
	
	
	
}
