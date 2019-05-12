package ma.projet.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CommandeClient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private CommandeClientId id;
	@JoinColumn(name = "repas", referencedColumnName = "idRepas", insertable = false, updatable = false)
	@ManyToOne
	private Repas repas;
	@JoinColumn(name = "commande", referencedColumnName = "idCommande", insertable = false, updatable = false)
	@ManyToOne
	private Commande commande;
	private int quantitie;

	public CommandeClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommandeClient(Repas repas, Commande commande, int quantitie) {
		super();
		this.repas = repas;
		this.commande = commande;
		this.quantitie = quantitie;
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

	public CommandeClientId getId() {
		return id;
	}

	public void setId(CommandeClientId id) {
		this.id = id;
	}

}
