package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreationList {

	public static List<String> ListCreator(String morceaux) {

		// On splitt le morceaux et on récupére une ArrayList

		List<String> alls = Arrays.asList(morceaux.split(",", -1));
		List<String> Listcreator = new ArrayList<String>();

		if (morceaux != null) {

			for (String nom : alls) {

				Listcreator.add(nom);
			}

		}

		return Listcreator;
	}
}
