package ma.projet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class TableReservationId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long table;
	private Long reservation;
	@Temporal(TemporalType.DATE)
	private Date dateFin;

	public TableReservationId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TableReservationId(Long table, Long reservation, Date dateFin) {
		super();
		this.table = table;
		this.reservation = reservation;
		this.dateFin = dateFin;
	}

	public Long getTable() {
		return table;
	}

	public void setTable(Long table) {
		this.table = table;
	}

	public Long getReservation() {
		return reservation;
	}

	public void setReservation(Long reservation) {
		this.reservation = reservation;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
