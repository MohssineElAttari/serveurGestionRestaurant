package ma.projet.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Livreur extends Personne {

	private static final long serialVersionUID = 1L;

	private String matriculeL;

	@ManyToOne
	private Livraison livraison;

	public Livreur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livreur(String nomPers, String prenomPers, Date dateNaisPers, String villePers, String adressPers,
			String loginPers, String passwordPers, Profile profile, String matriculeL, Livraison livraison) {
		super(nomPers, prenomPers, dateNaisPers, villePers, adressPers, loginPers, passwordPers, profile);
		this.matriculeL = matriculeL;
		this.livraison = livraison;
	}

	public String getMatriculeL() {
		return matriculeL;
	}

	public void setMatriculeL(String matriculeL) {
		this.matriculeL = matriculeL;
	}

	public Livraison getLivraison() {
		return livraison;
	}

	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
	}

}
