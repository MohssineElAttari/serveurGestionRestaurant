package ma.projet.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	@Temporal(TemporalType.DATE)
	private Date dateReserv;
	private int nombrePlaces;
	private String etatReserv;
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(Date dateReserv, int nombrePlaces, String etatReserv) {
		super();
		this.dateReserv = dateReserv;
		this.nombrePlaces = nombrePlaces;
		this.etatReserv = etatReserv;
	}
	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	public Date getDateReserv() {
		return dateReserv;
	}
	public void setDateReserv(Date dateReserv) {
		this.dateReserv = dateReserv;
	}
	public int getNombrePlaces() {
		return nombrePlaces;
	}
	public void setNombrePlaces(int nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}
	public String getEtatReserv() {
		return etatReserv;
	}
	public void setEtatReserv(String etatReserv) {
		this.etatReserv = etatReserv;
	}
	
}
