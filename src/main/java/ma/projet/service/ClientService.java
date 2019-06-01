package ma.projet.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entity.Client;
import ma.projet.repository.ClientRepository;

@Service
@Primary
public class ClientService implements IDao<Client> {
	@Autowired
	private ClientRepository cr;
	Client client = null;

	@Override
	public void update(Client o) {
		cr.saveAndFlush(o);

	}

	@Override
	public boolean delete(Client o) {
		try {
			cr.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Client> findAll() {
		List<Client> clients = cr.findAll();
		return clients;
	}

	@Override
	public Client findById(Long id) {
		return cr.findById(id).get();
	}

	@Override
	public Client create(Client o) {
		return cr.save(o);

	}
}
