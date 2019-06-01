package ma.projet.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entity.Commande;
import ma.projet.entity.CommandeClient;
import ma.projet.entity.CommandeClientId;
import ma.projet.entity.Repas;
import ma.projet.repository.CommandeClientRepository;
import ma.projet.repository.CommandeRepository;
import ma.projet.repository.RepasRepository;

@Service
public class CommandeService implements IDao<Commande> {
	@Autowired
	private CommandeRepository cr;
	List<Commande> commandes;

	@Autowired
	private RepasRepository rr;
	@Autowired
	CommandeClientRepository cCR;

	@Override
	public Commande create(Commande o) {
		return cr.save(o);

	}

	@Override
	public void update(Commande o) {
		cr.saveAndFlush(o);

	}

	@Override
	public boolean delete(Commande o) {
		cr.delete(o);
		return true;
	}

	@Override
	public List<Commande> findAll() {
		commandes = cr.findAll();
		return commandes;
	}

	@Override
	public Commande findById(Long id) {
		return cr.findById(id).get();
	}

	public void createCommandeRepas(Commande c, Long id, Date dateFin, int quantitie) {
		cr.save(c);
		System.out.println("#################123456789###############");
		Repas r = rr.findById(id).get();
		CommandeClientId commandeClientId = new CommandeClientId(c.getId(), r.getId(), dateFin);
		cCR.save(new CommandeClient(commandeClientId, r, c, quantitie, dateFin));
	}
}
