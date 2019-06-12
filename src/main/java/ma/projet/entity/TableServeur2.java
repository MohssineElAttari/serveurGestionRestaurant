package ma.projet.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TableServeur2 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long serveur;
	private Long tablee;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebut;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFin;
	private String nom;
	private String prenom;
	private int code;
	
	
	public TableServeur2() {
		super();
	}

	

	public TableServeur2(Long serveur, Long tablee, Date dateDebut, Date dateFin, String nom, String prenom,
			int code) {
		super();
		this.serveur = serveur;
		this.tablee = tablee;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.nom = nom;
		this.prenom = prenom;
		this.code = code;
	}



	public Long getServeur() {
		return serveur;
	}

	public void setServeur(Long serveur) {
		this.serveur = serveur;
	}

	public Long getTablee() {
		return tablee;
	}

	public void setTablee(Long tablee) {
		this.tablee = tablee;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public int getCode() {
		return code;
	}



	public void setCode(int code) {
		this.code = code;
	}
	
	
	
}
