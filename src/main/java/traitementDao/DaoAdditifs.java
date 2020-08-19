package traitementDao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Additifs;
import utils.SupDoublon;

public class DaoAdditifs {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("connection");

	public void insertAdditifs(Additifs additifs, String morceaux) {

		// On créer un canal de communication em en utilisant la factory

		EntityManager em = factory.createEntityManager();

		// Si le canal de communication est différent de nul on peut ajouter un livre
		if (em != null) {

			// On splitt le morceaux récupérer afin de créer une ArrayList

			List<String> alls = Arrays.asList(morceaux.split(",", -1));
	
			/**
			 *
			 * On parcours la liste avec une boucle for On ajoute chaque éléments au fur et
			 * a mesure dans la BDD
			 * 
			 */

			for (String nomadditif : alls) {

				additifs.setNomadd(nomadditif);

			}

			// J'ouvre une transaction avec la BDD via mon EntityManager
			em.getTransaction().begin();

			// J'ajoute dans la base mon nouveau allergene
			em.persist(additifs);

			// On commite

			em.getTransaction().commit();

			// On ferme la transaction, le cannal de communication et la factory

			// em.close();
			// factory.close();

		}

	}
	

}
