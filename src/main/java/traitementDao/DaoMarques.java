package traitementDao;
import java.util.List;
import javax.persistence.EntityManager;

import model.Marques;

public class DaoMarques {

	public void insertMarque(EntityManager em, List<Marques> listMarques) {


		// On créer un canal de communication em en utilisant la factory

		// Si le canal de communication est différent de nul on peut ajouter un livre
		if (em != null) {

			/**
			 *
			 * On parcours la liste avec une boucle for On ajoute chaque éléments au fur et
			 * a mesure dans la BDD
			 * 
			 */

			for (Marques marques : listMarques) {

				// J'ouvre une transaction avec la BDD via mon EntityManager
				em.getTransaction().begin();

				// J'ajoute dans la base mon nouveau allergene
				em.persist(marques);

				// On commite

				em.getTransaction().commit();

			}

			// On ferme la transaction, le cannal de communication

			em.close();

			
		}

	
	}

}
