package ma.projet.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TableReservation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TableReservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@EmbeddedId
	private TableReservationId id;
	@JoinColumn(name = "table", referencedColumnName = "id", insertable = false, updatable = false)
	@ManyToOne
	private Table table;
	@JoinColumn(name = "reservation", referencedColumnName = "idReservation", insertable = false, updatable = false)
	@ManyToOne
	private Reservation reservation;

	public TableReservation(Table table, Reservation reservation) {
		super();
		this.table = table;
		this.reservation = reservation;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public TableReservationId getId() {
		return id;
	}

	public void setId(TableReservationId id) {
		this.id = id;
	}

}
