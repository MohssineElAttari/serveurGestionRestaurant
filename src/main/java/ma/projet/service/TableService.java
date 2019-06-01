package ma.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entity.Tablee;
import ma.projet.repository.TableRepository;

@Primary
@Service
public class TableService implements IDao<Tablee> {
	@Autowired
	private TableRepository tr;
	private List<Tablee> tables;

	@Override
	public Tablee create(Tablee o) {
		return tr.save(o);

	}

	@Override
	public void update(Tablee o) {
		tr.saveAndFlush(o);

	}

	@Override
	public boolean delete(Tablee o) {
		tr.delete(o);
		return true;
	}

	@Override
	public List<Tablee> findAll() {
		tables = tr.findAll();
		return tables;
	}

	@Override
	public Tablee findById(Long id) {

		return tr.findById(id).get();
	}

}
