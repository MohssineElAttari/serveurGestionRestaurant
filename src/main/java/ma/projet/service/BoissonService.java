package ma.projet.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entity.Boisson;
import ma.projet.entity.Commande;
import ma.projet.entity.CommandeClient;
import ma.projet.entity.CommandeClientId;
import ma.projet.entity.Repas;
import ma.projet.repository.BoissonRepository;
import ma.projet.repository.CommandeClientRepository;
import ma.projet.repository.CommandeRepository;

@Service
public class BoissonService implements IDao<Boisson> {
	@Autowired
	private BoissonRepository br;
	List<Boisson> boissons;
	@Autowired
	private CommandeRepository cs;
	@Autowired
	private CommandeClientRepository cCR;

	@Override
	public Boisson create(Boisson o) {
		return br.save(o);

	}

	@Override
	public void update(Boisson o) {
		br.saveAndFlush(o);

	}

	@Override
	public boolean delete(Boisson o) {
		br.delete(o);
		return true;
	}

	@Override
	public List<Boisson> findAll() {
		boissons = br.findAll();
		return boissons;
	}

	@Override
	public Boisson findById(Long id) {

		return br.findById(id).get();
	}

//	public void createCommandeBoisson(Commande c, Long id, Date dateFin, int quantitie) {
//
//		cs.save(c);
//		System.out.println("#################123456789###############");
//		Boisson b = br.findById(id).get();
//		CommandeClientId commandeClientId = new CommandeClientId(c.getId(), b.getId(), dateFin);
//		cCR.save(new CommandeClient(commandeClientId, b, c, quantitie, dateFin));
//	}

}
