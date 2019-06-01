package ma.projet.entity;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CommandeClient {
	@EmbeddedId
	private CommandeClientId id;
	@JoinColumn(name = "repas", referencedColumnName = "id", insertable = false, updatable = false)
	@ManyToOne
	private Repas repas;
	@JoinColumn(name = "commande", referencedColumnName = "id", insertable = false, updatable = false)
	@ManyToOne
	private Commande commande;
	private int quantitie;
	@Temporal(TemporalType.DATE)
	private Date dateFin;

	public CommandeClient() {
		super();
	}

	public CommandeClient(CommandeClientId id, Repas repas, Commande commande, int quantitie, Date dateFin) {
		super();
		this.id = id;
		this.repas = repas;
		this.commande = commande;
		this.quantitie = quantitie;
		this.dateFin = dateFin;
	}

	public CommandeClientId getId() {
		return id;
	}

	public void setId(CommandeClientId id) {
		this.id = id;
	}

	public Repas getRepas() {
		return repas;
	}

	public void setRepas(Repas repas) {
		this.repas = repas;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public int getQuantitie() {
		return quantitie;
	}

	public void setQuantitie(int quantitie) {
		this.quantitie = quantitie;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
