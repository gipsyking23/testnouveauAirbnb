package fr.zyma.simplon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.zyma.simplon.model.Adresse;
import fr.zyma.simplon.model.Disponibilite;
import fr.zyma.simplon.model.Logement;
import fr.zyma.simplon.model.Proprietaire;
import fr.zyma.simplon.repository.AdresseRepository;
import fr.zyma.simplon.repository.DisponibiliteRepository;
import fr.zyma.simplon.repository.LogementRepository;
import fr.zyma.simplon.repository.ProprietaireRepository;
import fr.zyma.simplon.service.LogementService;
@RestController
public class LogementController {


	    @Autowired
	    LogementService logementservice; 
	
//	@Autowired
//    LogementRepository logementRepository;
//
//	@Autowired
//	AdresseRepository adresseRepository; 
//	
//	@Autowired
//	DisponibiliteRepository disponibiliteRepository;
//	
//	@Autowired
//	ProprietaireRepository proprietaireRepository;
//	
	
	    
	    @RequestMapping(value = "/ajoutlogement", method = RequestMethod.POST)
	    @ResponseBody
	    public  Logement ajouterlogement(@RequestParam Long id,@RequestParam String datedu,@RequestParam String dateau,@RequestParam String rue, @RequestParam String ville, @RequestParam String description){
	         return logementservice.ajouterLogement(id, datedu, dateau, rue, ville, description);
	    }
	    	
	    @RequestMapping(path="/resultat", method=RequestMethod.GET)
	    public List<Logement> rechercheLogement( @RequestParam String datedu,@RequestParam String dateau) {
	    	List<Logement> logements= new ArrayList<>();
	    	logements=logementservice.rechercheLogement(datedu, dateau);
	    	return logements; 
	    	
	    	
	    }
} 
