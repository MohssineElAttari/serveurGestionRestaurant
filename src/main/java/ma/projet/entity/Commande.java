package ma.projet.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCommande;
	@Temporal(TemporalType.DATE)
	private Date dateCommande;
	private int heureCommande;
	private String EtatCommande;
	private String Categorie;
	@ManyToOne
	private Livraison livraison;
	@ManyToOne
	private Client client;

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commande(Date dateCommande, int heureCommande, String etatCommande, String categorie, Livraison livraison,
			Client client) {
		super();
		this.dateCommande = dateCommande;
		this.heureCommande = heureCommande;
		EtatCommande = etatCommande;
		Categorie = categorie;
		this.livraison = livraison;
		this.client = client;
	}

	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public int getHeureCommande() {
		return heureCommande;
	}

	public void setHeureCommande(int heureCommande) {
		this.heureCommande = heureCommande;
	}

	public String getEtatCommande() {
		return EtatCommande;
	}

	public void setEtatCommande(String etatCommande) {
		EtatCommande = etatCommande;
	}

	public String getCategorie() {
		return Categorie;
	}

	public void setCategorie(String categorie) {
		Categorie = categorie;
	}

	public Livraison getLivraison() {
		return livraison;
	}

	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
