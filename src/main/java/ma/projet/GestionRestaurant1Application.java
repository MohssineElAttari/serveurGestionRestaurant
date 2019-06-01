package ma.projet;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.projet.entity.Administrateur;
import ma.projet.entity.Boisson;
import ma.projet.entity.Client;
import ma.projet.entity.Commande;
import ma.projet.entity.Cuisinier;
import ma.projet.entity.Dessert;
import ma.projet.entity.Entree;
import ma.projet.entity.Livraison;
import ma.projet.entity.Livreur;
import ma.projet.entity.RepasPrincipale;
import ma.projet.entity.Serveur;
import ma.projet.entity.Tablee;
import ma.projet.repository.ClientRepository;
import ma.projet.repository.CuisinierRepository;
import ma.projet.repository.LivraisonRepository;
import ma.projet.repository.LivreurRepository;
import ma.projet.repository.TableRepository;
import ma.projet.service.AdministrateurService;
import ma.projet.service.BoissonService;
import ma.projet.service.ClientService;
import ma.projet.service.CommandeService;
import ma.projet.service.DessertService;
import ma.projet.service.EntreeService;
import ma.projet.service.LivraisonService;
import ma.projet.service.LivreurService;
import ma.projet.service.RepasPrincipaleService;
import ma.projet.service.ReservationService;
import ma.projet.service.ServeurService;
import ma.projet.service.TableService;

@SpringBootApplication
public class GestionRestaurant1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GestionRestaurant1Application.class, args);
	}

	@Autowired
	private LivraisonRepository lis;
	@Autowired
	private LivraisonService li;
	@Autowired
	private BoissonService bs;
	@Autowired
	private ClientService cs;
	@Autowired
	private CuisinierRepository crr;
	@Autowired
	private LivreurService ls;
	@Autowired
	private AdministrateurService ar;
	@Autowired
	private TableService ts;
	@Autowired
	private TableRepository tr;
	@Autowired
	private ReservationService rs;
	@Autowired
	private ServeurService ss;
	@Autowired
	private CommandeService cos;
	@Autowired
	private RepasPrincipaleService rrp;
	@Autowired
	private EntreeService es;
	@Autowired
	private DessertService ds;

	@Override
	public void run(String... args) throws Exception {
//                         ######## Personne #########
//		cs.create(new Client("elattari", "mohssine", new Date(1909 - 11 - 18), "kech", "syba", "moh123", "123", 799));
//		ar.create(new Administrateur("Admin", "Administrateur", new Date(1995 - 01 - 23), "kech", "syba", "admin123","123456"));
//		ls.create(new Livreur("eledrisi", "anass", new Date(), "marrakech", "syba", "el123", "1234", "hh33"));
//		ss.create(new Serveur("barada", "khalid", new Date(), "casa", "lmaarif", "ba123", "1234", "aaa12"));
//
////                         ######## Repas #########
//		bs.create(new Boisson(12357, 1, "photo", "limon", "3asir", "3asir zwin"));
//		rrp.create(new RepasPrincipale(223, 2, "photo", "compossition", "info"));
//		es.create(new Entree(120, 2, "photo", "nom", "type", "info"));
//		ds.create(new Dessert(77, 1, "photo", "nom", "type", "info"));
//
//		li.create(new Livraison("syba marrakech", new Date(), 9, ls.findById(3L).get()));

//		ts.create(new Tablee(123));

//		cos.create(new Commande(new Date(), 13, "Entree", "zarbana", lis.findById(1L).get(), cs.findById(1L).get()));

		
		
//		rs.createTableReservation(new Date(), 11, "En Cour", cs.findById(1L).get(), 1, new Date(), new Date());
//
//		ss.createTableServeur(1L, 4L, new Date(), new Date());

		
//		cos.createCommandeRepas(
//				new Commande(new Date(), 12, "En Cour", "Dessert", lis.findById(1L).get(), cs.findById(1L).get()), 5L,
//				new Date(), 1234);
	}

}
