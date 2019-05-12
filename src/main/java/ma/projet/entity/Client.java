package ma.projet.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Client extends Personne {

	private static final long serialVersionUID = 1L;

	private int numCarteFildelite;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nomPers, String prenomPers, Date dateNaisPers, String villePers, String adressPers,
			String loginPers, String passwordPers, Profile profile, int numCarteFildelite) {
		super(nomPers, prenomPers, dateNaisPers, villePers, adressPers, loginPers, passwordPers, profile);
		this.numCarteFildelite = numCarteFildelite;
	}
	

	public Client(String nomPers, String prenomPers, Date dateNaisPers, String villePers, String adressPers,
			String loginPers, String passwordPers, int numCarteFildelite) {
		super(nomPers, prenomPers, dateNaisPers, villePers, adressPers, loginPers, passwordPers);
		this.numCarteFildelite = numCarteFildelite;
	}

	public int getNumCarteFildelite() {
		return numCarteFildelite;
	}

	public void setNumCarteFildelite(int numCarteFildelite) {
		this.numCarteFildelite = numCarteFildelite;
	}

}
