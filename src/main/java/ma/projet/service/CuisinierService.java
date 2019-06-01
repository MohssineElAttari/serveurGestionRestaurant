package ma.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entity.Cuisinier;
import ma.projet.repository.CuisinierRepository;

@Service
public class CuisinierService implements IDao<Cuisinier> {

	@Autowired
	private CuisinierRepository cr;
	List<Cuisinier> cuisiniers;

	@Override
	public Cuisinier create(Cuisinier o) {
		return cr.save(o);

	}

	@Override
	public void update(Cuisinier o) {
		cr.saveAndFlush(o);

	}

	@Override
	public boolean delete(Cuisinier o) {
		cr.delete(o);
		return false;
	}

	@Override
	public List<Cuisinier> findAll() {
		cuisiniers = cr.findAll();
		return cuisiniers;
	}

	@Override
	public Cuisinier findById(Long id) {
		return cr.findById(id).get();
	}

}
