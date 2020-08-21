package traitementDao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Produit;

public class DaoProduit {


	public void insertProduit(EntityManager em, List<Produit> listproduits) {
		
		// On cr�er un canal de communication em en utilisant la factory

		// Si le canal de communication est diff�rent de nul on peut ajouter un livre
		if (em != null) {

			/**
			 *
			 * On parcours la liste avec une boucle for On ajoute chaque �l�ments au fur et
			 * a mesure dans la BDD
			 * 
			 */

			for (Produit produits : listproduits) {
				
				// J'ouvre une transaction avec la BDD via mon EntityManager
				em.getTransaction().begin();


				// J'ajoute dans la base mon nouveau produit
				System.out.println(produits.getMarque().getNom());
				System.out.println(produits.getCategorie().getNom());
				em.persist(produits);

				// On commite

				em.getTransaction().commit();

			}

			// On ferme la transaction, le cannal de communication

			em.close();

		}

	}

}
