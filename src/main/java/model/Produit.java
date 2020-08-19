package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Produit")
public class Produit {

	// id produit auto-incrementé
	//Générer getter/setter et to string
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOM", length = 300, nullable = false, unique = true)
	private String nomprod;
	
	@Column(name = "id_cat", length = 300, nullable = false, unique = true)
	private Categories id_categorie;
	
	@Column(name = "id_mar", length = 300, nullable = false, unique = true)
	private Marques id_marque;

	@Column(name = "GRADENUTRI", length = 100, nullable = true, unique = true)
	private String gradenutri;

	@Column(name = "ENERGIE100g", length = 100, nullable = true, unique = true)
	private double energie;

	@Column(name = "GRAISSE100g", length = 100, nullable = true, unique = true)
	private double graisse;

	@Column(name = "SUCRE100g", length = 100, nullable = true, unique = true)
	private double sucre;

	@Column(name = "FIBRES100g", length = 100, nullable = true, unique = true)
	private double fibres;

	@Column(name = "PROTEINES100g", length = 100, nullable = true, unique = true)
	private double proteines;

	@Column(name = "SEL100g", length = 100, nullable = true, unique = true)
	private double sel;

	@Column(name = "VITA100g", length = 100, nullable = true, unique = true)
	private double vitA;

	@Column(name = "VITD100g", length = 100, nullable = true, unique = true)
	private double vitD;

	@Column(name = "VITE100g", length = 100, nullable = true, unique = true)
	private double vitE;

	@Column(name = "VITK100g", length = 100, nullable = true, unique = true)
	private double vitK;

	@Column(name = "VITC100g", length = 100, nullable = true, unique = true)
	private double vitC;

	@Column(name = "VITB1100g", length = 100, nullable = true, unique = true)
	private double vitB1;

	@Column(name = "VITB200g", length = 100, nullable = true, unique = true)
	private double vitB2;

	@Column(name = "VITPP100g", length = 100, nullable = true, unique = true)
	private double vitPP;

	@Column(name = "VITB6100g", length = 100, nullable = true, unique = true)
	private double vitB6;

	@Column(name = "VITB9100g", length = 100, nullable = true, unique = true)
	private double vitB9;

	@Column(name = "VITB12100g", length = 100, nullable = true, unique = true)
	private double vitB12;

	@Column(name = "CALCIUM100g", length = 100, nullable = true, unique = true)
	private double calcium;

	@Column(name = "MAGNESIUM100g", length = 100, nullable = true, unique = true)
	private double magnesium;

	@Column(name = "IRON100g", length = 100, nullable = true, unique = true)
	private double iron;

	@Column(name = "FER100g", length = 100, nullable = true, unique = true)
	private double fer;

	@Column(name = "BETACAROTENE100g", length = 100, nullable = true, unique = true)
	private double betacarotene;

	@Column(name = "PRESENCEHUILEDEPALME", length = 100, nullable = true, unique = true)
	private String presencehuiledepalme;

	// Constructeur sans parametre de l'entity produit
	public Produit() {

	}

}
