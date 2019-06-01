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
public class TableReservation {

	@EmbeddedId
	private TableReservationId id;
	@JoinColumn(name = "tablee", referencedColumnName = "id", insertable = false, updatable = false)
	@ManyToOne(cascade = CascadeType.MERGE)
	private Tablee tablee;
	@JoinColumn(name = "reservation", referencedColumnName = "id", insertable = false, updatable = false)
	@ManyToOne(cascade = CascadeType.MERGE)
	private Reservation reservation;
	@Temporal(TemporalType.DATE)
	private Date dateFin;

	public TableReservation() {
		super();
	}

	public TableReservation(TableReservationId id, Tablee tablee, Reservation reservation, Date dateFin) {
		super();
		this.id = id;
		this.tablee = tablee;
		this.reservation = reservation;
		this.dateFin = dateFin;
	}

	public Tablee getTable() {
		return tablee;
	}

	public void setTable(Tablee table) {
		this.tablee = table;
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
