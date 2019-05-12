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
public class Livraison {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLiv;
	private String adresseLiv;
	@Temporal(TemporalType.DATE)
	private Date dateLiv;
	private int heureLiv;
	@ManyToOne
	private Livreur livreur;

	public Livraison() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livraison(String adresseLiv, Date dateLiv, int heureLiv, Livreur livreur) {
		super();
		this.adresseLiv = adresseLiv;
		this.dateLiv = dateLiv;
		this.heureLiv = heureLiv;
		this.livreur = livreur;
	}

	public int getIdLiv() {
		return idLiv;
	}

	public void setIdLiv(int idLiv) {
		this.idLiv = idLiv;
	}

	public String getAdresseLiv() {
		return adresseLiv;
	}

	public void setAdresseLiv(String adresseLiv) {
		this.adresseLiv = adresseLiv;
	}

	public Date getDateLiv() {
		return dateLiv;
	}

	public void setDateLiv(Date dateLiv) {
		this.dateLiv = dateLiv;
	}

	public int getHeureLiv() {
		return heureLiv;
	}

	public void setHeureLiv(int heureLiv) {
		this.heureLiv = heureLiv;
	}

	public Livreur getLivreur() {
		return livreur;
	}

	public void setLivreur(Livreur livreur) {
		this.livreur = livreur;
	}

}
