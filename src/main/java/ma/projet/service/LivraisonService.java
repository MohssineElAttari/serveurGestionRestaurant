package ma.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entity.Livraison;
import ma.projet.repository.LivraisonRepository;

@Service
public class LivraisonService implements IDao<Livraison> {

	@Autowired
	private LivraisonRepository lr;
	List<Livraison> livraisons;

	@Override
	public Livraison  create(Livraison o) {
		return lr.save(o);

	}

	@Override
	public void update(Livraison o) {
		lr.saveAndFlush(o);

	}

	@Override
	public boolean delete(Livraison o) {
		lr.delete(o);
		return true;
	}

	@Override
	public List<Livraison> findAll() {
		livraisons = lr.findAll();
		return null;
	}

	@Override
	public Livraison findById(Long id) {
		
		return lr.findById(id).get();
	}

}
