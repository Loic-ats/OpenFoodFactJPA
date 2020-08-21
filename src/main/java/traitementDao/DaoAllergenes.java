package traitementDao;

import java.util.List;

import javax.persistence.EntityManager;
import model.Allergenes;

public class DaoAllergenes {

	public void insertAllergene(EntityManager em, List<Allergenes> listAllergenes) {

		// Si le canal de communication est différent de nul on peut ajouter un livre
		if (em != null) {

			/**
			 *
			 * On parcours la liste avec une boucle for On ajoute chaque éléments au fur et
			 * a mesure dans la BDD
			 * 
			 */

			for (Allergenes allergenes : listAllergenes) {

				// J'ouvre une transaction avec la BDD via mon EntityManager
				em.getTransaction().begin();

				// J'ajoute dans la base mon nouveau allergene
				em.persist(allergenes);

				// On commite

				em.getTransaction().commit();

			}

			// On ferme la transaction, le cannal de communication

			em.close();

		}

	}

}
