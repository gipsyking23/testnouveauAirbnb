package fr.zyma.simplon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.zyma.simplon.model.Adresse;
import fr.zyma.simplon.repository.AdresseRepository;

@Service
@Transactional
public class AdresseService {
	
	@Autowired
	private AdresseRepository  adresseRepository;

	public void save(Adresse adresse) {
		adresseRepository.save(adresse);
		
	} 
}
