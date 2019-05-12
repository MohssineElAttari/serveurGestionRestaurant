package ma.projet.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Repas implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idRepas;
	private double prixRepas;
	private int durreCuisson;


	public Repas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Repas(double prixRepas, int durreCuisson) {
		super();
		this.prixRepas = prixRepas;
		this.durreCuisson = durreCuisson;
	}

	public Long getIdRepas() {
		return idRepas;
	}

	public void setIdRepas(Long idRepas) {
		this.idRepas = idRepas;
	}

	public double getPrixRepas() {
		return prixRepas;
	}

	public void setPrixRepas(double prixRepas) {
		this.prixRepas = prixRepas;
	}

	public int getDurreCuisson() {
		return durreCuisson;
	}

	public void setDurreCuisson(int durreCuisson) {
		this.durreCuisson = durreCuisson;
	}

}
