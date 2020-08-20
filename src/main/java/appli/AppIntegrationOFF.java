package appli;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
import utils.ConversionDouble;
import utils.CreationList;
import utils.SupDoublon;

public class AppIntegrationOFF {

	public static void main(String[] args) {

		DaoAllergenes daoAll = new DaoAllergenes();
		DaoAdditifs daoadd = new DaoAdditifs();
		DaoIngredients daoing = new DaoIngredients();
		// DaoCategories daocat = new DaoCategories();
		DaoMarques daomar = new DaoMarques();
		// DaoProduit daoprod = new DaoProduit();

		List<String> listAllergene = new ArrayList<String>();
		List<String> listAdditifs = new ArrayList<String>();
		List<String> listIngredient = new ArrayList<String>();
		List<String> listMarque = new ArrayList<String>();

		try {
			File file = new File("E:\\Developpements\\Projets\\Donnees\\openFoodFacts.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");

			lignes.remove(0);

			for (String ligne : lignes) {

				String[] morceaux = ligne.split("\\|", -1);

				String categories = morceaux[0];
				String marques = morceaux[1];
				String produit = morceaux[2];
				String gradenutri = morceaux[3];
				String ingredient = morceaux[4];

				double energie = ConversionDouble.stringToDouble(morceaux[5]);
				double graisse = ConversionDouble.stringToDouble(morceaux[6]);
				double sucre = ConversionDouble.stringToDouble(morceaux[7]);
				double proteines = ConversionDouble.stringToDouble(morceaux[9]);
				double fibres100g = ConversionDouble.stringToDouble(morceaux[8]);
				double sel100g = ConversionDouble.stringToDouble(morceaux[10]);
				double vitA100g = ConversionDouble.stringToDouble(morceaux[11]);
				double vitD100g = ConversionDouble.stringToDouble(morceaux[12]);
				double vitE100g = ConversionDouble.stringToDouble(morceaux[13]);
				double vitK100g = ConversionDouble.stringToDouble(morceaux[14]);
				double vitC100g = ConversionDouble.stringToDouble(morceaux[15]);
				double vitB1100g = ConversionDouble.stringToDouble(morceaux[16]);
				double vitB2100g = ConversionDouble.stringToDouble(morceaux[17]);
				double vitPP100g = ConversionDouble.stringToDouble(morceaux[18]);
				double vitB6100g = ConversionDouble.stringToDouble(morceaux[19]);
				double vitB9100g = ConversionDouble.stringToDouble(morceaux[20]);
				double vitB12100g = ConversionDouble.stringToDouble(morceaux[21]);
				double calcium100g = ConversionDouble.stringToDouble(morceaux[22]);
				double magnesium100g = ConversionDouble.stringToDouble(morceaux[23]);
				double iron100g = ConversionDouble.stringToDouble(morceaux[24]);
				double fer100g = ConversionDouble.stringToDouble(morceaux[25]);
				double betaCarotene100g = ConversionDouble.stringToDouble(morceaux[26]);
				double presenceHuilePalme = ConversionDouble.stringToDouble(morceaux[27]);
				String Additif = morceaux[28];
				String Allergene = morceaux[29];

				// Additifs add = new Additifs ();
				// daoadd.insertAdditifs(add, Additif);

				// Ingredients ing = new Ingredients ();
				// daoing.insertIngredient(ing, ingredient);

				// Marques m = new Marques();
				// daomar.insertMarques(m, marques);

				// Categories c = new Categories();
				// daocat.insertCategories(c, categories);

				// Produit p = new Produit ();
				// daoprod.insertProduits(p, produit);

				listAllergene.add(Allergene);
				listAdditifs.add(Additif);
				listIngredient.add(ingredient);
				listMarque.add(marques);
			}

			// List<Allergenes> listSansDoublon =
			// SupDoublon.SupprimDoublonAllergnes(listAllergene);
			// daoAll.insertAllergene(listSansDoublon);

			//List<Additifs> listSansDoublonAdditifs = SupDoublon.SupprimDoublonAdditifs(listAdditifs);
			//daoadd.insertAdditif(listSansDoublonAdditifs);

			// List<Ingredients> listSansDoublonIngredient =
			// SupDoublon.SupprimDoublonIngredients(listIngredient);
			// daoing.insertIngredient(listSansDoublonIngredient);
			
			List<Marques> listSansDoublonMarques = SupDoublon.SupprimDoublonMarques(listMarque);
			daomar.insertMarque(listSansDoublonMarques);

			// System.out.println("Nombre de lignes :" + lignes.size());

		} catch (IOException e) {

			System.out.println(e.getMessage());
		}

	}

	public AppIntegrationOFF() {
		// TODO Auto-generated constructor stub
	}

}
