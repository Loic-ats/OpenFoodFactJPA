package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Marques")

public class Marques {

	// id marques auto-increment�
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id_Marques;

	@Column(name = "NOM", length = 250, nullable = false, unique = true)
	private String nommarq;
	
	@OneToMany (mappedBy = "marque")
	private List <Produit> listprod;  
	
	// Constructeur sans argumeent de l'entity marques
	public Marques() {
		// TODO Auto-generated constructor stub
	}
	
	public Marques(String nommarq) {
		super();
		this.nommarq = nommarq;
	}

	public int getId() {
		return id_Marques;
	}

	public void setId(int id) {
		this.id_Marques = id;
	}

	public String getNom() {
		return nommarq;
	}

	public void setNom(String nom) {
		this.nommarq = nom;
	}

	@Override
	public String toString() {
		return "Marques [id=" + id_Marques + ", nom=" + nommarq + "]";
	}

}
