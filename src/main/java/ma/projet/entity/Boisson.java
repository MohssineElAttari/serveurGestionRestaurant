package ma.projet.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BO")
public class Boisson extends Repas {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String type;
	private String info;

	public Boisson() {
		super();
	}

	public Boisson(double prixRepas, int durreCuisson, String photo, String nom, String type, String info) {
		super(prixRepas, durreCuisson, photo);
		this.nom = nom;
		this.type = type;
		this.info = info;
	}
	
	public Boisson(double prixRepas, int durreCuisson, String nom, String type, String info) {
		super(prixRepas, durreCuisson);
		this.nom = nom;
		this.type = type;
		this.info = info;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
