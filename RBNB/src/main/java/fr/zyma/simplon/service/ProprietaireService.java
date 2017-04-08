package fr.zyma.simplon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.zyma.simplon.model.Proprietaire;
import fr.zyma.simplon.repository.ProprietaireRepository;

@Service("proprietaireService")
public class ProprietaireService {
	
@Autowired
private ProprietaireRepository proprietaireRepository;

public void save(Proprietaire proprietaire) {
	proprietaireRepository.save(proprietaire);
	
} 
public List<Proprietaire> getAllProprietaire() {
	return proprietaireRepository.findAll();
}

 
public Proprietaire getProprietaireById(long id) {
	return proprietaireRepository.findOne(id);
}

}
