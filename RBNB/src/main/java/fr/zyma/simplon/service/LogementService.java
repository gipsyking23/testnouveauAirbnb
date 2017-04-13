package fr.zyma.simplon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.zyma.simplon.model.Adresse;
import fr.zyma.simplon.model.Disponibilite;
import fr.zyma.simplon.model.Logement;
import fr.zyma.simplon.model.Proprietaire;
import fr.zyma.simplon.repository.AdresseRepository;
import fr.zyma.simplon.repository.DisponibiliteRepository;
import fr.zyma.simplon.repository.LogementRepository;
import fr.zyma.simplon.repository.ProprietaireRepository;

@Service
@Transactional
public class LogementService {

	@Autowired
	LogementRepository logementRepository;

	@Autowired
	DisponibiliteRepository disponibiliteRepository;

	@Autowired
	AdresseRepository adresseRepository;

	@Autowired
	ProprietaireRepository proprietaireRepository;

	public Logement ajouterLogement(Long id, String datedu, String dateau, String rue, String ville, String description) {

		Adresse adresse = new Adresse();
		adresse.setRue(rue);
		adresse.setVille(ville);
		adresseRepository.save(adresse);

		Disponibilite disponibilite = new Disponibilite();
		disponibilite.setDateDu(datedu);
		disponibilite.setDateAu(dateau);
		disponibiliteRepository.save(disponibilite);
		
		Logement logement = new Logement();
		logement.setProprietaire(proprietaireRepository.findOne(id));
		logement.setAdresse(adresse);
		logement.setDisponibilité(disponibilite);
		logement.setDescription(description);
		logementRepository.save(logement);
		return logement;

	}
	
	public List<Logement> rechercheLogement(String datedu, String dateau){
		return logementRepository.rechercheLogement(datedu, dateau);
	}

}
