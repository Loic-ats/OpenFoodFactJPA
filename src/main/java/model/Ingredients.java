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
@Table(name = "Ingredients")

public class Ingredients {

	// id ingredient auto-incrementé
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOM", length = 4000, nullable = false, unique = true)
	private String nomingr;

	@OneToMany(mappedBy = "listingredients")
	private List<Produit> listproduit = new ArrayList<Produit>();

	// Constructeur sans argument de l'entity ingredients
	public Ingredients() {

	}

	public Ingredients(String nomingr) {
		super();
		this.nomingr = nomingr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomingr() {
		return nomingr;
	}

	public void setNomingr(String nomingr) {
		this.nomingr = nomingr;
	}

	public List<Produit> getListproduit() {
		return listproduit;
	}

	public void setListproduit(List<Produit> listproduit) {
		this.listproduit = listproduit;
	}

	@Override
	public String toString() {
		return "Ingredients [id=" + id + ", nomingr=" + nomingr + "]";
	}

}
