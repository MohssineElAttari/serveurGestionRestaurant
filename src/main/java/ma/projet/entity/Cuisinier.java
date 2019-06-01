package ma.projet.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CU")
public class Cuisinier extends Personne {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Diplome;

	public Cuisinier() {
		super();

	}

	public Cuisinier(String nom, String prenom, Date dateNais, String ville, String adress, String login,
			String password, int diplome) {
		super(nom, prenom, dateNais, ville, adress, login, password);
		Diplome = diplome;
	}

	public int getDiplome() {
		return Diplome;
	}

	public void setDiplome(int diplome) {
		Diplome = diplome;
	}

}