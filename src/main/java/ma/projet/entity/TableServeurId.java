package ma.projet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class TableServeurId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long table;
	private Long serveur;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;

	public TableServeurId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TableServeurId(Long table, Long serveur, Date dateDebut, Date dateFin) {
		super();
		this.table = table;
		this.serveur = serveur;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public Long getTable() {
		return table;
	}

	public void setTable(Long table) {
		this.table = table;
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

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
