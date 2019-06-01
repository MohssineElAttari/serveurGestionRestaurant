package ma.projet.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entity.Client;
import ma.projet.entity.Reservation;
import ma.projet.entity.TableReservation;
import ma.projet.entity.TableReservationId;
import ma.projet.entity.Tablee;
import ma.projet.repository.ReservationRepository;
import ma.projet.repository.TableRepository;
import ma.projet.repository.TableReservationRepository;

@Primary
@Service
public class ReservationService implements IDao<Reservation> {
	@Autowired
	private ReservationRepository rr;
	@Autowired
	private TableRepository tableRepository;
	@Autowired
	private TableReservationRepository tableReservationRepository;
	private List<Reservation> reservations;

	@Override
	public Reservation create(Reservation o) {
		return rr.save(o);
	}

	@Override
	public void update(Reservation o) {
		rr.saveAndFlush(o);
	}

	@Override
	public boolean delete(Reservation o) {
		rr.delete(o);
		return true;
	}

	@Override
	public List<Reservation> findAll() {
		reservations = rr.findAll();
		return reservations;
	}

	@Override
	public Reservation findById(Long id) {

		return rr.findById(id).get();
	}

	public void createTableReservation(Date date, int nombrePlace, String etat, Client client, int table,
			Date dateDebut, Date dateFin) {
		Reservation reservation = new Reservation(date, nombrePlace, etat, client);
		rr.save(reservation);
		Tablee tablee = tableRepository.findById((long) table).get();
		TableReservationId id = new TableReservationId(tablee.getId(), reservation.getId(), dateDebut);
		tableReservationRepository.save(new TableReservation(id, tablee, reservation, dateFin));
	}
}
