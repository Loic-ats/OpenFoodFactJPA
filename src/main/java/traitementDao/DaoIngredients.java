package traitementDao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Ingredients;

public class DaoIngredients {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("connection");
	
	public void insertIngredient(Ingredients ingredients, String morceaux) {

		// On cr�er un canal de communication em en utilisant la factory

		EntityManager em = factory.createEntityManager();

		// Si le canal de communication est diff�rent de nul on peut ajouter un livre
		if (em != null) {

			// On splitt le morceaux r�cup�rer afin de cr�er une ArrayList

			List<String> alls = Arrays.asList(morceaux.split(",", -1));

			/**
			 *
			 * On parcours la liste avec une boucle for On ajoute chaque �l�ments au fur et
			 * a mesure dans la BDD
			 * 
			 */

			for (String nomingredients : alls) {

				ingredients.setNomingr(nomingredients);

			}

			// J'ouvre une transaction avec la BDD via mon EntityManager
			em.getTransaction().begin();

			// J'ajoute dans la base mon nouveau allergene
			em.persist(ingredients);

			// On commite

			em.getTransaction().commit();

			// On ferme la transaction, le cannal de communication et la factory

			// em.close();
			// factory.close();

		}

	}

}
