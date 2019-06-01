package ma.projet.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@DiscriminatorValue("CL")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Client extends Personne {

	private static final long serialVersionUID = 1L;

	private int numCarteFildelite;
	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
	private List<Commande> commandes;
	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
	private List<Reservation> reservations;

	public Client() {
		super();
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

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}
