package ifi.gdp.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ifi.gdp.entities.Actualite;

//@RepositoryRestResource
public interface ActualiteRepository extends JpaRepository<Actualite, Long> {
	
	@Query("select a.titre, a.nomAuteur, a.dateActualite, a.photo from Actualite a")
	public Page<Actualite> listActualite(Pageable pageable);
	
}
