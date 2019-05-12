package ma.projet.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("pcu")
public class Cuisinier extends Personne {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Diplome;

	public Cuisinier() {
		super();
		// TODO Auto-generated constructor stub

	}

	public Cuisinier(String nomPers, String prenomPers, Date dateNaisPers, String villePers, String adressPers,
			String loginPers, String passwordPers, Profile profile, int diplome) {
		super(nomPers, prenomPers, dateNaisPers, villePers, adressPers, loginPers, passwordPers, profile);
		Diplome = diplome;
	}

	public int getDiplome() {
		return Diplome;
	}

	public void setDiplome(int diplome) {
		Diplome = diplome;
	}

}