package fr.zyma.simplon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormulaireController {
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String goHome(){
		return "formulairep";
	}
	@RequestMapping(path="/logement", method=RequestMethod.GET)
	public String gologement(){
		return "formulairel";
	}

	@RequestMapping(path="/recherche", method=RequestMethod.GET)
	public String gorecherche(){
		return "formulairer";
}
}