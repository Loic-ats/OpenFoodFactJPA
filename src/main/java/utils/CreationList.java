package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreationList {

	public static List<String> ListCreator(String morceaux) {

		// On splitt le morceaux récupérer afin de créer une ArrayList

		List<String> alls = Arrays.asList(morceaux.split(",", -1));
		List<String> Listcreator = new ArrayList<String>();

		/**
		 *
		 * On parcours la liste avec une boucle for On ajoute chaque éléments au fur et
		 * a mesure dans la BDD
		 * 
		 */

		for (String nomadditif : alls) {

			Listcreator.add(nomadditif);

		}

		return Listcreator;

	}

}
