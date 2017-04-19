package fr.zyma.simplon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Disponibilite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 

	private Long iddisponibilite;
	
	@Column(name="date_du")
	private String dateDu; 
	@Column(name="date_au")
	private String dateAu;
	
	public Long getIdisponibilite() {
		return iddisponibilite;
	}
	public void setIdisponibilite(Long idisponibilite) {
		this.iddisponibilite = iddisponibilite;
	}
	public String getDateDu() {
		return dateDu;
	}
	public void setDateDu(String string) {
		this.dateDu = string;
	}
	public String getDateAu() {
		return dateAu;
	}
	public void setDateAu(String string) {
		this.dateAu = string;
	} 
	
}
