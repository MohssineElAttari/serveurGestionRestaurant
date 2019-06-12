package ma.projet.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DE")
public class Dessert extends Repas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String type;
	private String info;

	public Dessert() {
		super();
	}

	public Dessert(double prix, int durreCuisson, String photo, String nom, String type, String info) {
		super(prix, durreCuisson, photo);
		this.nom = nom;
		this.type = type;
		this.info = info;
	}
	public Dessert(double prix, int durreCuisson, String nom, String type, String info) {
		super(prix, durreCuisson);
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
