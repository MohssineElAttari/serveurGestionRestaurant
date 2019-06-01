package ma.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entity.RepasPrincipale;
import ma.projet.repository.RepasPrincipaleRepository;

@Primary
@Service
public class RepasPrincipaleService implements IDao<RepasPrincipale> {
	@Autowired
	private RepasPrincipaleRepository rpp;
	private List<RepasPrincipale> repasPrincipales;

	@Override
	public RepasPrincipale create(RepasPrincipale o) {
		return rpp.save(o);

	}

	@Override
	public void update(RepasPrincipale o) {
		rpp.saveAndFlush(o);

	}

	@Override
	public boolean delete(RepasPrincipale o) {
		rpp.delete(o);
		return true;
	}

	@Override
	public List<RepasPrincipale> findAll() {
		repasPrincipales = rpp.findAll();
		return repasPrincipales;
	}

	@Override
	public RepasPrincipale findById(Long id) {

		return rpp.findById(id).get();
	}

}
