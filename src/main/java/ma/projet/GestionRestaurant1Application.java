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
import ma.projet.repository.BoissonRepository;
import ma.projet.repository.ClientRepository;
import ma.projet.repository.CommandeClientRepository;
import ma.projet.repository.CommandeRepository;
import ma.projet.repository.CuisinierRepository;
import ma.projet.repository.DessertRepository;
import ma.projet.repository.EntreeRepository;
import ma.projet.repository.LivraisonRepository;
import ma.projet.repository.LivreurRepository;
import ma.projet.repository.RepasPrincipaleRepository;
import ma.projet.repository.ServeurRepository;
import ma.projet.repository.TableRepository;
import ma.projet.repository.TableServeur2Repository;
import ma.projet.repository.TableServeurRepository;
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

//	@Autowired
//	private LivraisonRepository lis;
//	@Autowired
//	private LivraisonService li;
//	@Autowired
//	private BoissonService bs;
//	@Autowired
//	private ClientService cs;
//	@Autowired
//	private CuisinierRepository crr;
//	@Autowired
//	private LivreurService ls;
//	@Autowired
//	private AdministrateurService ar;
//	@Autowired
//	private TableService ts;
//	@Autowired
//	private TableRepository tr;
//	@Autowired
//	private ReservationService rs;
//	@Autowired
//	private ServeurService ss;
//	@Autowired
//	private CommandeService cos;
//	@Autowired
//	private RepasPrincipaleService rrp;
//	@Autowired
//	private EntreeService es;
//	@Autowired
//	private DessertService ds;
	
	
	
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private LivreurRepository livreurRepository;
	@Autowired
	private LivraisonRepository livraisonRepository;
	@Autowired
	private CommandeRepository commandeRepository;
	@Autowired
	private ServeurRepository serveurRepository;
	@Autowired
	private TableServeur2Repository tableServeur2Repository;
	@Autowired
	private TableServeurRepository tableServeurRepository;
	@Autowired
	private BoissonRepository boissonRepository;
	@Autowired
	private DessertRepository dessertRepository;
	@Autowired
	private EntreeRepository entreeRepository;
	@Autowired
	private RepasPrincipaleRepository repasPrincipaleRepository;
	@Autowired 
	private CommandeClientRepository commandeRepasRepository;
	@Autowired
	private TableRepository tableRepository;
	
	
	

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
		
//		boissonRepository.save(new Boisson(20, 5, "cafe", "chaude", "ttt"));
//		boissonRepository.save(new Boisson(20, 5, "the", "chaude", "ttt"));
//		entreeRepository.save(new Entree(30, 15, "salade", "jnj", "fju"));
//		entreeRepository.save(new Entree(30, 15, "soupe", "jnj", "fju"));
//		dessertRepository.save(new Dessert(20, 10, "glace", "huhu", "huuu"));
//		dessertRepository.save(new Dessert(20, 10, "tiramisu", "huhu", "huuu"));
//		repasPrincipaleRepository.save(new RepasPrincipale(40, 20, "grillade", "info"));
//		repasPrincipaleRepository.save(new RepasPrincipale(40, 20, "grillade", "info"));
//		clientRepository.save(new Client("alami", "amir", new Date(), "dd", "", "", "", 20));
//		livreurRepository.save(new Livreur("alami", "amir", new Date(), "dd", "", "", "", ""));
//		tableRepository.save(new Tablee(12));
//		livraisonRepository.save(new Livraison("hhh", new Date(), 12, livreurRepository.findById(30L).get()));
//		commandeRepository.save(new Commande(new Date(),5, "", "", livraisonRepository.findById(1L).get(), clientRepository.findById(19L).get()));
		
		
	}

}
