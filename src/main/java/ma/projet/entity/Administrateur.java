package ma.projet.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Administrateur extends Personne {

	private static final long serialVersionUID = 1L;

	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrateur(String nomPers, String prenomPers, Date dateNaisPers, String villePers, String adressPers,
			String loginPers, String passwordPers, Profile profile) {
		super(nomPers, prenomPers, dateNaisPers, villePers, adressPers, loginPers, passwordPers, profile);
		// TODO Auto-generated constructor stub
	}
	
}
