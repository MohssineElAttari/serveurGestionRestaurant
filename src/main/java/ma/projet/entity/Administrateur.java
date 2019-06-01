package ma.projet.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AD")
public class Administrateur extends Personne {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Administrateur() {
		super();
	}

	public Administrateur(String nom, String prenom, Date dateNais, String ville, String adress, String login,
			String password) {
		super(nom, prenom, dateNais, ville, adress, login, password);
	}

}
