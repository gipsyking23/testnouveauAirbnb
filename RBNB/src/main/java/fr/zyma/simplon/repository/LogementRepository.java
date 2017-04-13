package fr.zyma.simplon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.zyma.simplon.model.Logement;

@Repository
public interface LogementRepository extends JpaRepository<Logement, Long> {
	
//	select idLogement, description, idadresse, rue, ville, iddisponibilite, date_du, date_au from adresse left join logement on idadresse = Adresse_idAdresse right join  disponibilite on Disponibilite_idDisponibilite = idDisponibilite WHERE ville =?1 and date_du >=?2 and date_au <=?3"

 @Query("from Logement l join l.Disponibilite d  WHERE d.date_du >=?1 and d.date_au <=?2")
	public List<Logement> rechercheLogement(String datedu, String dateau);
}
