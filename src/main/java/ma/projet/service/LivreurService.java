package ma.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entity.Livreur;
import ma.projet.repository.LivreurRepository;

@Service
public class LivreurService implements IDao<Livreur> {
	@Autowired
	private LivreurRepository lr;
	List<Livreur> livreurs;

	@Override
	public Livreur create(Livreur o) {
		return lr.save(o);

	}

	@Override
	public void update(Livreur o) {
		lr.saveAndFlush(o);

	}

	@Override
	public boolean delete(Livreur o) {
		lr.delete(o);
		return true;
	}

	@Override
	public List<Livreur> findAll() {
		livreurs = lr.findAll();
		return livreurs;
	}

	@Override
	public Livreur findById(Long id) {

		return lr.findById(id).get();
	}

}
