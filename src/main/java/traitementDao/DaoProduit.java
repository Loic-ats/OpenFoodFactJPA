package traitementDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Produit;

public class DaoProduit {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("connection");

	public void insertProduits(Produit produits, String nom) {

		// On créer un canal de communication em en utilisant la factory

		EntityManager em = factory.createEntityManager();

		// Si le canal de communication est différent de nul on peut ajouter un livre
		if (em != null) {

			produits.setNomprod(nom);


			// J'ouvre une transaction avec la BDD via mon EntityManager
			em.getTransaction().begin();

			// J'ajoute dans la base mon nouveau livre
			em.persist(produits);

			// Je commite et je ferme la transaction, le cannal de communication et la
			// factory

			em.getTransaction().commit();
			// em.close();
			// factory.close();

		}

	}

}
