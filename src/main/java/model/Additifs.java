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
@Table(name = "Additifs")

public class Additifs {

	// id additifs auto-increment�
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOM", length = 250, nullable = false, unique = true)
	private String nomadd;

	@OneToMany(mappedBy = "listadditif")
	private List<Produit> listproduit = new ArrayList<Produit>();

	// Constructeur sans arguement de l'entity Additifs
	public Additifs() {

	}
	
	

	public Additifs(String nomadd) {
		super();
		this.nomadd = nomadd;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomadd() {
		return nomadd;
	}

	public void setNomadd(String nomadd) {
		this.nomadd = nomadd;
	}

	@Override
	public String toString() {
		return "Additifs [id=" + id + ", nomadd=" + nomadd + "]";
	}

}
