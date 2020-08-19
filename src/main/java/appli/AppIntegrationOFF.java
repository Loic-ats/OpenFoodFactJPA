package appli;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import model.Additifs;
import model.Allergenes;
import model.Ingredients;
import model.Marques;
import traitementDao.DaoAdditifs;
import traitementDao.DaoAllergenes;
import traitementDao.DaoIngredients;
import traitementDao.DaoMarques;
import utils.CreationList;
import utils.SupDoublon;

public class AppIntegrationOFF {

	public static void main(String[] args) {

		// DaoMarques daomar = new DaoMarques();
		//DaoAllergenes daoall = new DaoAllergenes();
		//DaoAdditifs daoadd = new DaoAdditifs ();
		DaoIngredients daoing = new DaoIngredients ();
		

		try {
			File file = new File("E:\\Developpements\\Projets\\Donnees\\openFoodFacts.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");

			lignes.remove(0);

			for (String ligne : lignes) {

				String[] morceaux = ligne.split("\\|", -1);

				String categories = morceaux[0];
				String marques = morceaux[1];
				String produit = morceaux[2];
				String nutritionGradeFr = morceaux[3];
				String ingredient = morceaux[4];
				String energie100g = morceaux[5];
				String graisse100g = morceaux[6];
				String sucres100g = morceaux[7];
				String fibres100g = morceaux[8];
				String proteines100g = morceaux[9];
				String sel100g = morceaux[10];
				String vitA100g = morceaux[11];
				String vitD100g = morceaux[12];
				String vitE100g = morceaux[13];
				String vitK100g = morceaux[14];
				String vitC100g = morceaux[15];
				String vitB1100g = morceaux[16];
				String vitB2100g = morceaux[17];
				String vitPP100g = morceaux[18];
				String vitB6100g = morceaux[19];
				String vitB9100g = morceaux[20];
				String vitB12100g = morceaux[21];
				String calcium100g = morceaux[22];
				String magnesium100g = morceaux[23];
				String iron100g = morceaux[24];
				String fer100g = morceaux[25];
				String betaCarotene100g = morceaux[26];
				String presenceHuilePalme = morceaux[27];
				String Additif = morceaux[28];
				String Allergene = morceaux[29];

				// Marques m = new Marques();
				// daomar.insertMarques(m, marques);
				
				//Allergenes a = new Allergenes();
				//daoall.insertAllergene(a, Allergene);
				
				//Additifs add = new Additifs ();
				//daoadd.insertAdditifs(add, Additif);
				
				Ingredients ing = new Ingredients ();
				daoing.insertIngredient(ing, ingredient);


			}

			
			System.out.println("Nombre de lignes :" + lignes.size());

		} catch (IOException e) {

			System.out.println(e.getMessage());
		}

	}

	public AppIntegrationOFF() {
		// TODO Auto-generated constructor stub
	}

}
