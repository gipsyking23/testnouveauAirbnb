package fr.zyma.simplon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adresse {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idadresse")
	private Long idadresse; 
	private String rue; 
	 private String ville;
	 
	 
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Long getIdadresse() {
		return idadresse;
	}
	public void setIdadresse(Long idadresse) {
		this.idadresse = idadresse;
	}
	 
	 
	}

