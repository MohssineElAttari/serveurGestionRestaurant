package ma.projet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class CommandeClientId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long commande;
	private Long repas;
	@Temporal(TemporalType.DATE)
	private Date dateFin;

	public CommandeClientId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommandeClientId(Long commande, Long repas, Date dateFin) {
		super();
		this.commande = commande;
		this.repas = repas;
		this.dateFin = dateFin;
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

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
