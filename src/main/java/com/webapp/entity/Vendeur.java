package com.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vendeur")
public class Vendeur {

	
		
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "id_vendeur")
	    private Integer idVendeur;
		
		@Column(name = "id_utilisateur")
		private Integer idUtilisateur;
		
		@Column(name = "taux")
		private Double taux;
		
		@Column(name = "type_commission")
		private String typeCommission;

		@Column(name = "min_ventes")
		private Double minVentes;

		public Integer getIdVendeur() {
			return idVendeur;
		}

		public void setIdVendeur(Integer idVendeur) {
			this.idVendeur = idVendeur;
		}

		public Integer getIdUtilisateur() {
			return idUtilisateur;
		}

		public void setIdUtilisateur(Integer idUtilisateur) {
			this.idUtilisateur = idUtilisateur;
		}

		public Double getTaux() {
			return taux;
		}

		public void setTaux(Double taux) {
			this.taux = taux;
		}

		

		public String getTypeCommission() {
			return typeCommission;
		}

		public void setTypeCommission(String typeCommission) {
			this.typeCommission = typeCommission;
		}

		public Double getMinVentes() {
			return minVentes;
		}

		public void setMinVentes(Double minVentes) {
			this.minVentes = minVentes;
		}
		
		
	
}
