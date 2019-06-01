package ma.projet.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TableServeur {
	@EmbeddedId
	private TableServeurId id;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "serveur", referencedColumnName = "id", insertable = false, updatable = false)
	private Serveur serveur;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "tablee", referencedColumnName = "id", insertable = false, updatable = false)
	private Tablee tablee;
	@Temporal(TemporalType.DATE)
	private Date dateFin;

	public TableServeur() {
		super();
	}

	public TableServeur(TableServeurId id, Serveur serveur, Tablee tablee, Date dateFin) {
		super();
		this.id = id;
		this.serveur = serveur;
		this.tablee = tablee;
		this.dateFin = dateFin;
	}

	public Serveur getServeur() {
		return serveur;
	}

	public void setServeur(Serveur serveur) {
		this.serveur = serveur;
	}

	public Tablee getTable() {
		return tablee;
	}

	public void setTable(Tablee tablee) {
		this.tablee = tablee;
	}

	public TableServeurId getId() {
		return id;
	}

	public void setId(TableServeurId id) {
		this.id = id;
	}

	public Tablee getTablee() {
		return tablee;
	}

	public void setTablee(Tablee tablee) {
		this.tablee = tablee;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
