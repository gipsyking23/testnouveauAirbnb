package fr.zyma.simplon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.zyma.simplon.model.Proprietaire;
import fr.zyma.simplon.service.ProprietaireService;

@RestController
public class ProprietaireController {

    @Autowired
    ProprietaireService proprietaireService ; 
	
	@RequestMapping(path="/proprietaires", method=RequestMethod.GET)
	public List<Proprietaire> getAllEmployees(){
		return proprietaireService.getAllProprietaire();
	}
    @RequestMapping(value = "/proprietaire/{id}", method = RequestMethod.GET)
	public Proprietaire getEmployeeById(@PathVariable("id") long id){
		return proprietaireService.getProprietaireById(id);
	}

    @RequestMapping(value = "/saveproprietaire", method = RequestMethod.POST)
    @ResponseBody
    public String saveProprietaire(@RequestBody Proprietaire proprietaire) {
    	proprietaireService.save(proprietaire);
        return proprietaire.getId().toString();
    }

    
}