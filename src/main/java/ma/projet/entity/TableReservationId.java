package ma.projet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class TableReservationId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long tablee;
	private Long reservation;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;

	public TableReservationId() {
		super();
	}

	public TableReservationId(Long tablee, Long reservation, Date dateDebut) {
		super();
		this.tablee = tablee;
		this.reservation = reservation;
		this.dateDebut = dateDebut;
	}

	public Long getTablee() {
		return tablee;
	}

	public void setTablee(Long tablee) {
		this.tablee = tablee;
	}

	public Long getReservation() {
		return reservation;
	}

	public void setReservation(Long reservation) {
		this.reservation = reservation;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

}
