package ma.projet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Personne implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nomPers;
	private String prenomPers;
	@Temporal(TemporalType.DATE)
	private Date dateNaisPers;
	private String villePers;
	private String adressPers;
	private String LoginPers;
	private String passwordPers;
	@ManyToOne
	private Profile profile;

	public Personne(String nomPers, String prenomPers, Date dateNaisPers, String villePers, String adressPers,
			String loginPers, String passwordPers, Profile profile) {
		super();
		this.nomPers = nomPers;
		this.prenomPers = prenomPers;
		this.dateNaisPers = dateNaisPers;
		this.villePers = villePers;
		this.adressPers = adressPers;
		LoginPers = loginPers;
		this.passwordPers = passwordPers;
		this.profile = profile;
	}

	public Personne(String nomPers, String prenomPers, Date dateNaisPers, String villePers, String adressPers,
			String loginPers, String passwordPers) {
		super();
		this.nomPers = nomPers;
		this.prenomPers = prenomPers;
		this.dateNaisPers = dateNaisPers;
		this.villePers = villePers;
		this.adressPers = adressPers;
		LoginPers = loginPers;
		this.passwordPers = passwordPers;
	}

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdPers() {
		return id;
	}

	public void setIdPers(Long idPers) {
		this.id = idPers;
	}

	public String getNomPers() {
		return nomPers;
	}

	public void setNomPers(String nomPers) {
		this.nomPers = nomPers;
	}

	public String getPrenomPers() {
		return prenomPers;
	}

	public void setPrenomPers(String prenomPers) {
		this.prenomPers = prenomPers;
	}

	public Date getDateNaisPers() {
		return dateNaisPers;
	}

	public void setDateNaisPers(Date dateNaisPers) {
		this.dateNaisPers = dateNaisPers;
	}

	public String getVillePers() {
		return villePers;
	}

	public void setVillePers(String villePers) {
		this.villePers = villePers;
	}

	public String getAdressPers() {
		return adressPers;
	}

	public void setAdressPers(String adressPers) {
		this.adressPers = adressPers;
	}

	public String getLoginPers() {
		return LoginPers;
	}

	public void setLoginPers(String loginPers) {
		LoginPers = loginPers;
	}

	public String getPasswordPers() {
		return passwordPers;
	}

	public void setPasswordPers(String passwordPers) {
		this.passwordPers = passwordPers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}
