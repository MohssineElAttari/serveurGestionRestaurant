package ma.projet.entity;

import javax.persistence.Entity;

@Entity
public class Entree extends Repas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomEntree;
	private String typeEntr;
	private String infoEntr;

	public Entree() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entree(double prixRepas, int durreCuisson) {
		super(prixRepas, durreCuisson);
		// TODO Auto-generated constructor stub
	}

	public String getNomEntree() {
		return nomEntree;
	}

	public void setNomEntree(String nomEntree) {
		this.nomEntree = nomEntree;
	}

	public String getTypeEntr() {
		return typeEntr;
	}

	public void setTypeEntr(String typeEntr) {
		this.typeEntr = typeEntr;
	}

	public String getInfoEntr() {
		return infoEntr;
	}

	public void setInfoEntr(String infoEntr) {
		this.infoEntr = infoEntr;
	}

}
