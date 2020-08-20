package utils;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.Additifs;
import model.Allergenes;
import model.Ingredients;
import model.Marques;
import model.Produit;

public class SupDoublon {

	public static List<Allergenes> SupprimDoublonAllergnes(List<String> listavecdoublon) {

		Set<String> mySet = new HashSet<String>();
		List<Allergenes> listeAllergenes = new ArrayList<Allergenes>();

		for (String ligneAllergeneParProduit : listavecdoublon) {

			String[] tableauDeMorceaux = ligneAllergeneParProduit.split(",", -1);

			for (int i = 0; i < tableauDeMorceaux.length; i++) {

				String all = tableauDeMorceaux[i];

				mySet.add(all);
			}
		}

		for (String nomAllergenes : mySet) {

			if (!nomAllergenes.isEmpty() || !nomAllergenes.isBlank()) {

				Allergenes allergenes = new Allergenes(nomAllergenes);

				listeAllergenes.add(allergenes);
			}

		}

		return listeAllergenes;

	}

	public static List<Ingredients> SupprimDoublonIngredients(List<String> listavecdoublon) {

		Set<String> mySet = new HashSet<String>();
		List<Ingredients> listeIngredients = new ArrayList<Ingredients>();

		for (String ligneIngredientsParProduit : listavecdoublon) {

			String[] tableauDeMorceaux = ligneIngredientsParProduit.split(",", -1);

			for (int i = 0; i < tableauDeMorceaux.length; i++) {

				String all = tableauDeMorceaux[i];

				mySet.add(all);
			}
		}

		for (String nomIngredients : mySet) {

			if (!nomIngredients.isEmpty() || !nomIngredients.isBlank()) {

				Ingredients ingredients = new Ingredients(nomIngredients);

				listeIngredients.add(ingredients);
			}

		}

		return listeIngredients;

	}

	public static List<Additifs> SupprimDoublonAdditifs(List<String> listavecdoublon) {

		Set<String> mySet = new HashSet<String>();
		List<Additifs> listeAdditifs = new ArrayList<Additifs>();

		for (String ligneAdditifsParProduit : listavecdoublon) {

			String[] tableauDeMorceaux = ligneAdditifsParProduit.split(",", -1);

			for (int i = 0; i < tableauDeMorceaux.length; i++) {

				String all = tableauDeMorceaux[i];

				mySet.add(all);
			}
		}

		for (String nomAdditifs : mySet) {

			if (!nomAdditifs.isEmpty() || !nomAdditifs.isBlank()) {

				Additifs additifs = new Additifs(nomAdditifs);

				listeAdditifs.add(additifs);
			}

		}

		return listeAdditifs;
	}
	
	public static List<Marques> SupprimDoublonMarques(List<String> listavecdoublon) {

		Set<String> mySet = new HashSet<String>();
		List<Marques> listeAdditifs = new ArrayList<Marques>();
		

			for (int i = 0; i < listavecdoublon.size(); i++) {

				String all = listavecdoublon.get(i);
				

				mySet.add(all);
			}

		for (String nomMarque : mySet) {

			if (!nomMarque.isEmpty() || !nomMarque.isBlank()) {

				Marques marques = new Marques(nomMarque);

				listeAdditifs.add(marques);
			}

		}

		return listeAdditifs;
	}

}