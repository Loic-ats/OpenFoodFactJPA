package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Allergenes")

public class Allergenes {

	// id allergenes auto-incrementé
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOM", length = 100, nullable = false, unique = true)
	private String nomall;

	@OneToMany(mappedBy = "listallergene")
	private List<Produit> listproduit = new ArrayList<Produit>();

	// Constructeur sans arguement de l'entity allergenes
	public Allergenes() {

	}

	public Allergenes(String nomall) {
		super();
		this.nomall = nomall;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomall() {
		return nomall;
	}

	public void setNomall(String nomall) {
		this.nomall = nomall;
	}

	@Override
	public String toString() {
		return "Allergenes [id=" + id + ", nomall=" + nomall + "]";
	}

}
