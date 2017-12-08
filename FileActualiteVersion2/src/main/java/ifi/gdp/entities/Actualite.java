package ifi.gdp.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Actualite implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String titre;
	private String nomAuteur;
	private Date dateActualite;
	private String photo;
	@Lob
	private String contenu;
	
	public Actualite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Actualite(String titre, String nomAuteur, Date dateActualite, String photo, String contenu) {
		super();
		this.titre = titre;
		this.nomAuteur = nomAuteur;
		this.dateActualite = dateActualite;
		this.photo = photo;
		this.contenu = contenu;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getNomAuteur() {
		return nomAuteur;
	}
	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}
	public Date getDateActualite() {
		return dateActualite;
	}
	public void setDateActualite(Date dateActualite) {
		this.dateActualite = dateActualite;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
}
