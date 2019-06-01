package ma.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entity.Dessert;
import ma.projet.repository.DessertRepository;

@Service
public class DessertService implements IDao<Dessert> {
	@Autowired
	private DessertRepository dr;
	List<Dessert> desserts;

	@Override
	public Dessert create(Dessert o) {
		return dr.save(o);

	}

	@Override
	public void update(Dessert o) {
		dr.save(o);

	}

	@Override
	public boolean delete(Dessert o) {
		dr.delete(o);
		return true;
	}

	@Override
	public List<Dessert> findAll() {
		desserts = dr.findAll();
		return desserts;
	}

	@Override
	public Dessert findById(Long id) {
		return dr.findById(id).get();
	}

}
