package ma.projet.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Serveur extends Personne implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private String matriculeServeur;
	@OneToMany(mappedBy = "serveur", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<TableServeur> tableServeurs;

	public Serveur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Serveur(String nomPers, String prenomPers, Date dateNaisPers, String villePers, String adressPers,
			String loginPers, String passwordPers, Profile profile, String matriculeServeur,
			Set<TableServeur> tableServeurs) {
		super(nomPers, prenomPers, dateNaisPers, villePers, adressPers, loginPers, passwordPers, profile);
		this.matriculeServeur = matriculeServeur;
		this.tableServeurs = tableServeurs;
	}

	public String getMatriculeServeur() {
		return matriculeServeur;
	}

	public void setMatriculeServeur(String matriculeServeur) {
		this.matriculeServeur = matriculeServeur;
	}

	public Set<TableServeur> getTableServeurs() {
		return tableServeurs;
	}

	public void setTableServeurs(Set<TableServeur> tableServeurs) {
		this.tableServeurs = tableServeurs;
	}

}
