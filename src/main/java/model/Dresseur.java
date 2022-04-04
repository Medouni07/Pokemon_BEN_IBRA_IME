package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dresseur database table.
 * 
 */
@Entity
@NamedQuery(name="Dresseur.findAll", query="SELECT d FROM Dresseur d")
public class Dresseur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(name="name_")
	private String name;

	private String ville;

	public Dresseur() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}