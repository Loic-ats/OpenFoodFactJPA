package utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SupDoublon {

	public static List<String> SupprimDoublon(List<String> listavecdoublon) {

		List<String> listsansdoublon = new ArrayList<String>();

		Set<String> mySet = new HashSet<String>(listavecdoublon);

		mySet.addAll(listavecdoublon);

		listsansdoublon = new ArrayList<String>(mySet);

		return listsansdoublon;

	}

}