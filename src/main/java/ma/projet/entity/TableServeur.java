package ma.projet.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TableServeur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private TableServeurId id;
	@ManyToOne
	@JoinColumn(name = "serveur", referencedColumnName = "id", insertable = false, updatable = false)
	private Serveur serveur;
	@ManyToOne
	@JoinColumn(name = "table", referencedColumnName = "id", insertable = false, updatable = false)
	private Table table;

	public TableServeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TableServeur(Serveur serveur, Table table) {
		super();
		this.serveur = serveur;
		this.table = table;
	}

	public Serveur getServeur() {
		return serveur;
	}

	public void setServeur(Serveur serveur) {
		this.serveur = serveur;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public TableServeurId getId() {
		return id;
	}

	public void setId(TableServeurId id) {
		this.id = id;
	}

}
