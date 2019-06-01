package ma.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entity.Entree;
import ma.projet.repository.EntreeRepository;
@Primary
@Service
public class EntreeService implements IDao<Entree> {
	@Autowired
	private EntreeRepository er;
	private List<Entree> entrees;

	@Override
	public Entree create(Entree o) {
		return er.save(o);

	}

	@Override
	public void update(Entree o) {
		er.saveAndFlush(o);

	}

	@Override
	public boolean delete(Entree o) {
		er.delete(o);
		return true;
	}

	@Override
	public List<Entree> findAll() {
		entrees = er.findAll();
		return entrees;
	}

	@Override
	public Entree findById(Long id) {

		return er.findById(id).get();
	}

}
