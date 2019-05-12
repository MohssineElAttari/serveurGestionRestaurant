package ma.projet.entity;

import javax.persistence.Entity;

@Entity
public class Dessert extends Repas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomDessert;
	private String typeDess;
	private String infoDess;
	public Dessert() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dessert(double prixRepas, int durreCuisson) {
		super(prixRepas, durreCuisson);
		// TODO Auto-generated constructor stub
	}
	public String getNomDessert() {
		return nomDessert;
	}
	public void setNomDessert(String nomDessert) {
		this.nomDessert = nomDessert;
	}
	public String getTypeDess() {
		return typeDess;
	}
	public void setTypeDess(String typeDess) {
		this.typeDess = typeDess;
	}
	public String getInfoDess() {
		return infoDess;
	}
	public void setInfoDess(String infoDess) {
		this.infoDess = infoDess;
	}

}
