package ma.projet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class CommandeClientId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long commande;
	private Long repas;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;

	public CommandeClientId() {
		super();
	}

	public CommandeClientId(Long commande, Long repas, Date dateDebut) {
		super();
		this.commande = commande;
		this.repas = repas;
		this.dateDebut = dateDebut;
	}

	public Long getCommande() {
		return commande;
	}

	public void setCommande(Long commande) {
		this.commande = commande;
	}

	public Long getRepas() {
		return repas;
	}

	public void setRepas(Long repas) {
		this.repas = repas;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

}
