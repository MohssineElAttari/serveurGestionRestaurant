package ma.projet.entity;

import javax.persistence.Entity;

@Entity
public class Boisson extends Repas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomBoisson;
	private String typeBois;
	private String infoBois;

	public Boisson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boisson(double prixRepas, int durreCuisson) {
		super(prixRepas, durreCuisson);
		// TODO Auto-generated constructor stub
	}

	public String getNomBoisson() {
		return nomBoisson;
	}

	public void setNomBoisson(String nomBoisson) {
		this.nomBoisson = nomBoisson;
	}

	public String getTypeBois() {
		return typeBois;
	}

	public void setTypeBois(String typeBois) {
		this.typeBois = typeBois;
	}

	public String getInfoBois() {
		return infoBois;
	}

	public void setInfoBois(String infoBois) {
		this.infoBois = infoBois;
	}

}
