package ma.projet.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entity.Serveur;
import ma.projet.entity.TableServeur;
import ma.projet.entity.TableServeurId;
import ma.projet.entity.Tablee;
import ma.projet.repository.ServeurRepository;
import ma.projet.repository.TableRepository;
import ma.projet.repository.TableServeurRepository;

@Primary
@Service
public class ServeurService implements IDao<Serveur> {
	@Autowired
	private ServeurRepository sr;
	private List<Serveur> serveurs;
	@Autowired
	private TableRepository tr;
	@Autowired
	private TableServeurRepository tsr;

	@Override
	public Serveur create(Serveur o) {
		return sr.save(o);

	}

	@Override
	public void update(Serveur o) {
		sr.saveAndFlush(o);

	}

	@Override
	public boolean delete(Serveur o) {
		sr.delete(o);
		return true;

	}

	@Override
	public List<Serveur> findAll() {
		serveurs = sr.findAll();
		return serveurs;
	}

	@Override
	public Serveur findById(Long id) {

		return sr.findById(id).get();
	}

	public void createTableServeur(Long table, Long serveur, Date dateDebut, Date dateFin) {
		
		Tablee t = tr.findById(table).get();
		Serveur s = sr.findById(serveur).get();
		System.out.println(t.getCode()+"###########"+s.getNom());
		TableServeurId tableServeurId = new TableServeurId(t.getId(), s.getId(), dateDebut);
		tsr.save(new TableServeur(tableServeurId, s, t, dateFin));
	}
}
