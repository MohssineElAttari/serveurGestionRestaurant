package ma.projet;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.projet.entity.Client;
import ma.projet.entity.Cuisinier;
import ma.projet.entity.Profile;
import ma.projet.repository.ClientRepository;
import ma.projet.repository.CuisinierRepository;
import ma.projet.repository.ProfileRepository;
import ma.projet.service.ClientService;

@SpringBootApplication
public class GestionRestaurant1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GestionRestaurant1Application.class, args);
	}

////	@Autowired
//	private ClientRepository cr;
//	@Autowired
//	private CuisinierRepository crr;
	
	@Autowired
	private ClientService cs;
	@Autowired
	private ProfileRepository pr;
	@Override
	public void run(String... args) throws Exception {
//		cr.save(new Client("nomPers", "prenomPers", new Date(1999 - 12 - 12), "villePers", "adressPers", "loginPers",
//				"passwordPers", 12));
//		cr.save(new Client("nomPers", "prenomPers", new Date(1999 - 12 - 12), "villePers", "adressPers", "loginPers",
//				"passwordPers", 12));
//		cr.save(new Client("sds", "jjj", new Date(1909 - 11 - 18), "villePers", "adressPers", "loginPers",
//				"passwordPers", 192));
//		pr.save(new Profile("administrateur"));
//		cs.create(new Client("sds", "jjj", new Date(1909 - 11 - 18), "villePers", "adressPers", "loginPers","passwordPers", pr.getOne((long) 1),76));
	}

}
