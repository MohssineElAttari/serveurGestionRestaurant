package ma.projet.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DiscriminatorValue("LI")
public class Livreur extends Personne {

	private static final long serialVersionUID = 1L;

	private String matricule;
//	@JsonIgnore
//	@OneToMany(cascade = CascadeType.MERGE, mappedBy = "livreur", fetch = FetchType.LAZY)
//	private List<Livraison> livraisons;

	public Livreur() {
		super();
	}

	public Livreur(String nom, String prenom, Date dateNais, String ville, String adress, String login, String password,
			String matricule) {
		super(nom, prenom, dateNais, ville, adress, login, password);
		this.matricule = matricule;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

//	public List<Livraison> getLivraisons() {
//		return livraisons;
//	}
//
//	public void setLivraisons(List<Livraison> livraisons) {
//		this.livraisons = livraisons;
//	}

}
