package traitementDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Marques;

public class DaoMarques {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("connection");

	public void insertMarques(Marques marques, String morceaux) {

		// On cr�er un canal de communication em en utilisant la factory

		EntityManager em = factory.createEntityManager();

		// Si le canal de communication est diff�rent de nul on peut ajouter un livre
		if (em != null) {

			marques.setNom(morceaux);
			
			// J'ouvre une transaction avec la BDD via mon EntityManager
			em.getTransaction().begin();

			// J'ajoute dans la base mon nouveau livre
			em.persist(marques);

			// Je commite et je ferme la transaction, le cannal de communication et la
			// factory

			em.getTransaction().commit();
			//em.close();
			//factory.close();

		}

	}
	
}
