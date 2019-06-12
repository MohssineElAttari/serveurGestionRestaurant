package ma.projet.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entity.Serveur;
import ma.projet.entity.TableServeur;
import ma.projet.entity.TableServeur2;
import ma.projet.entity.TableServeurId;
import ma.projet.entity.Tablee;
import ma.projet.repository.ServeurRepository;
import ma.projet.repository.TableRepository;
import ma.projet.repository.TableServeur2Repository;
import ma.projet.repository.TableServeurRepository;

@Service
public class TableServeurService implements IDao<TableServeur> {

	@Autowired
	private TableServeurRepository tableServeurRepository;
	@Autowired
	private TableServeur2Repository tableServeur2Repository;
	@Autowired
	private TableService tableService;
	@Autowired
	private ServeurService serveurService;

	public void createAll(Long table, Long serveur, Date dateDebut, Date dateFin) {
		TableServeurId ts = new TableServeurId(table, serveur, dateDebut);
		Serveur s = serveurService.findById(serveur);
		Tablee t = tableService.findById(table);
		tableServeurRepository.save(new TableServeur(ts, s, t, dateFin));
		tableServeur2Repository.save(
				new TableServeur2(s.getId(), t.getId(), dateDebut, dateFin, s.getNom(), s.getPrenom(), t.getCode()));
	}

	@Override
	public void update(TableServeur o) {
		// TODO Auto-generated method stub

	}

	public void updateAll(Long table, Long serveur, Date dateDebut, Date dateFin) {
		TableServeurId ts = new TableServeurId(table, serveur, dateDebut);
		Serveur s = serveurService.findById(serveur);
		Tablee t = tableService.findById(table);
		TableServeur ts1 = new TableServeur();
		ts1.setId(ts);
		ts1.setServeur(s);
		ts1.setTablee(t);
		ts1.setDateFin(dateFin);
		tableServeurRepository.saveAndFlush(ts1);
		TableServeur2 ts2 = new TableServeur2();
		ts2.setCode(t.getCode());
		ts2.setServeur(s.getId());
		ts2.setDateDebut(dateDebut);
		ts2.setDateFin(dateFin);
		ts2.setNom(s.getNom());
		ts2.setPrenom(s.getPrenom());
		ts2.setTablee(t.getId());
		tableServeur2Repository.saveAndFlush(ts2);
	}

	public void deleteAll(Long table, Long serveur, Date dateFin) {
		TableServeur2 ts2 = tableServeur2Repository.findTableServeur2(table, serveur, dateFin);
		TableServeur ts = tableServeurRepository.findTableServeur(table, serveur, dateFin);

		tableServeurRepository.delete(ts);
		tableServeur2Repository.delete(ts2);
	}

	@Override
	public List<TableServeur> findAll() {
		return null;
	}

	public List<TableServeur2> findAlll() {
		return tableServeur2Repository.findAll();
	}

	@Override
	public TableServeur findById(Long id) {
		return null;
	}

	@Override
	public TableServeur create(TableServeur o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(TableServeur o) {
		return false;
	}

}
