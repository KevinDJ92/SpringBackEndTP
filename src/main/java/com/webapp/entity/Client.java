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
	private Integer id_client;
	
	@Column(name = "client")
	private String client;
	
	@Column(name = "telephone")
	private String telephone;
	
	@Column(name = "contact")
	private String contact;
	
	@Column(name = "adresse")
	private String adresse;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "code_utilisateur")
	private Integer code_utilisateur;

	public Integer getId_client() {
		return id_client;
	}

	public void setId_client(Integer id_client) {
		this.id_client = id_client;
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

	public Integer getCode_utilisateur() {
		return code_utilisateur;
	}

	public void setCode_utilisateur(Integer code_utilisateur) {
		this.code_utilisateur = code_utilisateur;
	}
	
	
}
