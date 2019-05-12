package ma.projet.entity;

import javax.persistence.Entity;

@Entity
public class RepasPrincipale extends Repas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String compossition;
	private String infoRepas;

	public RepasPrincipale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RepasPrincipale(double prixRepas, int durreCuisson) {
		super(prixRepas, durreCuisson);
		// TODO Auto-generated constructor stub
	}

	public String getCompossition() {
		return compossition;
	}

	public void setCompossition(String compossition) {
		this.compossition = compossition;
	}

	public String getInfoRepas() {
		return infoRepas;
	}

	public void setInfoRepas(String infoRepas) {
		this.infoRepas = infoRepas;
	}

}
