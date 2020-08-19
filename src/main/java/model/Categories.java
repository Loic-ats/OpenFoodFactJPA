package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Categories")

public class Categories {

	// id categories auto-incrementé
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Categorie;

	@Column(name = "NOM", length = 250, nullable = false, unique = true)
	private String nomcat;
	
	@ManyToOne (mappedBy = "id-categorie")
	private Produit produits;
	
	// Constructeur sans arguement de l'entity categories
	public Categories() {

	}

	public int getId() {
		return id_Categorie;
	}

	public void setId(int id) {
		this.id_Categorie = id;
	}

	public String getNom() {
		return nomcat;
	}

	public void setNom(String nom) {
		this.nomcat = nom;
	}

	@Override
	public String toString() {
		return "Categories [id=" + id_Categorie + ", nom=" + nomcat + "]";
	}

}
