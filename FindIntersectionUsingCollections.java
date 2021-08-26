package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;

public class FindIntersectionUsingCollections {

	public static void main(String[] args) {
		String[] str1 = { "3", "2", "11", "4", "6", "7" };
		String[] str2 = { "1", "2", "8", "4", "9", "7" };

		// Find Intersection using List

		List<String> str1List = new ArrayList<String>(Arrays.asList(str1));
		List<String> str2List = new ArrayList<String>(Arrays.asList(str2));

		str1List.retainAll(str2List);
		System.out.println("Intersection elements using List : " + str1List);

		// Find Intersection Using Set

		Set<String> str1Set = new LinkedHashSet<String>();
		Set<String> str2Set = new LinkedHashSet<String>();
		Collections.addAll(str1Set, str1);
		Collections.addAll(str2Set, str2);
		str1Set.retainAll(str2Set);
		System.out.println("Intersection elements using Set : " + str1Set);

	}

}
