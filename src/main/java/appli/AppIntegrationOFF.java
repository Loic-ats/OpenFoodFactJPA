package appli;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.apache.commons.io.FileUtils;

import model.Additifs;
import model.Allergenes;
import model.Categories;
import model.Ingredients;
import model.Marques;
import model.Produit;
import traitementDao.DaoAdditifs;
import traitementDao.DaoAllergenes;
import traitementDao.DaoCategories;
import traitementDao.DaoIngredients;
import traitementDao.DaoMarques;
import traitementDao.DaoProduit;
import utils.ComBBD;
import utils.ConversionDouble;
import utils.CreationList;
import utils.SupDoublon;

public class AppIntegrationOFF {

	public static void main(String[] args) {

		// DaoAllergenes daoAll = new DaoAllergenes();
		// DaoAdditifs daoadd = new DaoAdditifs();
		// DaoIngredients daoing = new DaoIngredients();
		// DaoCategories daocat = new DaoCategories();
		// DaoMarques daomar = new DaoMarques();
		DaoProduit daoprod = new DaoProduit();

		List<String> listAllergene = new ArrayList<String>();
		List<String> listAdditifs = new ArrayList<String>();
		List<String> listIngredient = new ArrayList<String>();
		List<String> listMarque = new ArrayList<String>();
		List<String> listCategorie = new ArrayList<String>();
		List<Produit> listProduit = new ArrayList<Produit>();

		try {
			File file = new File("E:\\Developpements\\Projets\\Donnees\\openFoodFacts.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			EntityManager em = ComBBD.getConnection();

			lignes.remove(0);

			for (String ligne : lignes) {

				Produit produit = new Produit();
				Marques marque = new Marques();
				Categories categorie = new Categories();

				String[] morceaux = ligne.split("\\|", -1);
				
				categorie.setNom(morceaux[0]);
				marque.setNom(morceaux[1]);

				em.getTransaction().begin();
				TypedQuery<Marques> q = em.createQuery("SELECT m FROM Marques m WHERE m.nommarq = :nom", Marques.class);
				q.setParameter("nom", marque.getNom());
				if (q.getResultList().isEmpty() == true)
					em.merge(marque);

				TypedQuery<Categories> q1 = em.createQuery("SELECT c FROM Categories c WHERE c.nomcat = :nom",Categories.class);
				q1.setParameter("nom", categorie.getNom());
				if (q1.getResultList().isEmpty() == true)
					em.merge(categorie);

				em.getTransaction().commit();

				produit.setNomprod(morceaux[2]);
				produit.setMarque(marque);
				produit.setCategorie(categorie);
				produit.setGradenutri(morceaux[3]);
				produit.setEnergie(ConversionDouble.stringToDouble(morceaux[5]));
				produit.setGraisse(ConversionDouble.stringToDouble(morceaux[6]));
				produit.setSucre(ConversionDouble.stringToDouble(morceaux[7]));
				produit.setProteines(ConversionDouble.stringToDouble(morceaux[9]));
				produit.setFibres(ConversionDouble.stringToDouble(morceaux[8]));
				produit.setSel(ConversionDouble.stringToDouble(morceaux[10]));
				produit.setVitA(ConversionDouble.stringToDouble(morceaux[11]));
				produit.setVitD(ConversionDouble.stringToDouble(morceaux[12]));
				produit.setVitE(ConversionDouble.stringToDouble(morceaux[13]));
				produit.setVitK(ConversionDouble.stringToDouble(morceaux[14]));
				produit.setVitC(ConversionDouble.stringToDouble(morceaux[15]));
				produit.setVitB1(ConversionDouble.stringToDouble(morceaux[16]));
				produit.setVitB2(ConversionDouble.stringToDouble(morceaux[17]));
				produit.setVitPP(ConversionDouble.stringToDouble(morceaux[18]));
				produit.setVitB6(ConversionDouble.stringToDouble(morceaux[19]));
				produit.setVitB9(ConversionDouble.stringToDouble(morceaux[20]));
				produit.setVitB12(ConversionDouble.stringToDouble(morceaux[21]));
				produit.setCalcium(ConversionDouble.stringToDouble(morceaux[22]));
				produit.setMagnesium(ConversionDouble.stringToDouble(morceaux[23]));
				produit.setIron(ConversionDouble.stringToDouble(morceaux[24]));
				produit.setFer(ConversionDouble.stringToDouble(morceaux[25]));
				produit.setBetacarotene(ConversionDouble.stringToDouble(morceaux[26]));
				produit.setPresencehuiledepalme(morceaux[27]);

				listAdditifs.add(morceaux[28]);
				List<Additifs> listSansDoublonAdditifs = SupDoublon.SupprimDoublonAdditifs(listAdditifs);
				for (Additifs a : listSansDoublonAdditifs) {
					produit.getListadditif().add(a);
				}

				listAllergene.add(morceaux[29]);
				List<Allergenes> listSansDoublon = SupDoublon.SupprimDoublonAllergnes(listAllergene);
				for (Allergenes a : listSansDoublon) {
					produit.getListallergene().add(a);
				}

				listIngredient.add(morceaux[4]);
				List<Ingredients> listSansDoublonIngredient = SupDoublon.SupprimDoublonIngredients(listIngredient);
				for (Ingredients a : listSansDoublonIngredient) {
					produit.getListingredients().add(a);
				}

				
				em.getTransaction().begin();
				em.persist(produit);
				em.getTransaction().commit();

				listIngredient.clear();
				listAdditifs.clear();
				listAllergene.clear();

			}
			
			em.close();

		} catch (IOException e) {

			System.out.println(e.getMessage());
		}

	}


}
