package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Marques")

public class Marques {

	// id marques auto-incrementé
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_marques;

	@Column(name = "NOM", length = 250, nullable = false, unique = true)
	private String nommarq;

	@ManyToOne (mappedBy = "id-categorie")
	private Produit produits;
	
	// Constructeur sans argumeent de l'entity marques
	public Marques() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id_marques;
	}

	public void setId(int id) {
		this.id_marques = id;
	}

	public String getNom() {
		return nommarq;
	}

	public void setNom(String nom) {
		this.nommarq = nom;
	}

	@Override
	public String toString() {
		return "Marques [id=" + id_marques + ", nom=" + nommarq + "]";
	}

}
