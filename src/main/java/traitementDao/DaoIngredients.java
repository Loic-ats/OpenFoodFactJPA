package traitementDao;

import java.util.List;
import javax.persistence.EntityManager;

import model.Ingredients;

public class DaoIngredients {

	public void insertIngredient(EntityManager em, List<Ingredients> listIngredients) {

		// Si le canal de communication est différent de nul on peut ajouter un livre
		if (em != null) {

			/**
			 *
			 * On parcours la liste avec une boucle for On ajoute chaque éléments au fur et
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
