package fr.zyma.simplon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Logement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idlogement;
	private String description;
	@OneToOne
	private Proprietaire proprietaire;
	@OneToOne
	private Adresse adresse;
	@OneToOne
	private Disponibilite disponibilite;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Disponibilite getDisponibilité() {
		return disponibilite;
	}

	public void setDisponibilité(Disponibilite disponibilite) {
		this.disponibilite = disponibilite;
	}

	public Long getIdlogement() {
		return idlogement;
	}

	public void setIdlogement(Long idlogement) {
		this.idlogement = idlogement;
	}

}
