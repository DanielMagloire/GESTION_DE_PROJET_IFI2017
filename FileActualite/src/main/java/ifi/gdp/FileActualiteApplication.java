package ifi.gdp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ifi.gdp.dao.ActualiteRepository;
import ifi.gdp.entities.Actualite;

@SpringBootApplication
public class FileActualiteApplication implements CommandLineRunner {

	@Autowired
	private ActualiteRepository actualiteRepository; //Je déclare cette objet et je demande à Spring de faire une injection
	public static void main(String[] args) {
		SpringApplication.run(FileActualiteApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		//Pour enregistrer plusieurs actualités, nous allons faire une boucle car nous aurons besoin de faire la pagination
		/*for(int i=0; i < 200; i++){
		//Créons un objet actualité
		Actualite actualite = new Actualite("Recrutement en master recherche en informatique SIM IFI 2018", "Administration IFI", new Date(), "concours"+i+".png", "L'IFI lance <strong>le recrutement</strong> pour l'accès au master recherche SIM pour le compte de l'année académique 2018-2019");
		actualiteRepository.save(actualite);
		}*/
	}
}
