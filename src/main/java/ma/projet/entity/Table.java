package ma.projet.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Table implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int codeTable;

	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Table(int codeTable) {
		super();
		this.codeTable = codeTable;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCodeTable() {
		return codeTable;
	}

	public void setCodeTable(int codeTable) {
		this.codeTable = codeTable;
	}

}
