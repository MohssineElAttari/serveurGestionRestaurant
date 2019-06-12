package ma.projet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class TableServeurId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long tablee;
	private Long serveur;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebut;

	public TableServeurId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TableServeurId(Long tablee, Long serveur, Date dateDebut) {
		super();
		this.tablee = tablee;
		this.serveur = serveur;
		this.dateDebut = dateDebut;
	}

	public Long getTable() {
		return tablee;
	}

	public void setTable(Long table) {
		this.tablee = table;
	}

	public Long getServeur() {
		return serveur;
	}

	public void setServeur(Long serveur) {
		this.serveur = serveur;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

}
