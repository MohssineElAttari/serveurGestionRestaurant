package ma.projet.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RP")
public class RepasPrincipale extends Repas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String compossition;
	private String info;

	public RepasPrincipale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RepasPrincipale(double prix, int durreCuisson, String photo, String compossition, String info) {
		super(prix, durreCuisson, photo);
		this.compossition = compossition;
		this.info = info;
	}

	public String getCompossition() {
		return compossition;
	}

	public void setCompossition(String compossition) {
		this.compossition = compossition;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
