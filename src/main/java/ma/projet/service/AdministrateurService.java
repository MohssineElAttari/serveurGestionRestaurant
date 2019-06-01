package ma.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entity.Administrateur;
import ma.projet.repository.AdministrateurRepository;

@Primary
@Service
public class AdministrateurService implements IDao<Administrateur> {
	@Autowired
	private AdministrateurRepository ar;
	List<Administrateur> adminstrateurs;

	@Override
	public Administrateur create(Administrateur o) {
		return ar.save(o);
	}

	@Override
	public void update(Administrateur o) {
		ar.saveAndFlush(o);
	}

	@Override
	public boolean delete(Administrateur o) {
		ar.delete(o);
		return true;
	}

	@Override
	public List<Administrateur> findAll() {
		return adminstrateurs = ar.findAll();
	}

	@Override
	public Administrateur findById(Long id) {
		return ar.findById(id).get();
	}

}
