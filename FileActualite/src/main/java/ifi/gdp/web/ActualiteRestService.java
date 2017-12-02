package ifi.gdp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ifi.gdp.dao.ActualiteRepository;
import ifi.gdp.entities.Actualite;
@CrossOrigin("*")
@RestController
public class ActualiteRestService {
	
	@Autowired
	private ActualiteRepository actualiteRepository;
	
	
	//Methode permettant de retourner une page d'actualités c-a-d la liste des actualités
	@RequestMapping(value = "/actualites", method=RequestMethod.GET)
	public Page<Actualite> pageActualites(@RequestParam(name ="page", defaultValue ="0")int page, 
										  @RequestParam(name ="size", defaultValue ="20")int size){
		
		return actualiteRepository.findAll(new PageRequest(page, size));
	}
	
	
	@RequestMapping(value = "/actualites/{id}", method=RequestMethod.GET)
	public Actualite getActualites(@PathVariable(name = "id")Long id){
		
		return actualiteRepository.findOne(id);
	}

}
