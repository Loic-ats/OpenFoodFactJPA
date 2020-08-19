package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Categories")

public class Categories {

	// id categories auto-incrementé
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOM", length = 250, nullable = false, unique = true)
	private String nomcat;

	// Constructeur sans arguement de l'entity categories
	public Categories() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nomcat;
	}

	public void setNom(String nom) {
		this.nomcat = nom;
	}

	@Override
	public String toString() {
		return "Categories [id=" + id + ", nom=" + nomcat + "]";
	}

}
