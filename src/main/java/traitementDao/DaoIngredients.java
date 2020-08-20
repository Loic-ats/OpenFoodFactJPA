package traitementDao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import model.Ingredients;

public class DaoIngredients {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("connection");
	
	public void insertIngredient(List<Ingredients> listIngredients) {

		// On cr�er un canal de communication em en utilisant la factory

		EntityManager em = factory.createEntityManager();

		// Si le canal de communication est diff�rent de nul on peut ajouter un livre
		if (em != null) {

			/**
			 *
			 * On parcours la liste avec une boucle for On ajoute chaque �l�ments au fur et
			 * a mesure dans la BDD
			 * 
			 */

			for (Ingredients ingredients : listIngredients) {

				// J'ouvre une transaction avec la BDD via mon EntityManager
				em.getTransaction().begin();

				// J'ajoute dans la base mon nouveau allergene
				em.persist(ingredients);

				// On commite

				em.getTransaction().commit();

			}

			// On ferme la transaction, le cannal de communication

			em.close();

		}

	}

}
