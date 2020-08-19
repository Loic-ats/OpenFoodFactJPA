package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
			
	//Constructeur sans arguement de l'entity allergenes
	public Allergenes() {
		
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
