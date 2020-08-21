package traitementDao;

import java.util.List;

import javax.persistence.EntityManager;
import model.Additifs;


public class DaoAdditifs {

	public void insertAdditif(EntityManager em, List<Additifs>listAdditif) {

		// Si le canal de communication est diff�rent de nul on peut ajouter un livre
		if (em != null) {

			/**
			 *
			 * On parcours la liste avec une boucle for On ajoute chaque �l�ments au fur et
			 * a mesure dans la BDD
			 * 
			 */

			for (Additifs additifs : listAdditif) {

				// J'ouvre une transaction avec la BDD via mon EntityManager
				em.getTransaction().begin();

				// J'ajoute dans la base mon nouveau allergene
				em.persist(additifs);

				// On commite

				em.getTransaction().commit();

			}

			// On ferme la transaction, le cannal de communication

			em.close();

		}

	}

}
