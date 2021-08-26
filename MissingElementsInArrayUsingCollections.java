package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingElementsInArrayUsingCollections {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);

		// Missing elements Using List

		List<Integer> asList = new ArrayList<Integer>(Arrays.asList(arr));
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < arr.length; i++)
			list.add(i);

		list.removeAll(asList);
		System.out.println("Missing elements using List : " + list);

		// Missing elements Using Set

		Set<Integer> arrSet = new LinkedHashSet<Integer>();
		Set<Integer> arrSet1 = new LinkedHashSet<Integer>();

		Collections.addAll(arrSet, arr);
		for (int i = 1; i < arr.length; i++)
			arrSet1.add(i);

		arrSet1.removeAll(arrSet);
		System.out.println("Missing elements using Set : " + arrSet1);
	}

}
