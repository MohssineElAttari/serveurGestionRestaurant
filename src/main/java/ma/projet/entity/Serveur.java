package ma.projet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SE")
public class Serveur extends Personne implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private String matricule;

	public Serveur() {
		super();
	}

	public Serveur(String nom, String prenom, Date dateNais, String ville, String adress, String login, String password,
			String matricule) {
		super(nom, prenom, dateNais, ville, adress, login, password);
		this.matricule = matricule;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

}
