package fr.zyma.simplon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.zyma.simplon.model.Disponibilite;
import fr.zyma.simplon.repository.DisponibiliteRepository;

@Service
@Transactional
public class DisponibiliteService {
	
	@Autowired
	private DisponibiliteRepository  disponibiliteRepository;

	public void save(Disponibilite disponibilite) {
	disponibiliteRepository.save(disponibilite);
		
	} 

}
